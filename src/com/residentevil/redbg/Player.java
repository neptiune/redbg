package com.residentevil.redbg;

import java.util.List;

import com.residentevil.redbg.cards.Action;
import com.residentevil.redbg.cards.Card;
import com.residentevil.redbg.cards.MainCharacter;

public class Player {

	private Integer _id;
	private String _name;
	private Integer _actions;
	private Integer _buys;
	private Integer _explores;
	private MainCharacter _assignedCharacter;
	private PlayerBoard _board;

	public Player() {
	}

	public Player(Integer _id, String _name, Integer _actions, Integer _buys, Integer _explores,
			MainCharacter _assignedCharacter, PlayerBoard _board) {
		this._id = _id;
		this._name = _name;
		this._actions = _actions;
		this._buys = _buys;
		this._explores = _explores;
		this._assignedCharacter = _assignedCharacter;
		this._board = _board;
	}

	public Player(MainCharacter _assignedCharacter) {
		this._assignedCharacter = _assignedCharacter;
		this._actions = this._buys = this._explores = 0;
	}

	public Integer get_id() {
		return _id;
	}

	public void set_id(Integer _id) {
		this._id = _id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public Integer get_actions() {
		return _actions;
	}

	public void set_actions(Integer _actions) {
		this._actions = _actions;
	}

	public Integer get_buys() {
		return _buys;
	}

	public void set_buys(Integer _buys) {
		this._buys = _buys;
	}

	public Integer get_explores() {
		return _explores;
	}

	public void set_explores(Integer _explores) {
		this._explores = _explores;
	}

	public MainCharacter get_assignedCharacter() {
		return _assignedCharacter;
	}

	public void set_assignedCharacter(MainCharacter _assignedCharacter) {
		this._assignedCharacter = _assignedCharacter;
	}

	public PlayerBoard get_board() {
		return _board;
	}

	public void set_board(PlayerBoard _board) {
		this._board = _board;
	}

	public Pile buyAction(List<Action> _allowedActions, Pile _actionPile, Integer _actionKey) {
		if (this.get_buys() > 0) {
			int availableGold = this.get_assignedCharacter().get_gold();
			Card tempCard = _actionPile.get_cardsList().get(_actionKey);
			Action tempAction = new Action();
			for (Action action : _allowedActions) {
				if (action.get_code().equalsIgnoreCase(tempCard.get_code())) {
					tempAction = action;
					break;
				}
			}

			if (availableGold >= tempAction.get_price()) {
				this.get_board().get_discardPile().add(tempAction);
				_actionPile.get_cardsList().remove(_actionKey);
				this.set_buys(this.get_buys()-1);
				Integer goldUsed = this.get_assignedCharacter().get_gold();
				this.get_assignedCharacter().set_gold(goldUsed-1);
			} else {
				System.out.println("NO PUEDES COMPRAR, NO TIENES SUFICIENTE ORO");
			}
		} else {
			System.out.println("NO PUEDES COMPRAR, YA NO TIENES PUNTOS DE COMPRA");
		}
		//Se va a regresar el mismo objeto, si la compra se hizo, hay cambios, si no, se regresa igual
		return _actionPile;
	}
}
