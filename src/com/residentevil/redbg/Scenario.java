package com.residentevil.redbg;

import java.util.Map;

public class Scenario {
	private Map<Integer, Pile> _pilesOrder;
	private List<Card> _mansionList;
	
	public Scenario()
	{
		
	}

	public Map<Integer, Pile> get_pilesOrder() {
		return _pilesOrder;
	}

	public void set_pilesOrder(Map<Integer, Pile> _pilesOrder) {
		this._pilesOrder = _pilesOrder;
	}
	
}
