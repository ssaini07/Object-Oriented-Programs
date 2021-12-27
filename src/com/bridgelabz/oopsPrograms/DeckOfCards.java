package com.bridgelabz.oopsPrograms;

import java.util.ArrayList;

public class DeckOfCards {
	String[] Suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] Ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	static final int cards = 9;
	static final int players = 4;
	int n = Suits.length * Ranks.length;
	int[] deck = new int[n];
//initializing the deck
	public void deckInitialize() {
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
			System.out.println(deck[i]);
		}

	}
//shuffle the deck
	public void shuffle() {
		for (int i = 0; i < n; i++) {
			int index = i + (int) (Math.random() * (n - i));
			int temp = deck[index];
			deck[index] = deck[i];
			deck[i] = temp;
			System.out.println(deck[i]);

		}
	}
//printing the cards
	public void deal() {
		for (int i = 0; i < n; i++) {
			String suit = Suits[deck[i] / 13];
			String rank = Ranks[deck[i] % 13];
			System.out.println(rank + " of " + suit);
			System.out.println("Remaining cards: " + n);
		}
	}

	public static void main(String[] args) {
		DeckOfCards deckCards = new DeckOfCards();
		deckCards.deckInitialize();
		deckCards.shuffle();
		deckCards.deal();
	}

}
