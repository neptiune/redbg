package com.residentevil.redbg;

import java.util.ArrayList;
import java.util.List;

import com.residentevil.redbg.cards.*;
import com.residentievil.utilities.Shared;

public class Preload {

	public static void initializeCards() {
		Shared.mainCharacterList = charsMockup();
	}

	public static List<MainCharacter> charsMockup() {

		List<MainCharacter> charsList = new ArrayList<MainCharacter>();

		MainCharacter wesker = new MainCharacter("CH-001", "CHARACTER", "ALBERT WESKER", 100, 100, 0, 2, 9, 0, 0),
				leon = new MainCharacter("CH-002", "CHARACTER", "LEON S. KENNEDY", 80, 80, 0, 2, 6, 0, 0),
				claire = new MainCharacter("CH-003", "CHARACTER", "CLAIRE REDFIELD", 70, 70, 0, 2, 6, 0, 0),
				sheva = new MainCharacter("CH-004", "CHARACTER", "SHEVA ALOMAR", 80, 80, 0, 2, 4, 0, 0),
				barry = new MainCharacter("CH-005", "CHARACTER", "BARRY BURTON", 90, 90, 0, 2, 7, 0, 0),
				ada = new MainCharacter("CH-006", "CHARACTER", "ADA WONG", 70, 70, 0, 4, 8, 0, 0),
				jack = new MainCharacter("CH-007", "CHARACTER", "JACK KRAUSER", 80, 80, 0, 1, 7, 0, 0),
				chris = new MainCharacter("CH-008", "CHARACTER", "CHRIS REDFIELD", 120, 120, 0, 0, 4, 0, 0),
				jill = new MainCharacter("CH-009", "CHARACTER", "JILL VALENTINE", 80, 80, 0, 5, 8, 0, 0),
				rebecca = new MainCharacter("CH-010", "CHARACTER", "REBECCA CHAMBERS", 70, 70, 0, 2, 4, 0, 0);

		charsList.add(wesker);
		charsList.add(leon);
		charsList.add(claire);
		charsList.add(sheva);
		charsList.add(barry);
		charsList.add(ada);
		charsList.add(jack);
		charsList.add(chris);
		charsList.add(jill);
		charsList.add(rebecca);

		return charsList;
	}

	public static List<Action> actionsMockup() {

		List<Action> actionsList = new ArrayList<Action>();

		Action MansionFoyer = new Action("AC-001", "ACTION", "MANSION FOYER", 30, 0, 0, 0, 2, 0, 0),
				DeadlyAim = new Action("AC-002", "ACTION", "DEADLY AIM", 50, 20, 0, 0, 0, 0, 0),
				ShatteredMemories = new Action("AC-003", "ACTION", "SHATTERED MEMORIES", 20, 0, 0, 0, 0, 0, 0),
				EscapefromtheDeadCity = new Action("AC-004", "ACTION", "ESCAPE FROM THE DEAD CITY", 70, 0, 2, 0, 1, 0,
						0),
				Reload = new Action("AC-005", "ACTION", "RELOAD", 50, 20, 2, 0, 0, 0, 0),
				TheMerchant = new Action("AC-006", "ACTION", "THE MERCHANT", 50, 0, 0, 0, 1, 20, 1),
				UmbrellaCorporation = new Action("AC-007", "ACTION", "UMBRELLA CORPORATION", 50, 0, 1, 0, 2, 0, 0),
				BacktoBack = new Action("AC-008", "ACTION", "BACK TO BACK", 30, 0, 1, 0, 0, 10, 0),
				ItemManagement = new Action("AC-009", "ACTION", "ITEM MANAGEMENT", 30, 0, 0, 0, 0, 0, 0),
				OminousBattle = new Action("AC-010", "ACTION", "OMINOUS BATTLE", 60, 0, 0, 0, 3, 10, 0),
				MasterofUnlocking = new Action("AC-011", "ACTION", "MASTER OF UNLOCKING", 30, 1, 0, 0, 0, 0, 0),
				StruggleforSurvival = new Action("AC-012", "ACTION", "STRUGGLE FOR SURVIVAL", 30, 0, 1, 1, 0, 0, 0);

		actionsList.add(MansionFoyer);
		actionsList.add(DeadlyAim);
		actionsList.add(ShatteredMemories);
		actionsList.add(EscapefromtheDeadCity);
		actionsList.add(Reload);
		actionsList.add(TheMerchant);
		actionsList.add(UmbrellaCorporation);
		actionsList.add(BacktoBack);
		actionsList.add(ItemManagement);
		actionsList.add(OminousBattle);
		actionsList.add(MasterofUnlocking);
		actionsList.add(StruggleforSurvival);

		return actionsList;

	}

