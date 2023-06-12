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
 BasicEnemy
        super(1000, 300, 1); 
        prepare();
        addObject(new BasicEnemy(),180,200) ;
    }
        super(1000, 700, 1, false); 
        addObject(new Ground(),0,684) ;
        addObject(new Ground(),282,684) ;
        addObject(new Block(),0,0) ;
        addObject(new Player(),50,500) ;
        getBackground().setColor(new Color(20,20,240));
        getBackground().fill();
        prepare();
    }
    
 main
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

    }
}

