package top.softwarePlumbing.pong.game;

public class Player
{
    boolean isPlayer = false;
    int x = 0;
    int y = 0;

    public Player(boolean isPlayer, int gridSize)
    {
        this.isPlayer = isPlayer;
        if (isPlayer) {
            this.x = gridSize - 4;
        }
        else {
            this.x = 3;
        }
        this.y = gridSize / 2;
    }



    

}
