package com.residentievil.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.residentevil.redbg.cards.*;

public class Shared {

	public static List<Action> actionList;
	public static List<Ammo> ammoList;
	public static List<Infected> infectedList;
	public static List<Item> itemList;
	public static List<MainCharacter> mainCharacterList;
	public static List<Token> tokenList;
	public static List<Weapon> weaponList;
	
	/*public static List<Card> mapActionToCard(List<Action> actionList){
		List<Card> tempCardList = new ArrayList<Card>();
		for (Action action : actionList) {
			Card tempCard = new Card();
			tempCard.set_code(action.get_code());
			tempCard.set_name(action.get_name());
			tempCard.set_type(action.get_type());
		}
		return tempCardList;
	}*/
	
	public static Object getCardObject(String cardType, Card card) {
		switch (cardType) {
		case "Action":
			for (Action action : actionList) {
				if(card.get_code().equalsIgnoreCase(action.get_code())) {
					return action;
				}
			}
			return card;
		case "Ammo":
			for (Ammo ammo : ammoList) {
				if(card.get_code().equalsIgnoreCase(ammo.get_code())) {
					return ammo;
				}
			}
			return card;
		case "Infected":
			for (Infected infected : infectedList) {
				if(card.get_code().equalsIgnoreCase(infected.get_code())) {
					return infected;
				}
			}
			return card;
		case "Item":
			for (Item item : itemList) {
				if(card.get_code().equalsIgnoreCase(item.get_code())) {
					return item;
				}
			}
			return card;
		case "MainCharacter":
			for (MainCharacter mainCharacter : mainCharacterList) {
				if(card.get_code().equalsIgnoreCase(mainCharacter.get_code())) {
					return mainCharacter;
				}
			}
			return card;
		case "Token":
			for (Token token : tokenList) {
				if(card.get_code().equalsIgnoreCase(token.get_code())) {
					return token;
				}
			}
			return card;
		case "Weapon":
			for (Weapon weapon : weaponList) {
				if(card.get_code().equalsIgnoreCase(weapon.get_code())) {
					return weapon;
				}
			}
			return card;
		case "Card":
		default:
			break;
		}
		return card;
	}
	
	public static List<Integer> generateRandomNumbersList(int charsCount){

		List<Integer> arrayList = new ArrayList<Integer>();
		
		boolean finish = false, numberFree = false;
		int assignedNumers = 0;
		
		Random r = new Random();
		int result = r.nextInt(charsCount) + 1;
		
		arrayList.add(result);
		assignedNumers++;
		
		do {
			result = r.nextInt(charsCount) + 1;
			for (Integer number : arrayList) {
				if(result == number) {
					numberFree = false;
					break;
				}else {
					numberFree = true;
				}
			}
			if(numberFree) {
				arrayList.add(result);
				assignedNumers++;
			}
		}while(!finish && assignedNumers < charsCount);
		
		return arrayList;
	}
	
	public static Map<Integer, Card> shuffleCards(List<Card> _cardList, boolean _sortCards) {

		int charsCount = _cardList.size();
		List<Integer> arrayList = new ArrayList<Integer>();

		boolean finish = false, numberFree = false;
		int assignedNumers = 0;

		Random r = new Random();
		int result = r.nextInt(charsCount) + 1;

		arrayList.add(result);
		assignedNumers++;

		do {
			result = r.nextInt(charsCount) + 1;
			for (Integer number : arrayList) {
				if (result == number) {
					numberFree = false;
					break;
				} else {
					numberFree = true;
				}
			}
			if (numberFree) {
				arrayList.add(result);
				assignedNumers++;
			}
		} while (!finish && assignedNumers < charsCount);

		Map<Integer, Card> tempMap = new HashMap<Integer, Card>();

		for (int i = 0; i < charsCount; i++) {
			tempMap.put(arrayList.get(i), _cardList.get(i));
		}

		tempMap.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v.get_name()));

		if (_sortCards) {
			Map<Integer, Card> tempSortedMap = new HashMap<Integer, Card>();

			Iterator<Integer> iterator = tempMap.keySet().iterator();
			while (iterator.hasNext()) {
				Integer key = (Integer) iterator.next();
				Card value = tempMap.get(key);
				tempSortedMap.put(key, value);
			}

			tempSortedMap.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v.get_name()));

			return tempSortedMap;
		} else {
			return tempMap;
		}
	}
	
	/*
	 * Si _sortCards es TRUE entonces se regresará un MAP con las cartas ordenadas aleatoriamente,
	 * ya que ordenará los números asignados aleatoriamente a las CARD del MAP.
	 */
	public static Map<Integer, Card> shuffleCards(Map<Integer, Card> _cardList, boolean _sortCards) {

		int charsCount = _cardList.size();
		List<Integer> arrayList = new ArrayList<Integer>();

		boolean finish = false, numberFree = false;
		int assignedNumers = 0;

		Random r = new Random();
		int result = r.nextInt(charsCount) + 1;

		arrayList.add(result);
		assignedNumers++;

		do {
			result = r.nextInt(charsCount) + 1;
			for (Integer number : arrayList) {
				if (result == number) {
					numberFree = false;
					break;
				} else {
					numberFree = true;
				}
			}
			if (numberFree) {
				arrayList.add(result);
				assignedNumers++;
			}
		} while (!finish && assignedNumers < charsCount);

		Map<Integer, Card> tempMap = new HashMap<Integer, Card>();

		for (int i = 0; i < charsCount; i++) {
			tempMap.put(arrayList.get(i), _cardList.get(i));
		}

		tempMap.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v.get_name()));

		if (_sortCards) {
			Map<Integer, Card> tempSortedMap = new HashMap<Integer, Card>();

			Iterator<Integer> iterator = tempMap.keySet().iterator();
			while (iterator.hasNext()) {
				Integer key = (Integer) iterator.next();
				Card value = tempMap.get(key);
				tempSortedMap.put(key, value);
			}

			tempSortedMap.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v.get_name()));

			return tempSortedMap;
		} else {
			return tempMap;
		}
	}
	
}
