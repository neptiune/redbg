package com.residentevil.redbg;

public class GameArea {
	private Game _game;
	
	public GameArea() {
		
	}

	public Game get_game() {
		return _game;
	}

	public void set_game(Game _game) {
		this._game = _game;
	}

	// Metodo para inicializar la configuracion de la Mansion
	// Metodo para inicializar la configuracion de los recursos
	// Metodo para inicializar los tableros de los jugadores
	
	public void configGameArea() {
		GameMode gameMode = this.get_game().get_mode();
		
	}
}
