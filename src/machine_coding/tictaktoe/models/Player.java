package machine_coding.tictaktoe.models;

public abstract class Player {
    private String name;
    private Symbol s;

    public Player(String name, Symbol s) {
        this.name = name;
        this.s = s;
    }


}
