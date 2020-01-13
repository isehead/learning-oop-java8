package com.javalesson.oop.collections.collectionsClass;

import java.util.*;

public class CollectionsRunner {

    public static void main(String[] args) {
        List<Card> deckOfCards = new ArrayList<>();
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                deckOfCards.add(new Card(suit, face));
            }
        }

        Collections.shuffle(deckOfCards);
        Card card = new Card(Card.Suit.SPADES, Card.Face.Queen);
        Collections.sort(deckOfCards);
        int i = Collections.binarySearch(deckOfCards, card);
        if (i >= 0) {
            System.out.println("Card was found at position " + i);
        } else {
            System.out.println("Card was not found");
        }


        List<Card> cardList = new ArrayList<>(deckOfCards);
        Collections.fill(cardList, card);
        Collections.addAll(cardList, card, card, card);
        Collections.copy(cardList, deckOfCards);
        int frequency = Collections.frequency(cardList, card);
        System.out.println("Frequency of " + card + " is " + frequency);
        System.out.println("MIN = "+ Collections.min(cardList));
        System.out.println("MAX = "+ Collections.max(cardList));
//        printDeckOfCards(cardList);
    }

    private static void printDeckOfCards(List<Card> deckOfCards) {
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s", deckOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }
    }

}
