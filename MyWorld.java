import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyWorld extends World {

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld() {
        super(1000, 700, 1, false);
        getBackground().setColor(new Color(20, 20, 240));
        getBackground().fill();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        addObject(new BasicEnemy(), 180, 200);
        addObject(new Ground(), 0, 684);
        addObject(new Ground(), 282, 684);
        addObject(new Brick(), 0, 0);
        addObject(new Player(), 50, 500);
        Ground ground = new Ground();
        addObject(ground, 564, 684);
        Ground ground2 = new Ground();
        addObject(ground2, 846, 684);
        Brick Brick = new Brick();
        addObject(Brick, 410, 656);
        Brick Brick2 = new Brick();
        addObject(Brick2, 437, 656);
        Brick Brick3 = new Brick();
        addObject(Brick3, 437, 656);
        Brick Brick4 = new Brick();
        addObject(Brick4, 464, 656);
        Brick Brick5 = new Brick();
        addObject(Brick5, 491, 656);
        Brick Brick6 = new Brick();
        addObject(Brick6, 518, 655);
        Brick Brick7 = new Brick();
        addObject(Brick7, 544, 656);
        Brick Brick8 = new Brick();
        addObject(Brick8, 514, 628);
        Brick Brick9 = new Brick();
        addObject(Brick9, 436, 629);
        Brick Brick10 = new Brick();
        addObject(Brick10, 463, 629);
        Brick Brick11 = new Brick();
        addObject(Brick11, 463, 603);
        Brick Brick12 = new Brick();
        addObject(Brick12, 489, 629);
        Brick Brick13 = new Brick();
        addObject(Brick13, 488, 604);
        Brick Brick14 = new Brick();
        addObject(Brick14, 488, 577);
        Brick Brick15 = new Brick();
        addObject(Brick15, 513, 601);
        Brick Brick16 = new Brick();
        addObject(Brick16, 514, 577);
        Brick Brick17 = new Brick();
        addObject(Brick17, 540, 628);
        Brick Brick18 = new Brick();
        addObject(Brick18, 539, 602);
        Brick Brick19 = new Brick();
        addObject(Brick19, 539, 578);

    }
}
