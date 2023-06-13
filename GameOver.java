import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GeameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GameOver()
    {
        setImage(new GreenfootImage("GAME OVER",48, Color.WHITE,Color.BLUE));
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("enter"))
        {   
            Greenfoot.setWorld(new MyWorld());
        }
        // Add your action code here.

    }
}