	public static List<Ammo> ammoMockup() {
		List<Ammo> ammoList = new ArrayList<Ammo>();
		Ammo Ammox10 = new Ammo("AM-001", "AMMO", "AMMO X 10", 0, 10, 10),
				Ammox20 = new Ammo("AM-002", "AMMO", "AMMO X 20", 30, 20, 20),
				Ammox30 = new Ammo("AM-003", "AMMO", "AMMO X 30", 60, 30, 30);

		ammoList.add(Ammox10);
		ammoList.add(Ammox20);
		ammoList.add(Ammox30);

		return ammoList;
	}

	public static List<Infected> infectedMockup() {
		List<Infected> infectedList = new ArrayList<Infected>();
		Infected BuiKitchwa = new Infected("MA-005", "INFECTED", "BUI KITCHWA", 10, 10, 1),
				Majini = new Infected("MA-001", "INFECTED", "MAJINI", 15, 10, 1),
				Zombiefemale = new Infected("MA-003", "INFECTED", "ZOMBIE (FEMALE)", 15, 10, 1),
				ZombieButcher = new Infected("MA-004", "INFECTED", "ZOMBIE BUTCHER", 15, 10, 1),
				Zombiemale = new Infected("MA-002", "INFECTED", "ZOMBIE (MALE)", 20, 20, 1),
				DrSalvador = new Infected("MA-011", "INFECTED", "DR. SALVADOR", 20, 15, 2),
				Cerberus = new Infected("MA-015", "INFECTED", "CERBERUS", 25, 10, 2),
				MimicryMarcus = new Infected("MA-009", "INFECTED", "MIMICRY MARCUS", 30, 20, 2),
				Executioner = new Infected("MA-017", "INFECTED", "EXECUTIONER", 30, 25, 3),
				Licker = new Infected("MA-006", "INFECTED", "LICKER", 40, 30, 3),
				Hunter = new Infected("MA-008", "INFECTED", "HUNTER", 40, 30, 4),
				GatlingGunMajini = new Infected("MA-014", "INFECTED", "GATLING GUN MAJINI", 40, 25, 4),
				ElGigante = new Infected("MA-016", "INFECTED", "EL GIGANTE", 40, 40, 4),
				Nemesis = new Infected("MA-007", "INFECTED", "NEMESIS (T-TYPE)", 60, 40, 5),
				UroborosAheri = new Infected("MA-010", "INFECTED", "UROBOROS AHERI", 90, 70, 8);

		infectedList.add(BuiKitchwa);
		infectedList.add(Majini);
		infectedList.add(Zombiefemale);
		infectedList.add(ZombieButcher);
		infectedList.add(Zombiemale);
		infectedList.add(DrSalvador);
		infectedList.add(Cerberus);
		infectedList.add(MimicryMarcus);
		infectedList.add(Executioner);
		infectedList.add(Licker);
		infectedList.add(Hunter);
		infectedList.add(GatlingGunMajini);
		infectedList.add(ElGigante);
		infectedList.add(Nemesis);
		infectedList.add(UroborosAheri);

		return infectedList;
	}

