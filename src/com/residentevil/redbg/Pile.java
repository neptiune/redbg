package com.residentevil.redbg;

import java.util.List;

public class Pile {
	
	private String _name;
	private List<Card> _cardsList;

	public Pile() {
		
	}
	
	public Pile(String _name, List<Card> _cardsList) {
		this._name = _name;
		this._cardsList = _cardsList;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public List<Card> get_cardsList() {
		return _cardsList;
	}
	public void set_cardsList(List<Card> _cardsList) {
		this._cardsList = _cardsList;
	}
	
}
