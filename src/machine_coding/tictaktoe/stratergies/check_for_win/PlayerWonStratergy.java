package machine_coding.tictaktoe.stratergies.check_for_win;

import machine_coding.tictaktoe.models.Board;
import machine_coding.tictaktoe.models.Cell;
import machine_coding.tictaktoe.models.Move;

public interface PlayerWonStratergy {

    public boolean checkForWin(Board board, Cell currentCell);

    public void handleUndo(Move move);
}
