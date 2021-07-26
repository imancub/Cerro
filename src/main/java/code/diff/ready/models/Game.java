package code.diff.ready.models;

import code.diff.ready.enums.Color;
import code.diff.ready.enums.Direction;
import code.diff.ready.enums.Type;

import java.util.ArrayList;
import java.util.Collections;

public class Game {

    private ArrayList<Card> deck;
    private ArrayList<Player> players;
    private Card discardPile;
    private int currentPlayer;
    private Direction direction;

    public Game() {
        this.deck = generateDeck();
        this.players = new ArrayList<>();
        this.currentPlayer = 0;
        this.direction = Direction.CLOCKWISE;
    }

    private static ArrayList<Card> generateDeck(){

        ArrayList<Card> deck = new ArrayList<>();

        for(Color color : Color.values()){
            if(color != Color.BLACK) {
                for (Type type : Type.values()) {
                    if (type != Type.WILD && type != Type.DRAW_FOUR) {
                        deck.add(new Card(color, type));
                        if(type != Type.ZERO) {
                            deck.add(new Card(color, type));
                        }
                    }
                }
            }
        }

        for(int i = 0; i < 4; i++){
            deck.add(new Card(Color.BLACK, Type.DRAW_FOUR));
            deck.add(new Card(Color.BLACK, Type.WILD));
        }

        return deck;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public ArrayList<Player> getPlayers(){
            return players;
    }

    public void deal() {
        // Shuffle
        Collections.shuffle(this.deck);

        // Deal
        for(int i = 0; i < this.players.size(); i++){
            this.players.get(i).addCardToHand(this.deck.remove(0));
        }

        // Discard
        this.discardPile = this.deck.remove(0);

    }

    public ArrayList<Card> getDeck(){
        return deck;
    }

    public String getDiscardPile() {
        return "";
    }

    public void currentPlayerMakeMove() {
    }
}
