package machine_coding.tictaktoe.stratergies.bot_playing;

import javafx.util.Pair;
import machine_coding.tictaktoe.exceptions.InvalidGameStateException;
import machine_coding.tictaktoe.models.Board;
import machine_coding.tictaktoe.models.Cell;
import machine_coding.tictaktoe.models.CellStatus;

import java.util.List;

public class EasyBotPlayingStatergy implements BotPlayingStatergy{

    @Override
    public Pair<Integer, Integer> makeMove(Board board) {
       for(List<Cell> row : board.getCells()){
           for(Cell cell : row){
               if(cell.getCellStatus().equals(CellStatus.UNOCCUPIED)){
                   return new Pair<>(cell.getRow(), cell.getCol());
               }
           }
       }
        throw new InvalidGameStateException("No place for bot to make a move");
    }
}
