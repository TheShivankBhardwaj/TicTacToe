package machine_coding.tictaktoe.models;

public class Cell {
    private int row;
    private int col;
    private CellStatus cellStatus;

    public Cell(int row, int col, CellStatus cellStatus) {
        this.row = row;
        this.col = col;
        this.cellStatus = cellStatus;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public CellStatus getCellStatus() {
        return cellStatus;
    }

    public void setCellStatus(CellStatus cellStatus) {
        this.cellStatus = cellStatus;
    }
}
