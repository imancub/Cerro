package code.diff.ready;

import code.diff.ready.enums.Color;
import code.diff.ready.enums.Type;
import code.diff.ready.models.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Game g = new Game();
        System.out.println(g.getDeck());

        Player abi = new Human("Abi");
        Player odun = new Human("Odun");
        Player giwa = new Human("Giwa");
        Player cortana = new Computer(1);

        g.addPlayer(abi);
        g.addPlayer(odun);
        g.addPlayer(giwa);
        g.addPlayer(cortana);

        System.out.println(g.getPlayers());

        System.out.println(g.getPlayers());
        g.deal();
        System.out.println(g.getPlayers());
        System.out.println(g.getDeck());

        System.out.println("Discard pile " + g.getDiscardPile());
        g.currentPlayerMakeMove();
        System.out.println("Discard pile " + g.getDiscardPile());
        g.currentPlayerMakeMove();
        System.out.println("Discard pile " + g.getDiscardPile());
        g.currentPlayerMakeMove();
        System.out.println("Discard pile " + g.getDiscardPile());
        g.currentPlayerMakeMove();

        ArrayList<Integer> grades = new ArrayList<>();



    }
}
