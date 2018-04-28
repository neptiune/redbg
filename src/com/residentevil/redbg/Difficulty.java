package com.residentevil.redbg;

public class Difficulty {
	
	// Nombre de la dificultad
	private String _name;
	
	// Los valores esperados para la salud de Infected son -10 o +10
	private Integer _healthConfig;
	
	// Los valores esperados para el daño de Infected son -10 o +10
	private Integer _damageConfig;
	
	/*
	 * Los valores esperados para los efectos de Infected son los siguientes:
	 * 0: deshabilitado
	 * 1: habilitado (se activa una vez)
	 * 2: habilitado X2 (se activa dos veces)
	 */
	private Integer _effectConfig;
	
	/* 
	 * Si el valor es 1 y el Infected no es derrotado se mantiene en el campo
	 * Si el valor es 0 y el Infected no es derrotado se devuelve a la mansion
	 */
	private Boolean _keepConfig;
	
	/*
	 * Si el valor es 1 y el MainCharacter es derrotado, puede revivir.
	 * Si el valor es 0 y el MainCharacter es derrotado, no puede revivir.
	 */
	private Boolean _reanimateConfig;

	public Difficulty() {
	}

	public Difficulty(String _name, Integer _healthConfig, Integer _damageConfig, Integer _effectConfig, Boolean _keepConfig,
			Boolean _reanimateConfig) {
		this._name = _name;
		this._healthConfig = _healthConfig;
		this._damageConfig = _damageConfig;
		this._effectConfig = _effectConfig;
		this._keepConfig = _keepConfig;
		this._reanimateConfig = _reanimateConfig;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public Integer get_healthConfig() {
		return _healthConfig;
	}

	public void set_healthConfig(Integer _healthConfig) {
		this._healthConfig = _healthConfig;
	}

	public Integer get_damageConfig() {
		return _damageConfig;
	}

	public void set_damageConfig(Integer _damageConfig) {
		this._damageConfig = _damageConfig;
	}

	public Integer get_effectConfig() {
		return _effectConfig;
	}

	public void set_effectConfig(Integer _effectConfig) {
		this._effectConfig = _effectConfig;
	}

	public Boolean get_keepConfig() {
		return _keepConfig;
	}

	public void set_keepConfig(Boolean _keepConfig) {
		this._keepConfig = _keepConfig;
	}

	public Boolean get_reanimateConfig() {
		return _reanimateConfig;
	}

	public void set_reanimateConfig(Boolean _reanimateConfig) {
		this._reanimateConfig = _reanimateConfig;
	}
	
	
}
