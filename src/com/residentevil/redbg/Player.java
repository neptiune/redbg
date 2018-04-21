package com.residentevil.redbg;

public class Player {

	private Integer _id;
	private String _name;
	private Integer _actions;
	private Integer _buys;
	private Integer _explores;
	private MainCharacter _assignedCharacter;
	private Integer _turnOrder;
	
	public Player() {
	}

	public Player(Integer _id, String _name, Integer _actions, Integer _buys, Integer _explores, MainCharacter _assignedCharacter, Integer _turnOrder) {
		this._id = _id;
		this._name = _name;
		this._actions = _actions;
		this._buys = _buys;
		this._explores = _explores;
		this._assignedCharacter = _assignedCharacter;
		this._turnOrder = _turnOrder;
	}

	public Player(MainCharacter _assignedCharacter) {
		this._assignedCharacter = _assignedCharacter;
		this._actions = this._buys = this._explores = this._turnOrder = 0;
	}
	
	public Integer get_id() {
		return _id;
	}

	public void set_id(Integer _id) {
		this._id = _id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public Integer get_actions() {
		return _actions;
	}

	public void set_actions(Integer _actions) {
		this._actions = _actions;
	}

	public Integer get_buys() {
		return _buys;
	}

	public void set_buys(Integer _buys) {
		this._buys = _buys;
	}

	public Integer get_explores() {
		return _explores;
	}

	public void set_explores(Integer _explores) {
		this._explores = _explores;
	}

	public MainCharacter get_assignedCharacter() {
		return _assignedCharacter;
	}

	public void set_assignedCharacter(MainCharacter _assignedCharacter) {
		this._assignedCharacter = _assignedCharacter;
	}

	public Integer get_turnOrder() {
		return _turnOrder;
	}

	public void set_turnOrder(Integer _turnOrder) {
		this._turnOrder = _turnOrder;
	}

}
