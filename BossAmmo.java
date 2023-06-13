import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossAmmo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossAmmo extends BossEnemy
{
    int shoot = 0;
    int deltaX = 0;
    int deltaY = 0;
    /**
     * Act - do whatever the BossAmmo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        follow();
        mapMove();

        // Add your action code here.
    }

    public void follow(){
        {
            move(20);
            if (getWorld().getObjects(Player.class).isEmpty()) return; // skips following if the player is not in world
            Actor player = (Actor)getWorld().getObjects(Player.class).get(0); // gets reference to player
            if(shoot < 10){
            turnTowards(player.getX(), player.getY());
            shoot ++;  
            }else{
            setLocation(getX()+ deltaX, getY()+ deltaY);
            }
        }
    }

    public void mapMove()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + -4, getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() + 4, getY());
        }
    } 
}

