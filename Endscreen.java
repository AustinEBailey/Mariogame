import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Font;

//keep
/**
 * Write a description of class GameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Endscreen extends World
{
    //keep
    /**
     * Constructor for objects of class GameOverScreen.
     * 
     */
    public Endscreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //keep
        super(1300, 698, 1); 
        GreenfootImage bg = new GreenfootImage(getWidth(),getHeight());
        bg.setColor(Color.BLACK);
        bg.fillRect(0,0,getWidth(),getHeight());
        setBackground(bg);
        Font f = new Font("SansSerif",60);
        bg.setFont(f);
        bg.setColor(Color.GREEN);
        String message = "YOU WON !!!";
        bg.drawString(message,getWidth()/2 - message.length()*20, getHeight()/2);
        
    }
    }
