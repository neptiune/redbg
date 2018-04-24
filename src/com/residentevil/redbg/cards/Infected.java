package com.residentevil.redbg.cards;

public class Infected extends Card {

	private Integer _health;
	private Integer _damage;
	private Integer _medalls;
	
	public Infected() {
		super();
	}

	public Infected(String _code, String _type, String _name) {
		super(_code, _type, _name);
	}

	public Integer get_health() {
		return _health;
	}

	public void set_health(Integer _health) {
		this._health = _health;
	}

	public Integer get_damage() {
		return _damage;
	}

	public void set_damage(Integer _damage) {
		this._damage = _damage;
	}

	public Integer get_medalls() {
		return _medalls;
	}

	public void set_medalls(Integer _medalls) {
		this._medalls = _medalls;
	}

}
