package com.residentevil.redbg;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.residentevil.redbg.cards.Card;
import com.residentevil.redbg.cards.MainCharacter;
import com.residentievil.utilities.Constants;
import com.residentievil.utilities.Shared;

public class Scenario {
	private Map<Integer, Player> _activePlayers;
	private Map<Integer, Player> _activePlayersMirror;
	
	private Map<Integer, Pile> _pilesOrder;
	
	private Map<Integer, Card> _mansionList;
	private Map<Integer, Card> _mansionListMirror;

	private Map<Integer, MainCharacter> _assignCharactersOrder;
	
	public Scenario()
	{
		
	}

	public Map<Integer, Player> get_activePlayers() {
		return _activePlayers;
	}

	public void set_activePlayers(Map<Integer, Player> _activePlayers) {
		this._activePlayers = _activePlayers;
	}
	
	public Map<Integer, Pile> get_pilesOrder() {
		return _pilesOrder;
	}

	public void set_pilesOrder(Map<Integer, Pile> _pilesOrder) {
		this._pilesOrder = _pilesOrder;
	}

	public Map<Integer, Card> get_mansionList() {
		return _mansionList;
	}

	public void set_mansionList(Map<Integer, Card> _mansionList) {
		this._mansionList = _mansionList;
	}

	public Map<Integer, MainCharacter> get_assignCharactersOrder() {
		return _assignCharactersOrder;
	}

	public void set_assignCharactersOrder(Map<Integer, MainCharacter> _assignCharactersOrder) {
		this._assignCharactersOrder = _assignCharactersOrder;
	}

	public Map<Integer, Player> get_activePlayersMirror() {
		return _activePlayersMirror;
	}

	public void set_activePlayersMirror(Map<Integer, Player> _activePlayersMirror) {
		this._activePlayersMirror = _activePlayersMirror;
	}

	public Map<Integer, Card> get_mansionListMirror() {
		return _mansionListMirror;
	}

	public void set_mansionListMirror(Map<Integer, Card> _mansionListMirror) {
		this._mansionListMirror = _mansionListMirror;
	}

	//Ordena aleatoriamente los personajes
	public void sortCharacters(List<MainCharacter> _charactersList) {
		int charsCount = _charactersList.size();
		List<Integer> arrayList = Shared.generateRandomNumbersList(charsCount);
		Map<Integer, MainCharacter> tempCardList = new HashMap<>();
		
		for (int i = 0; i < charsCount; i++) {
			// Hace falta agregar otra lista donde estén el total de cartas permitidas
			tempCardList.put(arrayList.get(i), _charactersList.get(i));
		}

		//this._assignOrder.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v.get_name()));
		this.set_assignCharactersOrder(tempCardList);
	}

	//Obtiene los personajes ordenados aleatoriamente y en ese orden los asigna a los jugadores
	public void assignCharactersToPlayers(int playersNumber, Map<Integer, MainCharacter> _mapCharactersOrder) {
		if(playersNumber > Constants.MAX_PLAYERS) {
			playersNumber = Constants.MAX_PLAYERS;
		}else if(playersNumber < 1) {
			playersNumber = 1;
		}
		
		List<Integer> arrayList = Shared.generateRandomNumbersList(playersNumber);
		
		for (int i = 1; i < playersNumber; i++) {
			MainCharacter character = _mapCharactersOrder.get(i);
			Player player = new Player(i, "Player " + i, 0, 0, 0, character, new PlayerBoard());
			this._activePlayers.put(arrayList.get(i-1), player);
		}
		/*
		for(int i = 0; i < this.get_activePlayers().size(); i++) {
			System.out.println("ID: " + this.get_activePlayers().get(i).get_id() 
					+ " NAME: " + this.get_activePlayers().get(i).get_name() 
					+ " CHAR: " + this.get_activePlayers().get(i).get_assignedCharacter().get_name());
		}*/
	}
	
	/*
	public void sortTurns() {
		int countPlayers = this.get_activePlayers().size();
		
		if (countPlayers > 1) {
			List<Integer> arrayList = new ArrayList<Integer>();
			
			boolean finish = false, numberFree = false;
			int assignedNumers = 0;
			
			Random r = new Random();
			int result = r.nextInt(countPlayers) + 1;
			
			arrayList.add(result);
			assignedNumers++;
			
			do {
				result = r.nextInt(countPlayers) + 1;
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
			}while(!finish && assignedNumers < countPlayers);
			
			for (int i = 0; i < countPlayers; i++) {
				this.get_activePlayers().get(i).set_turnOrder(arrayList.get(i));
			}
			
			for(int i = 0; i < this.get_activePlayers().size(); i++) {
				System.out.println("ID: " + this.get_activePlayers().get(i).get_id() 
						+ " NAME: " + this.get_activePlayers().get(i).get_name() 
						+ " ORDER: " + this.get_activePlayers().get(i).get_turnOrder()
						+ " CHAR: " + this.get_activePlayers().get(i).get_assignedCharacter().get_name());
			}
		}
	}
	*/
	
	// Metodo para inicializar la configuracion de la Mansion
	public void sortMansion(List<Card> _mansionList) {
		int charsCount = _mansionList.size();
		List<Integer> arrayList = Shared.generateRandomNumbersList(charsCount);
		Map<Integer, Card> tempCardList = new HashMap<>();
		
		for (int i = 0; i < charsCount; i++) {
			// Hace falta agregar otra lista donde estén el total de cartas permitidas
			tempCardList.put(arrayList.get(i), _mansionList.get(i));
		}

		//this._assignOrder.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v.get_name()));
		this.set_mansionList(tempCardList);
	}
	// Metodo para inicializar la configuracion de los recursos
}
