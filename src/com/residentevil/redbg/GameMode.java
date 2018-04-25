package com.residentevil.redbg;

import java.util.List;

import com.residentevil.redbg.cards.Action;
import com.residentevil.redbg.cards.Ammo;
import com.residentevil.redbg.cards.Infected;
import com.residentevil.redbg.cards.MainCharacter;
import com.residentevil.redbg.cards.Token;
import com.residentevil.redbg.cards.Weapon;

//Define las reglas
public class GameMode {
	
	private String _name;
	private List<MainCharacter> _allowedCharacters;
	private List<Action> _allowedActions;
	private List<Ammo> _allowedAmmo;
	private List<Infected> _allowedInfecteds;
	private List<Token> _allowedTokens;
	private List<Weapon> _allowedWeapons;
	
	public GameMode() {
		/*this._name = "";
		this._allowedCharacters = new ArrayList<MainCharacter>();
		this._assignOrder = new HashMap<>();*/
	}
	
	public GameMode(String _name, List<MainCharacter> _allowedCharacters, List<Action> _allowedActions) {
		this._name = _name;
		this._allowedCharacters = _allowedCharacters;
		this._allowedActions = _allowedActions;
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

	public List<Action> get_allowedActions() {
		return _allowedActions;
	}

	public void set_allowedActions(List<Action> _allowedActions) {
		this._allowedActions = _allowedActions;
	}

	public List<Ammo> get_allowedAmmo() {
		return _allowedAmmo;
	}

	public void set_allowedAmmo(List<Ammo> _allowedAmmo) {
		this._allowedAmmo = _allowedAmmo;
	}

	public List<Infected> get_allowedInfecteds() {
		return _allowedInfecteds;
	}

	public void set_allowedInfecteds(List<Infected> _allowedInfecteds) {
		this._allowedInfecteds = _allowedInfecteds;
	}

	public List<Token> get_allowedTokens() {
		return _allowedTokens;
	}

	public void set_allowedTokens(List<Token> _allowedTokens) {
		this._allowedTokens = _allowedTokens;
	}

	public List<Weapon> get_allowedWeapons() {
		return _allowedWeapons;
	}

	public void set_allowedWeapons(List<Weapon> _allowedWeapons) {
		this._allowedWeapons = _allowedWeapons;
	}

/*
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
		
		this._assignCharactersOrder = new HashMap<>();
		
		for (int i = 0; i < charsCount; i++) {
			this._assignCharactersOrder.put(arrayList.get(i), this.get_allowedCharacters().get(i));
		}

		//this._assignOrder.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v.get_name()));
		
	}
*/


}
