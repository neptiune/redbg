package com.residentevil.mockups.gamemodes;

import java.util.ArrayList;
import java.util.List;

import com.residentevil.redbg.cards.*;
import com.residentievil.utilities.Shared;

public class HistoryNovice {

	public HistoryNovice() {
		
	}
	
	public List<Weapon> weapons() {
		List<Weapon> tempList = new ArrayList<Weapon>();
		List<String> list = new ArrayList<String>();
		list.add("HANDGUN");
		list.add("BURST-FIRE HANDGUN [HANDGUN]");
		list.add("COMBAT KNIFE");
		list.add("SURVIVAL KNIFE [COMBAT KNIFE]");
		list.add("GRENADE");
		list.add("SIX SHOOTER");
		list.add("PUMP ACTION SHOTGUN");
		list.add("AUTOMATIC SHOTGUN [P.A. SHOTGUN]");
		list.add("BOLT-ACTION RIFLE");
		list.add("SEMI-AUTOMATIC RIFLE [B.A. RIFLE]");
		list.add("ASSAULT MACHINE GUN");
		list.add("FULL-BORE MACHINE GUN [A. MACHINE GUN]");
		List<Weapon> auxList = Shared.weaponList;
		for (Weapon a : auxList) {
			for(String s : list) {
				if(s.equalsIgnoreCase(a.get_name())) 
					tempList.add(a);
			}
		}
		return tempList;
	}
	
	public List<Action> actions() {
		List<Action> tempList = new ArrayList<Action>();
		List<String> list = new ArrayList<String>();
		list.add("UMBRELLA CORPORATION");
		list.add("MANSION FOYER");
		list.add("ESCAPE FROM THE DEAD CITY");
		list.add("DEADLY AIM");
		list.add("SHATTERED MEMORIES");
		list.add("THE MERCHANT");
		list.add("RELOAD");
		List<Action> auxList = Shared.actionList;
		for (Action a : auxList) {
			for(String s : list) {
				if(s.equalsIgnoreCase(a.get_name())) 
					tempList.add(a);
			}
		}
		return tempList;
	}
}
