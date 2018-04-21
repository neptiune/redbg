package com.residentevil.redbg;

public class Card {
	
	private String _code;
	private String _type;
	private String _name;
	
	public Card() {}

	public Card(String _code, String _type, String _name) {
		this._code = _code;
		this._type = _type;
		this._name = _name;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		this._code = code;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		this._type = type;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}
	
}
