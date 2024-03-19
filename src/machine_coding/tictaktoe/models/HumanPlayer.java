package machine_coding.tictaktoe.models;

import javafx.util.Pair;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HumanPlayer extends Player{


    public HumanPlayer(String name, Symbol s) {
        super(name, s);
    }

    @Override
    public Pair<Integer, Integer> makeMove() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Its "+this.getName() +" 's turn Enter row first and then col");
            int row= scanner.nextInt();
            int col= scanner.nextInt();
            return new Pair<>(row,col);
    }
}
