package com.residentevil.mockups;

import java.util.ArrayList;
import java.util.List;

import com.residentevil.redbg.Preload;
import com.residentevil.redbg.cards.Card;
import com.residentevil.redbg.cards.MainCharacter;
import com.residentievil.utilities.Shared;

public class Mockup {

	public static void main(String[] args) {
		Preload.initializeCards();
		/*List<MainCharacter> charsList = charsMockup();
		
		List<Player> playerList = new ArrayList<Player>();
		
		int playerNumber = 2;
		
		GameMode mode = new GameMode("HISTORY MODE", charsList, null);
		mode.sortCharacters();

		Game game = new Game();
		game.set_mode(mode);
		game.assignCharactersToPlayers(playerNumber);
		System.out.println("------------------------------------------");
		game.sortTurns();*/
	}

	public static void mappingTest() {
		Card c = new Card("CH-001", "CHARACTER", "ALBERT WESKER");
		MainCharacter m = (MainCharacter) Shared.getCardObject("MainCharacter",c);
		System.out.println(m.get_code() + " - " + m.get_name() + " - " + m.get_type() + " - " + m.get_health());
		
	}
}
