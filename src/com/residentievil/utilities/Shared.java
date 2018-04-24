package com.residentievil.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.residentevil.redbg.cards.Card;

public class Shared {

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
