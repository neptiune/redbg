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

	
	public void configGameArea() {
		GameMode gameMode = this.get_game().get_mode();
		
		
	}
}
