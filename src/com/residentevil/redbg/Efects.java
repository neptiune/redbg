package com.residentevil.redbg;

public final class Efects {
	
	//Se debe de activar el efecto cuando Wesker ataca a un personaje o explora la mansion.
	public static void ch001Lvl01(Player host) {
		MainCharacter tempCharacter = host.get_assignedCharacter();
		if(tempCharacter.get_name().equalsIgnoreCase("ALBERT WESKER")) {
			if (tempCharacter.get_medalls() >= tempCharacter.get_topMedallsLevel1()) {
				/** El efecto es por turno **/
				tempCharacter.set_gold(tempCharacter.get_gold() + 20);
				//Se asigna el objeto MainCharacter actualizado al objeto Player
				host.set_assignedCharacter(tempCharacter);
			}
		}
	}
	
	public void ch001Lvl02(Game game, Player host, Player guest) {
		if(game.get_mode().get_name().equalsIgnoreCase("HISTORY")) {
			MainCharacter tempCharacter = host.get_assignedCharacter();
			if(tempCharacter.get_name().equalsIgnoreCase("ALBERT WESKER")) {
				if (tempCharacter.get_medalls() >= tempCharacter.get_topMedallsLevel2()) {
					/** El efecto es por turno **/
					guest.set_explores(guest.get_explores() + 1);
				}
			}
		}
	}
	
	public void efect3() {
		
	}
	
}
