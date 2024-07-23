package top.softwarePlumbing.pong.game;

import top.softwarePlumbing.pong.game.Grid;
import top.softwarePlumbing.pong.game.Player;

public class Game{

    private Grid grid;

    private Player player;
    private Player npc;
    private int playerSize = 3;

    // Instance variables
    private int gridSize = 10; // 10 is the default grid size
    private boolean isRunning = false;
    private int score = 0;

    // Constructors
    public Game(){
        this.isRunning = false;
        this.score = 0;
    }
    // Custom grid size for the game
    public Game(int gridSize, int playerSize){
        this.gridSize = gridSize;
        this.isRunning = false;
        this.score = 0;

    }

    //  Main game loop
    public int run()
    {
        this.isRunning = true; 

        Player player = new Player(true, gridSize);
        Player npc = new Player(false, gridSize);

        // might be pointless
        this.player = player;
        this.npc = npc;

        Grid grid = new Grid(this.gridSize, this.player, this.npc, this.playerSize);

        System.out.println("The game has started");

        while(isRunning)
        {







            grid.RenderGrid();

        }

        return 0;

    }
}
