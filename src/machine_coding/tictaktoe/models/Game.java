package machine_coding.tictaktoe.models;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> player;
    private GameStatus gameStatus;
    private int currentPlayerIdx;
    private List<Move> moves;
    public static GameBuilder getBuilder(){
        return new GameBuilder();
    }

    public static class GameBuilder{
        private Board board;
        private List<Player> player;
        private GameStatus gameStatus;
        private int currentPlayerIdx;
        private List<Move> moves;

        public GameBuilder setPlayer(List<Player> player) {
            this.player = player;
            int n = player.size();
            this.board = new Board(n+1);
            return this;
        }

        public Game build(){
            int botCount = 0;
            for(Player p: player){
                if(p instanceof BotPlayer){
                    botCount++;
                }
                if(botCount>1){
                    throw new Exception();
                }
            }
        }
    }

}
