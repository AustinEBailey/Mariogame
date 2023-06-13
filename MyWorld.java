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
        super(3000, 700, 1,false); 
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
    }
}
