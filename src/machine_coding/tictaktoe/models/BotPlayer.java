package machine_coding.tictaktoe.models;

import javafx.util.Pair;
import machine_coding.tictaktoe.factories.BotPlayingStratergyFactory;
import machine_coding.tictaktoe.stratergies.bot_playing.BotPlayingStatergy;
import machine_coding.tictaktoe.stratergies.bot_playing.EasyBotPlayingStatergy;

public class BotPlayer extends Player
{
    private BotLevel botlevel;
    private BotPlayingStatergy botPlayingStatergy;

    public BotPlayer(String name, Symbol s,BotLevel level) {
        super(name, s);
        this.botlevel = level;
        this.botPlayingStatergy = BotPlayingStratergyFactory.getBotPlayingStragtergy(botlevel);
    }

    @Override
    public Pair<Integer, Integer> makeMove(Board board) {
        return botPlayingStatergy.makeMove(board);
    }
}
