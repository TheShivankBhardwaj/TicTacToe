package machine_coding.tictaktoe.controllers;

import machine_coding.tictaktoe.exceptions.BotCountExceededException;
import machine_coding.tictaktoe.models.Game;
import machine_coding.tictaktoe.models.GameStatus;
import machine_coding.tictaktoe.models.Player;

import java.util.List;

public class GameController {
    public Game createGame(List<Player> players) throws BotCountExceededException {
        Game game = Game.getBuilder()
                .setPlayer(players)
                .build();
        return game;
    }

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

    public void printBoard(Game game){
        game.printBoard();
    }
    public void makeMove(Game game){
        game.makeMove();

    }
}
