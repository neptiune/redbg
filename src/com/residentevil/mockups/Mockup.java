package com.residentevil.mockups;
import java.util.ArrayList;
import java.util.List;

import com.residentevil.redbg.*;
public class Mockup {

	public static void main(String[] args) {

		List<MainCharacter> charsList = charsMockup();
		
		List<Player> playerList = new ArrayList<Player>();
		
		int playerNumber = 2;
		
		GameMode mode = new GameMode("HISTORY MODE", charsList, null);
		mode.sortCharacters();

		Game game = new Game();
		game.set_mode(mode);
		game.assignCharactersToPlayers(playerNumber);
		System.out.println("------------------------------------------");
		game.sortTurns();
	}

	public static List<MainCharacter> charsMockup() {
		
		List<MainCharacter> charsList = new ArrayList<MainCharacter>();
		
		MainCharacter 
		wesker = new MainCharacter("CH-001", "CHARACTER", "ALBERT WESKER", 100, 100, 0, 2, 9, 0, 0),
		leon = new MainCharacter("CH-002", "CHARACTER", "LEON S. KENNEDY", 80, 80, 0, 2, 6, 0, 0),
		claire = new MainCharacter("CH-003", "CHARACTER", "CLAIRE REDFIELD", 70, 70, 0, 2, 6, 0, 0),
		sheva = new MainCharacter("CH-004", "CHARACTER", "SHEVA ALOMAR", 80, 80, 0, 2, 4, 0, 0),
		barry = new MainCharacter("CH-005", "CHARACTER", "BARRY BURTON", 90, 90, 0, 2, 7, 0, 0),
		ada = new MainCharacter("CH-006", "CHARACTER", "ADA WONG", 70, 70, 0, 4, 8, 0, 0),
		jack = new MainCharacter("CH-007", "CHARACTER", "JACK KRAUSER", 80, 80, 0, 1, 7, 0, 0),
		chris = new MainCharacter("CH-008", "CHARACTER", "CHRIS REDFIELD", 120, 120, 0, 0, 4, 0, 0),
		jill = new MainCharacter("CH-009", "CHARACTER", "JILL VALENTINE", 80, 80, 0, 5, 8, 0, 0),
		rebecca = new MainCharacter("CH-010", "CHARACTER", "REBECCA CHAMBERS", 70, 70, 0, 2, 4, 0, 0);
		
		charsList.add(wesker);
		charsList.add(leon);
		charsList.add(claire);
		charsList.add(sheva);
		charsList.add(barry);
		charsList.add(ada);
		charsList.add(jack);
		charsList.add(chris);
		charsList.add(jill);
		charsList.add(rebecca);
		
		return charsList;
	}
}
