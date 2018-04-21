package com.residentevil.redbg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class GameMode {
	
	private String _name;
	private List<MainCharacter> _allowedCharacters; 
	private Map<Integer, MainCharacter> _assignOrder;
	
	public GameMode() {
		/*this._name = "";
		this._allowedCharacters = new ArrayList<MainCharacter>();
		this._assignOrder = new HashMap<>();*/
	}

	public GameMode(String _name, List<MainCharacter> _allowedCharacters, Map<Integer, MainCharacter> _assignOrder) {
		this._name = _name;
		this._allowedCharacters = _allowedCharacters;
		this._assignOrder = _assignOrder;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public List<MainCharacter> get_allowedCharacters() {
		return _allowedCharacters;
	}

	public void set_allowedCharacters(List<MainCharacter> _allowedCharacters) {
		this._allowedCharacters = _allowedCharacters;
	}

	public Map<Integer, MainCharacter> get_assignOrder() {
		return _assignOrder;
	}

	public void set_assignOrder(Map<Integer, MainCharacter> _assignOrder) {
		this._assignOrder = _assignOrder;
	}

	public void sortCharacters() {
		
		int charsCount = this.get_allowedCharacters().size();
		List<Integer> arrayList = new ArrayList<Integer>();
		
		boolean finish = false, numberFree = false;
		int assignedNumers = 0;
		
		Random r = new Random();
		int result = r.nextInt(charsCount) + 1;
		
		arrayList.add(result);
		assignedNumers++;
		
		do {
			result = r.nextInt(charsCount) + 1;
			for (Integer number : arrayList) {
				if(result == number) {
					numberFree = false;
					break;
				}else {
					numberFree = true;
				}
			}
			if(numberFree) {
				arrayList.add(result);
				assignedNumers++;
			}
		}while(!finish && assignedNumers < charsCount);
		
		this._assignOrder = new HashMap<>();
		
		for (int i = 0; i < charsCount; i++) {
			this._assignOrder.put(arrayList.get(i), this.get_allowedCharacters().get(i));
			//System.out.println(order);
		}

		//this._assignOrder.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v.get_name()));
		
		
	}

}
