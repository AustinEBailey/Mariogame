import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BasicEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BasicEnemy extends Actor
{
    /**
     * Act - do whatever the BasicEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    int deltaX =0;
    int deltaY =0;
          if (Greenfoot.isKeyDown("left"))  
        {
            deltaX = deltaX = -1;
            setRotation(0);
        }

        if (Greenfoot.isKeyDown("right"))  
        {
            deltaX = deltaX  = + 1;
            setRotation(0);
        }
        setLocation(getX() + deltaX, getY() + deltaY);
    }
}
