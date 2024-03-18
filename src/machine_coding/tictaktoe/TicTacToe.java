package machine_coding.tictaktoe;

import machine_coding.tictaktoe.controllers.GameController;
import machine_coding.tictaktoe.models.*;

import java.util.*;

//THIS WILL ACT AS A CLIENT(FRONTEND) AND WILL WORK WITH CONTROLLER CLASS
public class TicTacToe {
    public static void main(String[] args) {
        GameController gameController = new GameController();

//PLAYERS LIST CREATED
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
        Game game;
        try{
            game = gameController.createGame(players);
        } catch (Exception e){
            System.out.println("Error while creating the game : "+e.getMessage());
            return;
        }

        //START PLAYING THE GAME
        //WHILE THE GameStatus IS IN PROGRESS
        // 1. PRINT THE BOARD.
        // 2. MAKE A MOVE.
        //      2.1 CHECK IF THE PLAYER HAS WON OR NOT.
        //          2.1.1 IF THE PLAYER WINS SET THE GameStatus TO ENDED
        //          2.1.2 ELSE IF DRAW , SET THE GameStatus TO DRAW
        //          2.1.3 ELSE PASS THE CHANCE TO THE NEXT PLAYER, AND CAPTURE THE MOVE.

        while (gameController.getGameStatus(game) == GameStatus.IN_PROGRESS){
            gameController.printBoard(game);
        }
    }
}
