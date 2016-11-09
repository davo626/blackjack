package com.company;

/**
 * Created by student4 on 09.11.16.
 */
public class Card {
    Suit suit;
    Value value;

    @Override
    public String toString() {
        return "" + value + " OF " + suit;
    }

    public Card(Suit suit, com.company.Value value) {
        this.suit = suit;
        this.value = value;
    }
}
