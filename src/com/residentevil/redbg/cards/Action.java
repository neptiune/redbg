package com.residentevil.redbg.cards;

public class Action extends Card {

	protected Integer _price;
	protected Integer _ammoBonus;
	protected Integer _actionBonus;
	protected Integer _exploreBonus;
	protected Integer _cardBonus;
	protected Integer _goldBonus;
	protected Integer _buyBonus;
	
	public Action() {
		super();
	}

	public Action(String _code, String _type, String _name, Integer _price, Integer _ammoBonus, Integer _actionBonus, Integer _exploreBonus, Integer _cardBonus,
			Integer _goldBonus, Integer _buyBonus) {
		super(_code, _type, _name);
		this._price = _price;
		this._ammoBonus = _ammoBonus;
		this._actionBonus = _actionBonus;
		this._exploreBonus = _exploreBonus;
		this._cardBonus = _cardBonus;
		this._goldBonus = _goldBonus;
		this._buyBonus = _buyBonus;
	}

	public Integer get_price() {
		return _price;
	}

	public void set_price(Integer _price) {
		this._price = _price;
	}

	public Integer get_ammoBonus() {
		return _ammoBonus;
	}

	public void set_ammoBonus(Integer _ammoBonus) {
		this._ammoBonus = _ammoBonus;
	}

	public Integer get_actionBonus() {
		return _actionBonus;
	}

	public void set_actionBonus(Integer _actionBonus) {
		this._actionBonus = _actionBonus;
	}

	public Integer get_exploreBonus() {
		return _exploreBonus;
	}

	public void set_exploreBonus(Integer _exploreBonus) {
		this._exploreBonus = _exploreBonus;
	}

	public Integer get_cardBonus() {
		return _cardBonus;
	}

	public void set_cardBonus(Integer _cardBonus) {
		this._cardBonus = _cardBonus;
	}

	public Integer get_goldBonus() {
		return _goldBonus;
	}

	public void set_goldBonus(Integer _goldBonus) {
		this._goldBonus = _goldBonus;
	}

	public Integer get_buyBonus() {
		return _buyBonus;
	}

	public void set_buyBonus(Integer _buyBonus) {
		this._buyBonus = _buyBonus;
	}

}
