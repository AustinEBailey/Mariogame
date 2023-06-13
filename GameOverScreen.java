import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Font;

//keep
/**
 * Write a description of class GameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScreen extends World
{
    //keep
    /**
     * Constructor for objects of class GameOverScreen.
     * 
     */
    public GameOverScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //keep
        super(1300, 698, 1); 
        drawScreen(Color.BLACK,Color.WHITE,"GAME OVER");
    }

    public void drawScreen(Color bgColor, Color textColor, String message)
    {
        GreenfootImage bg = new GreenfootImage(getWidth(),getHeight());
        bg.setColor(bgColor);
        bg.fillRect(0,0,getWidth(),getHeight());
        setBackground(bg);
        Font f = new Font("SansSerif",60);
        bg.setFont(f);
        bg.setColor(textColor);
        bg.drawString(message,getWidth()/2-message.length()*20, getHeight()/2);
        //keep
    }
}