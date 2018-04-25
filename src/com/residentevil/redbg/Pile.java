package com.residentevil.redbg;

import java.util.Map;

import com.residentevil.redbg.cards.Card;
import com.residentievil.utilities.Shared;

public class Pile {
	
	private String _name;
	private Map<Integer, Card> _cardsList;
	private Map<Integer, Card> _cardsListMirror;

	public Pile() {
		
	}
	
	public Pile(String _name, Map<Integer, Card> _cardsList) {
		this._name = _name;
		this._cardsList = _cardsList;
	}
	
	public String get_name() {
		return _name;
	}
	
	public void set_name(String _name) {
		this._name = _name;
	}
	
	public Map<Integer, Card> get_cardsList() {
		return _cardsList;
	}
	
	public void set_cardsList(Map<Integer, Card> _cardsList) {
		this._cardsList = _cardsList;
	}
	
	public Map<Integer, Card> get_cardsListMirror() {
		return _cardsListMirror;
	}

	public void set_cardsListMirror(Map<Integer, Card> _cardsListMirror) {
		this._cardsListMirror = _cardsListMirror;
	}

	public void sufflePile() {
		this.set_cardsList(Shared.shuffleCards(this.get_cardsList(), true));
	}
}
