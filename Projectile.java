import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peePew here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Projectile extends Actor
{
    int prjetileSpeed=10;
    /**
     * Act - do whatever the peePew wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turnToMouse();
        move(prjetileSpeed);
        // Add your action code here.
    }

    public Projectile()
    {
        getImage().scale(30,30);
    }
    
    public void turnToMouse()
    {
        
    }
}
