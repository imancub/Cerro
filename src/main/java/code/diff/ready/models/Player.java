package code.diff.ready.models;

import java.util.ArrayList;

public abstract class Player {

    private int score;
    private ArrayList<Card> hand;
    private String name;

    public Player(String name) {
        this.score = 0;
        this.hand = new ArrayList<>();
        this.name = name;
    }

    public void addCardToHand(Card card) {
        this.hand.add(card);
    }

    @Override
    public String toString() {
        return name + hand + score;
    }
}
