package com.residentevil.redbg.cards;

public class MainCharacter extends Card  {

	private Integer _health;
	private Integer _maxHealth;
	private Integer _medalls;
	private Integer _topMedallsLevel1;
	private Integer _topMedallsLevel2;
	private Integer _ammo;
	private Integer _gold;
	
	public MainCharacter() {
		super();
	}

	public MainCharacter(String _code, String _type, String _name, Integer _health, Integer _maxHealth, 
			Integer _medalls, Integer _topMedallsLevel1, Integer _topMedallsLevel2, Integer _ammo, Integer _gold) {
		super(_code, _type, _name);
		this._health = _health;
		this._maxHealth = _maxHealth;
		this._medalls = _medalls;
		this._topMedallsLevel1 = _topMedallsLevel1;
		this._topMedallsLevel2 = _topMedallsLevel2;
		this._ammo = _ammo;
		this._gold = _gold;
	}

	public Integer get_health() {
		return _health;
	}

	public void set_health(Integer _health) {
		this._health = _health;
	}

	public Integer get_maxHealth() {
		return _maxHealth;
	}

	public void set_maxHealth(Integer _maxHealth) {
		this._maxHealth = _maxHealth;
	}

	public Integer get_medalls() {
		return _medalls;
	}

	public void set_medalls(Integer _medalls) {
		this._medalls = _medalls;
	}

	public Integer get_topMedallsLevel1() {
		return _topMedallsLevel1;
	}

	public void set_topMedallsLevel1(Integer _topMedallsLevel1) {
		this._topMedallsLevel1 = _topMedallsLevel1;
	}

	public Integer get_topMedallsLevel2() {
		return _topMedallsLevel2;
	}

	public void set_topMedallsLevel2(Integer _topMedallsLevel2) {
		this._topMedallsLevel2 = _topMedallsLevel2;
	}

	public Integer get_ammo() {
		return _ammo;
	}

	public void set_ammo(Integer _ammo) {
		this._ammo = _ammo;
	}

	public Integer get_gold() {
		return _gold;
	}

	public void set_gold(Integer _gold) {
		this._gold = _gold;
	}

}
