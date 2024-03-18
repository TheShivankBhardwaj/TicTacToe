package machine_coding.tictaktoe.exceptions;

public class BotCountExceededException extends RuntimeException{
    public BotCountExceededException(String message) {
        super (message);
    }
}
