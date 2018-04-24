package com.residentevil.redbg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.residentevil.redbg.cards.MainCharacter;
import com.residentievil.utilities.*;

public class Game {

	private List<Player> _activePlayers;
	private GameMode _mode;
	
	public Game() {
		this._activePlayers = new ArrayList<Player>();
		this._mode = new GameMode();
	}

	public Game(List<Player> _activePlayers, GameMode _mode) {
		this._activePlayers = _activePlayers;
		this._mode = _mode;
	}

	public List<Player> get_activePlayers() {
		return _activePlayers;
	}

	public void set_activePlayers(List<Player> _activePlayers) {
		this._activePlayers = _activePlayers;
	}

	public GameMode get_mode() {
		return _mode;
	}

	public void set_mode(GameMode _mode) {
		this._mode = _mode;
	}

	public void assignCharactersToPlayers(int playersNumber) {
		if(playersNumber > Constants.MAX_PLAYERS || playersNumber < 0) {
			playersNumber = Constants.MAX_PLAYERS;
		}
		
		for (int i = 1; i < playersNumber; i++) {
			MainCharacter character = this.get_mode().get_assignCharactersOrder().get(i);
			Player player = new Player(i, "Player " + i, 0, 0, 0, character, 0, new PlayerBoard());
			this._activePlayers.add(player);
		}
		
		for(int i = 0; i < this.get_activePlayers().size(); i++) {
			System.out.println("ID: " + this.get_activePlayers().get(i).get_id() 
					+ " NAME: " + this.get_activePlayers().get(i).get_name() 
					+ " ORDER: " + this.get_activePlayers().get(i).get_turnOrder()
					+ " CHAR: " + this.get_activePlayers().get(i).get_assignedCharacter().get_name());
		}
	}
	
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
}
