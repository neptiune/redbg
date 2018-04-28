package com.residentevil.redbg;

import java.util.ArrayList;
import java.util.List;

import com.residentevil.mockups.gamemodes.HistoryNovice;
import com.residentevil.redbg.cards.*;
import com.residentievil.utilities.Shared;

public class Preload {

	/*
	 * 
	 */
	public static void initializeCards() {
		Shared.mainCharacterList = charsMockup();
		Shared.actionList = actionsMockup();
		Shared.ammoList = ammoMockup();
		Shared.infectedList = infectedMockup();
		Shared.itemList = itemMockup();
		Shared.tokenList = tokenMockup();
		Shared.weaponList = weaponMockup();

		Shared.historyMode = historyModeMockup();
		Shared._difficultiesList = difficultiesMockup(); 
	}

	private static List<MainCharacter> charsMockup() {

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

	private static List<Action> actionsMockup() {

		List<Action> actionsList = new ArrayList<Action>();
		for (int i = 1; i <= 10; i++) {
			Action MansionFoyer = new Action("AC-001", "ACTION", "MANSION FOYER", 30, 0, 0, 0, 2, 0, 0);
			actionsList.add(MansionFoyer);
		}
		for (int i = 1; i <= 5; i++) {
			Action DeadlyAim = new Action("AC-002", "ACTION", "DEADLY AIM", 50, 20, 0, 0, 0, 0, 0);
			actionsList.add(DeadlyAim);
		}
		for (int i = 1; i <= 5; i++) {
			Action ShatteredMemories = new Action("AC-003", "ACTION", "SHATTERED MEMORIES", 20, 0, 0, 0, 0, 0, 0);
			actionsList.add(ShatteredMemories);
		}
		for (int i = 1; i <= 10; i++) {
			Action EscapefromtheDeadCity = new Action("AC-004", "ACTION", "ESCAPE FROM THE DEAD CITY", 70, 0, 2, 0, 1,
					0, 0);
			actionsList.add(EscapefromtheDeadCity);
		}
		for (int i = 1; i <= 5; i++) {
			Action Reload = new Action("AC-005", "ACTION", "RELOAD", 50, 20, 2, 0, 0, 0, 0);
			actionsList.add(Reload);
		}
		for (int i = 1; i <= 6; i++) {
			Action TheMerchant = new Action("AC-006", "ACTION", "THE MERCHANT", 50, 0, 0, 0, 1, 20, 1);
			actionsList.add(TheMerchant);
		}
		for (int i = 1; i <= 5; i++) {
			Action UmbrellaCorporation = new Action("AC-007", "ACTION", "UMBRELLA CORPORATION", 50, 0, 1, 0, 2, 0, 0);
			actionsList.add(UmbrellaCorporation);
		}
		for (int i = 1; i <= 5; i++) {
			Action BacktoBack = new Action("AC-008", "ACTION", "BACK TO BACK", 30, 0, 1, 0, 0, 10, 0);
			actionsList.add(BacktoBack);
		}
		for (int i = 1; i <= 5; i++) {
			Action ItemManagement = new Action("AC-009", "ACTION", "ITEM MANAGEMENT", 30, 0, 0, 0, 0, 0, 0);
			actionsList.add(ItemManagement);
		}
		for (int i = 1; i <= 5; i++) {
			Action OminousBattle = new Action("AC-010", "ACTION", "OMINOUS BATTLE", 60, 0, 0, 0, 3, 10, 0);
			actionsList.add(OminousBattle);
		}
		for (int i = 1; i <= 3; i++) {
			Action MasterofUnlocking = new Action("AC-011", "ACTION", "MASTER OF UNLOCKING", 30, 1, 0, 0, 0, 0, 0);
			actionsList.add(MasterofUnlocking);
		}
		for (int i = 1; i <= 5; i++) {
			Action StruggleforSurvival = new Action("AC-012", "ACTION", "STRUGGLE FOR SURVIVAL", 30, 0, 1, 1, 0, 0, 0);
			actionsList.add(StruggleforSurvival);
		}

		return actionsList;

	}

	private static List<Ammo> ammoMockup() {
		List<Ammo> ammoList = new ArrayList<Ammo>();

		for (int i = 1; i <= 28; i++) {
			Ammo Ammox10 = new Ammo("AM-001", "AMMO", "AMMO X 10", 0, 10, 10);
			ammoList.add(Ammox10);
		}
		for (int i = 1; i <= 15; i++) {
			Ammo Ammox20 = new Ammo("AM-002", "AMMO", "AMMO X 20", 30, 20, 20);
			ammoList.add(Ammox20);
		}
		for (int i = 1; i <= 15; i++) {
			Ammo Ammox30 = new Ammo("AM-003", "AMMO", "AMMO X 30", 60, 30, 30);
			ammoList.add(Ammox30);
		}

		return ammoList;
	}

	private static List<Infected> infectedMockup() {
		List<Infected> infectedList = new ArrayList<Infected>();
		for (int i = 1; i <= 3; i++) {
			Infected BuiKitchwa = new Infected("MA-005", "INFECTED", "BUI KITCHWA", 10, 10, 1);
			infectedList.add(BuiKitchwa);
		}
		for (int i = 1; i <= 3; i++) {
			Infected Majini = new Infected("MA-001", "INFECTED", "MAJINI", 15, 10, 1);
			infectedList.add(Majini);
		}
		for (int i = 1; i <= 2; i++) {
			Infected Zombiefemale = new Infected("MA-003", "INFECTED", "ZOMBIE (FEMALE)", 15, 10, 1);
			infectedList.add(Zombiefemale);
		}
		for (int i = 1; i <= 3; i++) {
			Infected ZombieButcher = new Infected("MA-004", "INFECTED", "ZOMBIE BUTCHER", 15, 10, 1);
			infectedList.add(ZombieButcher);
		}
		for (int i = 1; i <= 2; i++) {
			Infected Zombiemale = new Infected("MA-002", "INFECTED", "ZOMBIE (MALE)", 20, 20, 1);
			infectedList.add(Zombiemale);
		}
		for (int i = 1; i <= 3; i++) {
			Infected DrSalvador = new Infected("MA-011", "INFECTED", "DR. SALVADOR", 20, 15, 2);
			infectedList.add(DrSalvador);
		}
		for (int i = 1; i <= 3; i++) {
			Infected Cerberus = new Infected("MA-015", "INFECTED", "CERBERUS", 25, 10, 2);
			infectedList.add(Cerberus);
		}
		for (int i = 1; i <= 2; i++) {
			Infected MimicryMarcus = new Infected("MA-009", "INFECTED", "MIMICRY MARCUS", 30, 20, 2);
			infectedList.add(MimicryMarcus);
		}
		for (int i = 1; i <= 1; i++) {
			Infected Executioner = new Infected("MA-017", "INFECTED", "EXECUTIONER", 30, 25, 3);
			infectedList.add(Executioner);
		}
		for (int i = 1; i <= 3; i++) {
			Infected Licker = new Infected("MA-006", "INFECTED", "LICKER", 40, 30, 3);
			infectedList.add(Licker);
		}
		for (int i = 1; i <= 2; i++) {
			Infected Hunter = new Infected("MA-008", "INFECTED", "HUNTER", 40, 30, 4);
			infectedList.add(Hunter);
		}
		for (int i = 1; i <= 3; i++) {
			Infected GatlingGunMajini = new Infected("MA-014", "INFECTED", "GATLING GUN MAJINI", 40, 25, 4);
			infectedList.add(GatlingGunMajini);
		}
		for (int i = 1; i <= 1; i++) {
			Infected ElGigante = new Infected("MA-016", "INFECTED", "EL GIGANTE", 40, 40, 4);
			infectedList.add(ElGigante);
		}
		for (int i = 1; i <= 1; i++) {
			Infected Nemesis = new Infected("MA-007", "INFECTED", "NEMESIS (T-TYPE)", 60, 40, 5);
			infectedList.add(Nemesis);
		}
		for (int i = 1; i <= 1; i++) {
			Infected UroborosAheri = new Infected("MA-010", "INFECTED", "UROBOROS AHERI", 90, 70, 8);
			infectedList.add(UroborosAheri);
		}

		return infectedList;
	}

	private static List<Item> itemMockup() {
		List<Item> itemList = new ArrayList<Item>();

		for (int i = 1; i <= 6; i++) {
			Item GreenHerb = new Item("IT-001", "ITEM", "GREEN HERB", 20);
			itemList.add(GreenHerb);
		}
		for (int i = 1; i <= 3; i++) {
			Item YellowHerb = new Item("IT-002", "ITEM", "YELLOW HERB", 0);
			itemList.add(YellowHerb);
		}
		for (int i = 1; i <= 5; i++) {
			Item FirstAidSpray = new Item("IT-003", "ITEM", "FIRST AID SPRAY", 60);
			itemList.add(FirstAidSpray);
		}

		return itemList;
	}

	private static List<Token> tokenMockup() {
		List<Token> tokenList = new ArrayList<Token>();
		for(int i = 1; i<= 1; i++) {
		Token GatlingGunCase = new Token("MA-013", "TOKEN", "GATLING GUN CASE", "WE-007");
		tokenList.add(GatlingGunCase);
		}

		for(int i = 1; i<= 1; i++) {
		Token RocketLauncherCase = new Token("MA-012", "TOKEN", "ROCKET LAUNCHER CASE", "WE-008");
		tokenList.add(RocketLauncherCase);
		}
		return tokenList;
	}

	private static List<Weapon> weaponMockup() {
		List<Weapon> weaponList = new ArrayList<Weapon>();
		
        for(int i = 1; i <= 9; i++){
        Weapon Handgun = new Weapon("WE-009", "WEAPON", "HANDGUN", 20, "PISTOL", 20, 10);
        weaponList.add(Handgun);
        }
		for(int i = 1; i <= 11; i++){
        Weapon CombatKnife = new Weapon("WE-004", "WEAPON", "COMBAT KNIFE", 0, "KNIFE", 0, 5);
        weaponList.add(CombatKnife);
        }
		for(int i = 1; i <= 4; i++){
        Weapon AssaultMachineGun = new Weapon("WE-011", "WEAPON", "ASSAULT MACHINE GUN", 30, "MACHINE GUN", 40, 20);
        weaponList.add(AssaultMachineGun);
        }
		for(int i = 1; i <= 1; i++){
        Weapon FullBoreMachineGun = new Weapon("WE-012", "WEAPON", "FULL-BORE MACHINE GUN [A. MACHINE GUN]", 100,"MACHINE GUN", 70, 40);
        weaponList.add(FullBoreMachineGun);
        }
		for(int i = 1; i <= 4; i++){
        Weapon PumpActionShotgun = new Weapon("WE-013", "WEAPON", "PUMP ACTION SHOTGUN", 40, "SHOTGUN", 40, 25);
        weaponList.add(PumpActionShotgun);
        }
		for(int i = 1; i <= 1; i++){
        Weapon AutomaticShotgun = new Weapon("WE-014", "WEAPON", "AUTOMATIC SHOTGUN [P.A. SHOTGUN]", 80, "SHOTGUN", 80,50);
        weaponList.add(AutomaticShotgun);
        }
		for(int i = 1; i <= 1; i++){
        Weapon GatlingGun = new Weapon("WE-007", "WEAPON", "GATLING GUN", 110, "MINIGUN", 0, 0);
        weaponList.add(GatlingGun);
        }
		for(int i = 1; i <= 1; i++){
        Weapon RocketLauncher = new Weapon("WE-008", "WEAPON", "ROCKET LAUNCHER", 130, "EXPLOSIVE", 0, 90);
        weaponList.add(RocketLauncher);
        }
		for(int i = 1; i <= 5; i++){
        Weapon SixShooter = new Weapon("WE-006", "WEAPON", "SIX SHOOTER", 90, "MAGNUM", 50, 50);
        weaponList.add(SixShooter);
        }
		for(int i = 1; i <= 5; i++){
        Weapon Grenade = new Weapon("WE-001", "WEAPON", "GRENADE", 40, "EXPLOSIVE", 0, 15);
        weaponList.add(Grenade);
        }
		for(int i = 1; i <= 4; i++){
        Weapon BoltActionRifle = new Weapon("WE-015", "WEAPON", "BOLT-ACTION RIFLE", 50, "RIFLE", 50, 20);
        weaponList.add(BoltActionRifle);
        }
		for(int i = 1; i <= 5; i++){
        Weapon Longbow = new Weapon("WE-002", "WEAPON", "LONGBOW", 110, "BOW", 0, 25);
        weaponList.add(Longbow);
        }
		for(int i = 1; i <= 5; i++){
        Weapon Submission = new Weapon("WE-003", "WEAPON", "SUBMISSION", 20, "MELEE", 0, 5);
        weaponList.add(Submission);
        }
		for(int i = 1; i <= 1; i++){
        Weapon SurvivalKnife = new Weapon("WE-005", "WEAPON", "SURVIVAL KNIFE [COMBAT KNIFE]", 50, "KNIFE", 0, 10);
        weaponList.add(SurvivalKnife);
        }
		for(int i = 1; i <= 1; i++){
        Weapon BurstFireHandgun = new Weapon("WE-010", "WEAPON", "BURST-FIRE HANDGUN [HANDGUN]", 60, "PISTOL", 30, 20);
        weaponList.add(BurstFireHandgun);
        }
		for(int i = 1; i <= 1; i++){
        Weapon SemiAutomaticRifle = new Weapon("WE-016", "WEAPON", "SEMI-AUTOMATIC RIFLE [B.A. RIFLE]", 90, "RIFLE",70, 30);
        weaponList.add(SemiAutomaticRifle);
        }
		return weaponList;
	}

	private static GameMode historyModeMockup() {
		HistoryNovice hn = new HistoryNovice();
		
		GameMode mode = new GameMode("HISTORY MODE", "NOVICE PLAYER", charsMockup(), hn.actions(), ammoMockup(), infectedMockup(),
				tokenMockup(), hn.weapons(), itemMockup());
		return mode;
	}

	private static List<Difficulty> difficultiesMockup() {
		
		List<Difficulty> difficultiesList = new ArrayList<Difficulty>();
		
		Difficulty 	easy = new Difficulty("EASY", -10, -10, 0, false, true),
					normal = new Difficulty("NORMAL", 0, 0, 1, false, true),
					hard = new Difficulty("HARD", +10, +10, 2, false, true),
					professional = new Difficulty("HARD", +10, +10, 2, true, false);
					
		difficultiesList.add(easy);
		difficultiesList.add(normal);
		difficultiesList.add(hard);
		difficultiesList.add(professional);
		
		return difficultiesList;
	}
	
}
