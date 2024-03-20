package machine_coding.tictaktoe.stratergies.bot_playing;

import javafx.util.Pair;
import machine_coding.tictaktoe.models.Board;

public interface BotPlayingStatergy {

    public Pair<Integer,Integer> makeMove(Board board);
}
