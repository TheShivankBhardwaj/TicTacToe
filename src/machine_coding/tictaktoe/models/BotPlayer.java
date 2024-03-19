package machine_coding.tictaktoe.models;

import javafx.util.Pair;
public class BotPlayer extends Player
{
    private BotLevel botlevel;
    public BotPlayer(String name, Symbol s,BotLevel level) {
        super(name, s);
        this.botlevel = level;
    }

    @Override
    public Pair<Integer, Integer> makeMove() {
        return null;
    }
}
