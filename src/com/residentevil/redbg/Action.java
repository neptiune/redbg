package com.residentevil.redbg;

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

}
