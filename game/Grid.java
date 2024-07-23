package top.softwarePlumbing.pong.game;

import top.softwarePlumbing.pong.game.Player;

public class Grid
{
    public int gridSize;
    public char[][] grid;
    private Player player;
    private Player npc;
    public int playerSize;

    public Grid()
    {

    }

    // Constructor
    public Grid(int gridSize, Player player, Player npc, int playerSize)
    {
        this.gridSize = gridSize;
        this.grid = new char[gridSize][gridSize];
        this.player = player;
        this.npc = npc;
        this.playerSize = playerSize;

        // Filling the borders
        for (int i = 0; i <= gridSize-1; i++)
        {

            this.grid[i][0] = '#';
            this.grid[i][gridSize-1] = '#';

            for (int j = 0; j <= gridSize-1; j++)
            {
                this.grid[0][j] = '#';
                this.grid[gridSize-1][j] = '#';

            }   

        }

        for (int i = 0; i <= gridSize-1; i++)
        {


            for (int j = 0; j <= gridSize-1; j++)
            {

                if ( this.grid[i][j] != '#' )
                {
                    this.grid[i][j] = ' ';

                }

            }   

        }
    }

    public void RenderGrid()
    {   

        placePlayers();

        for (int i = 0; i <= gridSize-1; i++)
        {
            for (int j = 0; j <= gridSize-1; j++)
            {
                System.out.print(this.grid[i][j]);

            }   
            System.out.println("");

        }
    }

    // Place both players on the grid
    public void placePlayers(){

        
        this.grid[this.npc.x][this.npc.y] = '=';
        for(int i = 0; i <= this.playerSize; i++){
        this.grid[this.npc.x][this.npc.y] = '=';

        }

        for(int i = 0; i <= this.playerSize; i++){
        this.grid[this.player.x][this.player.y + i] = '=';

        }
    }
}
