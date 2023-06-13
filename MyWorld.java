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
        Coin coin25 = new Coin();
        addObject(coin25,195,470);
        Coin coin26 = new Coin();
        addObject(coin26,48,511);
        coin23.setLocation(26,600);
        Coin coin27 = new Coin();
        addObject(coin27,26,600);
        Coin coin28 = new Coin();
        addObject(coin28,37,644);
        Coin coin29 = new Coin();
        addObject(coin29,115,609);
        Coin coin30 = new Coin();
        addObject(coin30,60,549);
        Coin coin31 = new Coin();
        addObject(coin31,168,628);
        Coin coin32 = new Coin();
        addObject(coin32,156,480);
        coin21.setLocation(221,556);
        Amo amo = new Amo();
        addObject(amo,221,556);
        coin20.setLocation(257,616);
        Amo amo2 = new Amo();
        addObject(amo2,257,616);
        Amo amo3 = new Amo();
        addObject(amo3,379,595);
        Amo amo4 = new Amo();
        addObject(amo4,400,655);
        coin20.setLocation(266,653);
        Amo amo5 = new Amo();
        addObject(amo5,266,653);
        coin31.setLocation(120,657);
        Amo amo6 = new Amo();
        addObject(amo6,120,657);
        coin29.setLocation(90,592);
        Amo amo7 = new Amo();
        addObject(amo7,90,592);
        coin26.setLocation(35,539);
        Amo amo8 = new Amo();
        addObject(amo8,35,539);
        coin28.setLocation(5,670);
        Amo amo9 = new Amo();
        addObject(amo9,5,670);
        Amo amo10 = new Amo();
        addObject(amo10,176,561);

        Amo amo11 = new Amo();
        addObject(amo11,195,524);
        Amo amo12 = new Amo();
        addObject(amo12,274,503);
        Amo amo13 = new Amo();
        addObject(amo13,328,584);
        coin20.setLocation(288,612);
        Amo amo14 = new Amo();
        addObject(amo14,288,612);
        Amo amo15 = new Amo();
        addObject(amo15,473,617);
        Amo amo16 = new Amo();
        addObject(amo16,422,574);
        Amo amo17 = new Amo();
        addObject(amo17,328,544);
        BossEnemy bossEnemy = new BossEnemy();
        addObject(bossEnemy,3593,289);

    }
}
