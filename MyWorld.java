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
        addObject(ground,479,582);
        Ground ground2 = new Ground();
        addObject(ground2,662,435);
        Ground ground3 = new Ground();
        addObject(ground3,753,660);
        Ground ground4 = new Ground();
        addObject(ground4,1036,530);
        Ground ground5 = new Ground();
        addObject(ground5,351,294);
        Ground ground6 = new Ground();
        addObject(ground6,608,100);
        Ground ground7 = new Ground();
        addObject(ground7,940,253);
        Ground ground8 = new Ground();
        addObject(ground8,1294,346);
        Ground ground9 = new Ground();
        addObject(ground9,1304,636);
        Ground ground10 = new Ground();
        addObject(ground10,1568,478);
        Ground ground11 = new Ground();
        addObject(ground11,1596,193);
        Ground ground12 = new Ground();
        addObject(ground12,1858,339);
        Ground ground13 = new Ground();
        addObject(ground13,1869,82);
        Ground ground14 = new Ground();
        addObject(ground14,2181,521);
        Ground ground15 = new Ground();
        addObject(ground15,2177,235);
        Ground ground16 = new Ground();
        addObject(ground16,2470,368);
        Ground ground17 = new Ground();
        addObject(ground17,2717,217);
        Ground ground18 = new Ground();
        addObject(ground18,3003,99);
        Ground ground19 = new Ground();
        addObject(ground19,2731,466);
        Ground ground20 = new Ground();
        addObject(ground20,3004,561);
        Ground ground21 = new Ground();
        addObject(ground21,3100,350);
        Ground ground22 = new Ground();
        addObject(ground22,3400,339);
        Ground ground23 = new Ground();
        addObject(ground23,3680,338);
        Ground ground24 = new Ground();
        addObject(ground24,3402,479);
        Ground ground25 = new Ground();
        addObject(ground25,3364,40);
        BossEnemy bossEnemy = new BossEnemy();
        addObject(bossEnemy,3548,223);
        Enemy enemy = new Enemy();
        addObject(enemy,334,241);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,659,377);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,596,40);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,952,188);
        removeObject(enemy4);
        removeObject(enemy3);
        Enemy enemy5 = new Enemy();
        addObject(enemy5,938,182);
        Enemy enemy6 = new Enemy();
        addObject(enemy6,1278,287);
        Enemy enemy7 = new Enemy();
        addObject(enemy7,1029,455);
        Enemy enemy8 = new Enemy();
        addObject(enemy8,1560,416);
        Enemy enemy9 = new Enemy();
        addObject(enemy9,1871,281);
        Enemy enemy10 = new Enemy();
        addObject(enemy10,2182,175);
        Enemy enemy11 = new Enemy();
        addObject(enemy11,2179,465);
        removeObject(enemy10);
        Enemy enemy12 = new Enemy();
        addObject(enemy12,2496,304);
        Enemy enemy13 = new Enemy();
        addObject(enemy13,2729,408);
        Enemy enemy14 = new Enemy();
        addObject(enemy14,3004,45);
        Enemy enemy15 = new Enemy();
        addObject(enemy15,3100,301);
    }
}
