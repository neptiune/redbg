package com.residentevil.redbg.cards;

public class Token extends Card {

	private String _prizeCodeCard;
	public Token() {
		super();
	}

	public Token(String _code, String _type, String _name, String _prizeCodeCard) {
		super(_code, _type, _name);
		this._prizeCodeCard = _prizeCodeCard;
	}

	public String get_prizeCodeCard() {
		return _prizeCodeCard;
	}

	public void set_prizeCodeCard(String _prizeCodeCard) {
		this._prizeCodeCard = _prizeCodeCard;
	}

}
