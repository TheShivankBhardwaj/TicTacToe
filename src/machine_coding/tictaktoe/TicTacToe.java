package machine_coding.tictaktoe;

import machine_coding.tictaktoe.controllers.GameController;
import machine_coding.tictaktoe.models.*;

import java.util.*;

//THIS WILL ACT AS A CLIENT AND WILL WORK WITH CONTROLLER CLASS
public class TicTacToe {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        //HUMAN PLAYERS
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many human players?");
        int numOfHumanPlayers = scanner.nextInt();

        List<Player> players = new ArrayList<>();
        Set<Character> symbolSet = new HashSet<>();
        for(int i=0;i<numOfHumanPlayers;i++)
        {
            System.out.println("Enter name and symbol for player");
            String name = scanner.next();
            String symbolStr = scanner.next();
            char symbol = symbolStr.charAt(0);
            while(symbolSet.contains(symbol))
            {
                System.out.println("Enter a new symbol");
                symbolStr = scanner.next();
                symbol = symbolStr.charAt(0);
            }
            symbolSet.add(symbol);
            players.add(new HumanPlayer(name,new Symbol(symbol)));
        }

        //BOT PLAYER
        System.out.println("How many bots?");
        int numOfBotPlayers = scanner.nextInt();
        String s ="abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        for(int i=0;i<numOfBotPlayers;i++)
        {
            System.out.println("Choose Bot difficulty level: E,M,D");
            String diffLevelStr = scanner.next();
            BotLevel botLevel;
            switch (diffLevelStr.charAt(0)){
                case 'E':
                    botLevel =  BotLevel.EASY;
                    break;
                case 'M':
                    botLevel =  BotLevel.MEDIUM;
                    break;
                case 'D':
                    botLevel =  BotLevel.DIFFICULT;
                    break;
                default:
                    System.out.println("Invalid Input, Choosing Easy");
                    botLevel = BotLevel.EASY;
            }
            int idx =random.nextInt(s.length());
            char symbol=s.charAt(idx);
            while(symbolSet.contains(symbol))
            {
                idx =random.nextInt(s.length());
                symbol=s.charAt(idx);
            }
            symbolSet.add(symbol);
            players.add(new BotPlayer("Bot"+(i+1), new Symbol(symbol), botLevel));

        }
    }
}
