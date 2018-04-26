package com.residentevil.redbg.cards;

public class Ammo extends Card {

	private Integer _price;
	private Integer _ammoBonus;
	private Integer _goldBonus;
	
	public Ammo() {
		super();
	}

	public Ammo(String _code, String _type, String _name, Integer _price, Integer _ammo, Integer _gold) {
		super(_code, _type, _name);
		this._price = _price;
		this._ammoBonus = _ammo;
		this._goldBonus = _gold;
	}

	public Integer get_price() {
		return _price;
	}

	public void set_price(Integer _price) {
		this._price = _price;
	}

	public Integer get_ammo() {
		return _ammoBonus;
	}

	public void set_ammo(Integer _ammo) {
		this._ammoBonus = _ammo;
	}

	public Integer get_gold() {
		return _goldBonus;
	}

	public void set_gold(Integer _gold) {
		this._goldBonus = _gold;
	}

}
