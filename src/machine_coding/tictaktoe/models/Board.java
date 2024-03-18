package machine_coding.tictaktoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> cells;

    public Board(int n) {
        this.cells = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Cell> row = new ArrayList<>(n);
            for(int j=0;j<n;j++){
               row.add(new Cell(i,j,CellStatus.UNOCCUPIED));
            }
            this.cells.add(row);
        }
    }

    public void printBoard(){
        int n=cells.size();
        for (int i=0;i<n;i++){
            List<Cell> row = this.cells.get(i);
            for(int j=0;j<n;j++){
                Cell cell = row.get(j);
                if(cell.getCellStatus().equals(CellStatus.UNOCCUPIED)){
                    System.out.print(" _ ");
                }
                else {
                    System.out.println();
                }
            }
            System.out.println("");
        }
        )
    }

}