	public static List<Item> itemMockup() {
		List<Item> itemList = new ArrayList<Item>();

		Item GreenHerb = new Item("IT-001", "ITEM", "GREEN HERB", 20),
				YellowHerb = new Item("IT-002", "ITEM", "YELLOW HERB", 0),
				FirstAidSpray = new Item("IT-003", "ITEM", "FIRST AID SPRAY", 60);
		
		itemList.add(GreenHerb);
		itemList.add(YellowHerb);
		itemList.add(FirstAidSpray);

		return itemList;
	}

	public static List<Token> tokenMockup() {
		List<Token> tokenList = new ArrayList<Token>();

		Token GatlingGunCase = new Token("MA-013", "TOKEN", "GATLING GUN CASE", "WE-007"),
		RocketLauncherCase = new Token("MA-012", "TOKEN", "ROCKET LAUNCHER CASE", "WE-008");
		
		tokenList.add(GatlingGunCase);
		tokenList.add(RocketLauncherCase);
		return tokenList;
	}

	public static List<Weapon> weaponMockup() {
		List<Weapon> weaponList = new ArrayList<Weapon>();
		Weapon Handgun = new Weapon("WE-009","WEAPON", "HANDGUN", 20,"PISTOL",20, 10),
				CombatKnife = new Weapon("WE-004","WEAPON", "COMBAT KNIFE", 0,"KNIFE",0, 5),
				AssaultMachineGun = new Weapon("WE-011","WEAPON", "ASSAULT MACHINE GUN", 30,"MACHINE GUN",40, 20),
				FullBoreMachineGun = new Weapon("WE-012","WEAPON", "FULL-BORE MACHINE GUN [A. MACHINE GUN]", 100,"MACHINE GUN",70, 40),
				PumpActionShotgun = new Weapon("WE-013","WEAPON", "PUMP ACTION SHOTGUN", 40,"SHOTGUN",40, 25),
				AutomaticShotgun = new Weapon("WE-014","WEAPON", "AUTOMATIC SHOTGUN [P.A. SHOTGUN]", 80,"SHOTGUN",80, 50),
				GatlingGun = new Weapon("WE-007","WEAPON", "GATLING GUN", 110,"MINIGUN",0, 0),
				RocketLauncher = new Weapon("WE-008","WEAPON", "ROCKET LAUNCHER", 130,"EXPLOSIVE",0, 90),
				SixShooter = new Weapon("WE-006","WEAPON", "SIX SHOOTER", 90,"MAGNUM",50, 50),
				Grenade = new Weapon("WE-001","WEAPON", "GRENADE", 40,"EXPLOSIVE",0, 15),
				BoltActionRifle = new Weapon("WE-015","WEAPON", "BOLT-ACTION RIFLE", 50,"RIFLE",50, 20),
				Longbow = new Weapon("WE-002","WEAPON", "LONGBOW", 110,"BOW",0, 25),
				Submission = new Weapon("WE-003","WEAPON", "SUBMISSION", 20,"MELEE",0, 5),
				SurvivalKnife = new Weapon("WE-005","WEAPON", "SURVIVAL KNIFE [COMBAT KNIFE]", 50,"KNIFE",0, 10),
				BurstFireHandgun = new Weapon("WE-010","WEAPON", "BURST-FIRE HANDGUN [HANDGUN]", 60,"PISTOL",30, 20),
				SemiAutomaticRifle = new Weapon("WE-016","WEAPON", "SEMI-AUTOMATIC RIFLE [B.A. RIFLE]", 90,"RIFLE",70, 30);
		
		weaponList.add(Handgun);
		weaponList.add(CombatKnife);
		weaponList.add(AssaultMachineGun);
		weaponList.add(FullBoreMachineGun);
		weaponList.add(PumpActionShotgun);
		weaponList.add(AutomaticShotgun);
		weaponList.add(GatlingGun);
		weaponList.add(RocketLauncher);
		weaponList.add(SixShooter);
		weaponList.add(Grenade);
		weaponList.add(BoltActionRifle);
		weaponList.add(Longbow);
		weaponList.add(Submission);
		weaponList.add(SurvivalKnife);
		weaponList.add(BurstFireHandgun);
		weaponList.add(SemiAutomaticRifle);

		return weaponList;
	}
}
