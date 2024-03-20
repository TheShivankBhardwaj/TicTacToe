package machine_coding.tictaktoe.exceptions;

public class InvalidGameStateException extends RuntimeException{
    public InvalidGameStateException(String s){
        super(s);
    }
}
