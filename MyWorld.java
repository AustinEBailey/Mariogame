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
        addObject(new Block(),0,0) ;
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
        addObject(ground,564,684);
        Ground ground2 = new Ground();
        addObject(ground2,846,684);
        Block block = new Block();
        addObject(block,410,656);
        Block block2 = new Block();
        addObject(block2,438,660);
        block2.setLocation(437,656);
        Block block3 = new Block();
        addObject(block3,437,656);
        Block block4 = new Block();
        addObject(block4,464,656);
        Block block5 = new Block();
        addObject(block5,491,656);
        Block block6 = new Block();
        addObject(block6,518,655);
        Block block7 = new Block();
        addObject(block7,544,656);
        Block block8 = new Block();
        addObject(block8,410,629);
        Block block9 = new Block();
        addObject(block9,436,629);
        Block block10 = new Block();
        addObject(block10,463,629);
        Block block11 = new Block();
        addObject(block11,463,603);
        Block block12 = new Block();
        addObject(block12,489,629);
        Block block13 = new Block();
        addObject(block13,488,604);
        Block block14 = new Block();
        addObject(block14,488,577);
        removeObject(block8);
        addObject(block8,514,628);
        Block block15 = new Block();
        addObject(block15,512,600);
        removeObject(block15);
        addObject(block15,513,601);
        Block block16 = new Block();
        addObject(block16,514,577);
        Block block17 = new Block();
        addObject(block17,540,628);
        Block block18 = new Block();
        addObject(block18,539,602);
        Block block19 = new Block();
        addObject(block19,539,578);
    }
}

