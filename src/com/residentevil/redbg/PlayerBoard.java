package com.residentevil.redbg;

import java.util.List;

import com.residentevil.redbg.cards.Card;

public class PlayerBoard {
	private List<Card> _playerArea;
	private List<Card> _discardPile;
	private List<Card> _inventary;
	
	public PlayerBoard() {
		
	}
	
	public PlayerBoard(List<Card> _playerArea, List<Card> _discardPile, List<Card> _inventary) {
		this._playerArea = _playerArea;
		this._discardPile = _discardPile;
		this._inventary = _inventary;
	}

	public List<Card> get_playerArea() {
		return _playerArea;
	}

	public void set_playerArea(List<Card> _playerArea) {
		this._playerArea = _playerArea;
	}

	public List<Card> get_discardPile() {
		return _discardPile;
	}

	public void set_discardPile(List<Card> _discardPile) {
		this._discardPile = _discardPile;
	}

	public List<Card> get_inventary() {
		return _inventary;
	}

	public void set_inventary(List<Card> _inventary) {
		this._inventary = _inventary;
	}
	
	//Metodo para revolver las cartas del inventario
	//Metodo para asignar la mano de cartas por turno
	//Metodos para consultar la pila de descarte

	// Metodo para inicializar los tableros de los jugadores
}
