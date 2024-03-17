package machine_coding.tictaktoe.models;

public class BotPlayer extends Player{

    private BotLevel botlevel;
    public BotPlayer(String name, Symbol s,BotLevel level) {
        super(name, s);
        this.botlevel = level;
    }
}
