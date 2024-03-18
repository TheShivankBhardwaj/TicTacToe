package machine_coding.tictaktoe.models;

import machine_coding.tictaktoe.exceptions.BotCountExceededException;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private GameStatus gameStatus;
    private int currentPlayerIdx;
    private List<Move> moves;

    private Game(Board board, List<Player> players, GameStatus gameStatus, int currentPlayerIdx, List<Move> moves) {
        this.board = board;
        this.players = players;
        this.gameStatus = gameStatus;
        this.currentPlayerIdx = currentPlayerIdx;
        this.moves = moves;
    }

    public static GameBuilder getBuilder() {
        return new GameBuilder();
    }

    public static class GameBuilder {
        private Board board;
        private List<Player> players;
        private GameStatus gameStatus;
        private int currentPlayerIdx;
        private List<Move> moves;

        public GameBuilder setPlayer(List<Player> players) {
            this.players = players;
            int n = players.size();
            this.board = new Board(n + 1);
            return this;
        }

        public Game build() throws BotCountExceededException {
            int botCount = 0;
            for (Player p : players) {
                if (p instanceof BotPlayer) {
                    botCount++;
                }
                if (botCount > 1) {
                    throw new BotCountExceededException("Found more than 1 bots, maximum only 1 bot is allowed");
                }
            }
            return new Game(this.board,this.players,GameStatus.IN_PROGRESS,0,new ArrayList<>());
        }
    }
}
