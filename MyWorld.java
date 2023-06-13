import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(4000, 698, 1,false); 
        getBackground().setColor(new Color(20,20,240));
        getBackground().fill();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //Keep
        addObject(new Ground(),0,686);
        addObject(new Ground(),282,686);
        addObject(new Player(),200,600);
        addObject(new Coin(),200,500);
        addObject(new Enemy(),400,300);
        Ground ground3 = new Ground();
        addObject(ground3,462,508);
        Ground ground4 = new Ground();
        addObject(ground4,624,315);
        Ground ground5 = new Ground();
        addObject(ground5,214,142);
        Ground ground6 = new Ground();
        addObject(ground6,1054,172);
        Ground ground7 = new Ground();
        addObject(ground7,1061,488);
        ground7.setLocation(1014,482);
        Ground ground8 = new Ground();
        addObject(ground8,1445,408);
        Ground ground9 = new Ground();
        addObject(ground9,1777,200);
        Ground ground10 = new Ground();
        addObject(ground10,1749,572);
        Ground ground11 = new Ground();
        addObject(ground11,2198,107);
        Ground ground12 = new Ground();
        addObject(ground12,2168,388);
        Ground ground13 = new Ground();
        addObject(ground13,2668,534);
        Ground ground14 = new Ground();
        addObject(ground14,2491,268);
        Ground ground15 = new Ground();
        addObject(ground15,2847,392);
        Ground ground16 = new Ground();
        addObject(ground16,3077,219);
        Ground ground17 = new Ground();
        addObject(ground17,3461,394);
        Ground ground18 = new Ground();
        addObject(ground18,3743,393);
        Ground ground19 = new Ground();
        addObject(ground19,3222,523);

        Enemy enemy2 = new Enemy();
        addObject(enemy2,601,251);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,202,85);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,999,113);
        Enemy enemy5 = new Enemy();
        addObject(enemy5,1437,341);
        Enemy enemy6 = new Enemy();
        addObject(enemy6,1758,147);
        removeObject(enemy6);
        Enemy enemy7 = new Enemy();
        addObject(enemy7,1740,512);
        removeObject(enemy7);
        Enemy enemy8 = new Enemy();
        addObject(enemy8,2421,212);
        Enemy enemy9 = new Enemy();
        addObject(enemy9,2824,332);
        Enemy enemy10 = new Enemy();
        addObject(enemy10,3212,469);
    }
}
