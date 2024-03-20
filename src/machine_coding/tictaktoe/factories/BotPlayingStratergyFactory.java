package machine_coding.tictaktoe.factories;

import machine_coding.tictaktoe.models.BotLevel;
import machine_coding.tictaktoe.stratergies.bot_playing.BotPlayingStatergy;
import machine_coding.tictaktoe.stratergies.bot_playing.EasyBotPlayingStatergy;

public class BotPlayingStratergyFactory {

    public static BotPlayingStatergy getBotPlayingStragtergy(BotLevel botLevel){
        switch (botLevel){
            case EASY :
            case MEDIUM:
            case DIFFICULT:
                return new EasyBotPlayingStatergy();
                default:
                    throw new UnsupportedOperationException("The give bot level is not supported");
        }
    }
}
