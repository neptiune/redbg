package com.residentevil.redbg.cards;

public class Weapon extends Card {

	private Integer _price;
	private String _weaponType;
	private Integer _requiredAmmo;
	private Integer _damage;
	
	public Weapon() {
		super();
	}

	public Weapon(String _code, String _type, String _name, Integer _price, String _weaponType, Integer _requiredAmmo, Integer _damage) {
		super(_code, _type, _name);
		this._price = _price;
		this._weaponType = _weaponType;
		this._requiredAmmo = _requiredAmmo;
		this._damage = _damage;
	}

	public Integer get_price() {
		return _price;
	}

	public void set_price(Integer _price) {
		this._price = _price;
	}

	public String get_weaponType() {
		return _weaponType;
	}

	public void set_weaponType(String _weaponType) {
		this._weaponType = _weaponType;
	}

	public Integer get_requiredAmmo() {
		return _requiredAmmo;
	}

	public void set_requiredAmmo(Integer _requiredAmmo) {
		this._requiredAmmo = _requiredAmmo;
	}

	public Integer get_damage() {
		return _damage;
	}

	public void set_damage(Integer _damage) {
		this._damage = _damage;
	}

}
