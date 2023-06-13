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
        addObject(new Ground(),0,686);
        addObject(new Ground(),282,686);
        addObject(new Player(),200,600);
        Ground ground = new Ground();
        addObject(ground,413,578);
        Ground ground2 = new Ground();
        addObject(ground2,690,260);
        Ground ground3 = new Ground();
        addObject(ground3,782,429);
        Ground ground4 = new Ground();
        addObject(ground4,1119,113);
        Ground ground5 = new Ground();
        addObject(ground5,1105,579);
        Ground ground6 = new Ground();
        addObject(ground6,1623,433);
        Ground ground7 = new Ground();
        addObject(ground7,1575,289);
        Ground ground8 = new Ground();
        addObject(ground8,1943,565);
        Ground ground9 = new Ground();
        addObject(ground9,1953,179);
        Ground ground10 = new Ground();
        addObject(ground10,2474,394);
        Ground ground11 = new Ground();
        addObject(ground11,2751,160);
        Ground ground12 = new Ground();
        addObject(ground12,2136,375);
        ground11.setLocation(2889,285);
        ground2.setLocation(475,656);
        ground.setLocation(100,600);
        ground.setLocation(200,676);
        ground.setLocation(164,651);
        ground2.setLocation(303,657);
        ground4.setLocation(593,140);
        ground3.setLocation(575,560);
        ground.setLocation(132,647);
        ground2.setLocation(260,647);
        ground.setLocation(208,536);
        ground.setLocation(142,672);
        ground2.setLocation(351,676);
        ground2.setLocation(351,676);
        ground2.setLocation(351,675);
        ground4.setLocation(712,416);
        ground3.setLocation(602,626);
        ground3.setLocation(427,493);
        ground4.setLocation(915,263);
        ground5.setLocation(874,429);
        ground3.setLocation(527,543);
        ground8.setLocation(1274,440);
        ground9.setLocation(1229,172);
        ground10.setLocation(1606,562);
        ground11.setLocation(1952,322);
        ground12.setLocation(2258,426);
        ground2.setLocation(368,293);
        ground3.setLocation(680,122);
        ground3.setLocation(520,533);
        ground2.setLocation(591,122);
        removeObject(ground3);
        removeObject(ground3);
    }
}
