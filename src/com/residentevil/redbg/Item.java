package com.residentevil.redbg;

public class Item extends Card {

	private Integer _price;
	
	public Item() {
		super();
	}

	public Item(String _code, String _type, String _name, Integer _price) {
		super(_code, _type, _name);
		this._price = _price;
	}

	public Integer get_price() {
		return _price;
	}

	public void set_price(Integer _price) {
		this._price = _price;
	}

}
