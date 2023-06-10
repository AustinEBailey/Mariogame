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
        super(1000, 700, 1, false); 
        addObject(new Ground(),0,684) ;
        addObject(new Ground(),282,684) ;
        addObject(new tall(),0,0) ;
        addObject(new Player(),50,500) ;
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
        Ground ground = new Ground();
        addObject(ground,563,684);
        Ground ground2 = new Ground();
        addObject(ground2,843,684);
        tall tall = new tall();
        addObject(tall,395,656);
        tall tall2 = new tall();
        addObject(tall2,422,656);
        tall tall3 = new tall();
        addObject(tall3,450,656);
        tall tall4 = new tall();
        addObject(tall4,477,656);
        tall tall5 = new tall();
        addObject(tall5,436,628);
        tall tall6 = new tall();
        addObject(tall6,463,628);
        tall tall7 = new tall();
        addObject(tall7,504,656);
        tall tall8 = new tall();
        addObject(tall8,491,629);
        tall tall9 = new tall();
        addObject(tall9,455,601);
        tall tall10 = new tall();
        addObject(tall10,483,600);
        tall10.setLocation(483,600);
        tall tall11 = new tall();
        addObject(tall11,483,600);
    }
}

