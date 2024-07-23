package top.softwarePlumbing.pong;

import top.softwarePlumbing.pong.game.Game;

public class Main{

    public static void main(String[] args){
        int gridSize = 20;
        int playerSize = 3;
        // Game instamnce to run the game
        Game game = new Game(gridSize, playerSize);
        game.run();
            
    }

}
