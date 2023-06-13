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
         getBackground().setColor(new Color(20,20,240));
        getBackground().fill();
        addObject(new Ground(),0,686);
        addObject(new Ground(),282,686);
        addObject(new Player(),200,600);
        addObject(new Coin(),250,600);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Ground ground = new Ground();
        addObject(ground,529,428);
        Ground ground2 = new Ground();
        addObject(ground2,720,617);
        Ground ground3 = new Ground();
        addObject(ground3,677,227);
        Enemy enemy = new Enemy();
        addObject(enemy,524,359);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,649,164);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,771,548);
        Ground ground4 = new Ground();
        addObject(ground4,1146,344);
        Ground ground5 = new Ground();
        addObject(ground5,1167,136);
        Ground ground6 = new Ground();
        addObject(ground6,1700,450);
        Ground ground7 = new Ground();
        addObject(ground7,1054,549);
        Ground ground8 = new Ground();
        addObject(ground8,1384,513);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,1104,291);
        Enemy enemy5 = new Enemy();
        addObject(enemy5,1365,452);
        Enemy enemy6 = new Enemy();
        addObject(enemy6,1172,80);
        Ground ground9 = new Ground();
        addObject(ground9,2162,551);
        Ground ground10 = new Ground();
        addObject(ground10,2148,198);
        Ground ground11 = new Ground();
        addObject(ground11,2204,387);
        Ground ground12 = new Ground();
        addObject(ground12,1919,82);
        Ground ground13 = new Ground();
        addObject(ground13,2532,485);
        Ground ground14 = new Ground();
        addObject(ground14,2727,107);
        Ground ground15 = new Ground();
        addObject(ground15,2822,399);
        Ground ground16 = new Ground();
        addObject(ground16,1927,328);
        Ground ground17 = new Ground();
        addObject(ground17,2472,230);
        ground16.setLocation(2003,324);
        removeObject(ground16);
        Enemy enemy7 = new Enemy();
        addObject(enemy7,2163,145);
        Enemy enemy8 = new Enemy();
        addObject(enemy8,2441,164);
        Enemy enemy9 = new Enemy();
        addObject(enemy9,2556,438);
        Enemy enemy10 = new Enemy();
        addObject(enemy10,2224,322);
        Enemy enemy11 = new Enemy();
        addObject(enemy11,1710,372);
        Enemy enemy12 = new Enemy();
        addObject(enemy12,2177,478);
        Ground ground18 = new Ground();
        addObject(ground18,267,536);
        Amo amo = new Amo();
        addObject(amo,68,612);
        Amo amo2 = new Amo();
        addObject(amo2,107,640);
        Amo amo3 = new Amo();
        addObject(amo3,68,538);
        amo2.setLocation(124,616);
        Amo amo4 = new Amo();
        addObject(amo4,124,616);
        Amo amo5 = new Amo();
        addObject(amo5,40,564);
        Amo amo6 = new Amo();
        addObject(amo6,90,567);
        Amo amo7 = new Amo();
        addObject(amo7,183,646);
        amo.setLocation(88,598);
        Amo amo8 = new Amo();
        addObject(amo8,88,598);
        Amo amo9 = new Amo();
        addObject(amo9,126,500);
        Amo amo10 = new Amo();
        addObject(amo10,68,484);
        amo10.setLocation(56,505);
        Amo amo11 = new Amo();
        addObject(amo11,56,505);
        ground8.setLocation(1385,509);
        ground4.setLocation(1168,295);
        enemy4.setLocation(1108,250);
        enemy4.setLocation(1099,224);
        Ground ground19 = new Ground();
        addObject(ground19,932,402);
        ground19.setLocation(920,101);
        ground19.setLocation(835,72);
        Ground ground20 = new Ground();
        addObject(ground20,3162,277);
        Ground ground21 = new Ground();
        addObject(ground21,3503,185);
        Ground ground22 = new Ground();
        addObject(ground22,3455,449);
        Ground ground23 = new Ground();
        addObject(ground23,3740,447);
        ground23.setLocation(3720,456);
        ground23.setLocation(3719,452);
        BossEnemy bossEnemy = new BossEnemy();
        addObject(bossEnemy,3578,331);
    }
}
