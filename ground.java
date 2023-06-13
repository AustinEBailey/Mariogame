//keep
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//keep
/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{//keep
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //keep
        mapMove();
        // Add your action code here.
    }
     public void mapMove()
    {
        //keep
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + -6, getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() + 6, getY());
        }
    }
}

