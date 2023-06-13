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
        Coin coin2 = new Coin();
        addObject(coin2,482,459);
        Coin coin3 = new Coin();
        addObject(coin3,300,87);
        Coin coin4 = new Coin();
        addObject(coin4,714,242);
        Coin coin5 = new Coin();
        addObject(coin5,1131,128);
        Coin coin6 = new Coin();
        addObject(coin6,997,416);
        Coin coin7 = new Coin();
        addObject(coin7,1105,412);
        Coin coin8 = new Coin();
        addObject(coin8,1436,140);
        Coin coin9 = new Coin();
        addObject(coin9,1515,324);
        Coin coin10 = new Coin();
        addObject(coin10,1771,429);
        Coin coin11 = new Coin();
        addObject(coin11,1799,80);
        Coin coin12 = new Coin();
        addObject(coin12,2186,323);
        Coin coin13 = new Coin();
        addObject(coin13,2515,223);
        Coin coin14 = new Coin();
        addObject(coin14,2183,44);
        Coin coin15 = new Coin();
        addObject(coin15,2601,493);
        Coin coin16 = new Coin();
        addObject(coin16,2008,283);
        coin16.setLocation(1957,316);
        Coin coin17 = new Coin();
        addObject(coin17,3120,312);
        Coin coin18 = new Coin();
        addObject(coin18,3048,96);
        Coin coin19 = new Coin();
        addObject(coin19,2780,52);
        BossEnemy bossEnemy = new BossEnemy();
        addObject(bossEnemy,3644,291);
    }
}
