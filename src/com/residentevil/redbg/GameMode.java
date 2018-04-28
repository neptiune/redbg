package com.residentevil.redbg;

import java.util.List;

import com.residentevil.redbg.cards.Action;
import com.residentevil.redbg.cards.Ammo;
import com.residentevil.redbg.cards.Infected;
import com.residentevil.redbg.cards.Item;
import com.residentevil.redbg.cards.MainCharacter;
import com.residentevil.redbg.cards.Token;
import com.residentevil.redbg.cards.Weapon;

//Define las reglas
//Esta clase debería ser el escenario
public class GameMode {
	
	private String _name;
	private String _scenarioName;
	private List<MainCharacter> _allowedCharacters;
	private List<Action> _allowedActions;
	private List<Ammo> _allowedAmmo;
	private List<Infected> _allowedInfecteds;
	private List<Token> _allowedTokens;
	private List<Weapon> _allowedWeapons;
	private List<Item> _allowedItems;
	
	public GameMode() {
	}
	
	public GameMode(String _name, String _scenarioName, List<MainCharacter> _allowedCharacters, List<Action> _allowedActions,
			List<Ammo> _allowedAmmo, List<Infected> _allowedInfecteds, List<Token> _allowedTokens,
			List<Weapon> _allowedWeapons, List<Item> _allowedItems) {
		this._name = _name;
		this._scenarioName = _scenarioName;
		this._allowedCharacters = _allowedCharacters;
		this._allowedActions = _allowedActions;
		this._allowedAmmo = _allowedAmmo;
		this._allowedInfecteds = _allowedInfecteds;
		this._allowedTokens = _allowedTokens;
		this._allowedWeapons = _allowedWeapons;
		this._allowedItems = _allowedItems;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_scenarioName() {
		return _scenarioName;
	}

	public void set_scenarioName(String _scenarioName) {
		this._scenarioName = _scenarioName;
	}

	public List<MainCharacter> get_allowedCharacters() {
		return _allowedCharacters;
	}

	public void set_allowedCharacters(List<MainCharacter> _allowedCharacters) {
		this._allowedCharacters = _allowedCharacters;
	}

	public List<Action> get_allowedActions() {
		return _allowedActions;
	}

	public void set_allowedActions(List<Action> _allowedActions) {
		this._allowedActions = _allowedActions;
	}

	public List<Ammo> get_allowedAmmo() {
		return _allowedAmmo;
	}

	public void set_allowedAmmo(List<Ammo> _allowedAmmo) {
		this._allowedAmmo = _allowedAmmo;
	}

	public List<Infected> get_allowedInfecteds() {
		return _allowedInfecteds;
	}

	public void set_allowedInfecteds(List<Infected> _allowedInfecteds) {
		this._allowedInfecteds = _allowedInfecteds;
	}

	public List<Token> get_allowedTokens() {
		return _allowedTokens;
	}

	public void set_allowedTokens(List<Token> _allowedTokens) {
		this._allowedTokens = _allowedTokens;
	}

	public List<Weapon> get_allowedWeapons() {
		return _allowedWeapons;
	}

	public void set_allowedWeapons(List<Weapon> _allowedWeapons) {
		this._allowedWeapons = _allowedWeapons;
	}

	public List<Item> get_allowedItems() {
		return _allowedItems;
	}

	public void set_allowedItems(List<Item> _allowedItems) {
		this._allowedItems = _allowedItems;
	}

}
