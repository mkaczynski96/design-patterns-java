package creational.factorymethod;

import creational.factorymethod.factory.Game;
import creational.factorymethod.factory.GamePlaystation;
import creational.factorymethod.factory.GameWindows;

public class Main {
    private static final String usersPlatform = "Windows 10";
    private static Game game;

    public static void main(String[] args) {
        checkUsersPlatform();
        runGame();
    }

    static void checkUsersPlatform(){
        // Hardcoded due to my Mac operating system ;)
        if (usersPlatform.equals("Windows 10")) {
            game = new GameWindows();
        } else {
            game = new GamePlaystation();
        }
    }

    static void runGame(){
        game.renderGame();
    }
}
