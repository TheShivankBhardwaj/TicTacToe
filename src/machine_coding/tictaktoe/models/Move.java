package machine_coding.tictaktoe.models;

public class Move {
    private Player player;
    private Cell cell;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Move(Player player, Cell cell) {
        this.player = player;
        this.cell = cell;
    }
}
