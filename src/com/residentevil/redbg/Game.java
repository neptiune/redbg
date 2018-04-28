package com.residentevil.redbg;

// Mantiene los objetos del juego
public class Game {

	private GameMode _mode;
	private Scenario _scenario;
	private Difficulty _difficulty;
	
	public Game() {
		this._mode = new GameMode();
		this._scenario = new Scenario();
		this._difficulty = new Difficulty();
	}

	public Game(GameMode _mode, Scenario _scenario, Difficulty _difficulty) {
		this._mode = _mode;
		this._scenario = _scenario;
		this._difficulty = _difficulty;
	}

	public GameMode get_mode() {
		return _mode;
	}

	public void set_mode(GameMode _mode) {
		this._mode = _mode;
	}

	public Scenario get_scenario() {
		return _scenario;
	}

	public void set_scenario(Scenario _scenario) {
		this._scenario = _scenario;
	}

	public Difficulty get_difficulty() {
		return _difficulty;
	}

	public void set_difficulty(Difficulty _difficulty) {
		this._difficulty = _difficulty;
	}

}
