import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int jumpHight= -20;
    int vspeed =0; 
    int accel = 1;
    int speed = 2;
    int playerHeath = 3;
    boolean touchedByEnemy =false; 
    int score;
    public void act()
    {
        checkFalling();
        addLife();
        move();
        hitCoin();
        display();
        hitByEnemy();
        // Add your action code here.
    }

    public void move()
    {
        if(Greenfoot.isKeyDown("space") && (onGround()==true))
        {
            vspeed = jumpHight; 
            fall();
        }
    }

    public void fall()
    {
        setLocation(getX(), getY() + vspeed);
        vspeed = vspeed + accel; 
    }

    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2,Ground.class);
        return under != null;
    }

    public void checkFalling()
    {
        if(onGround() == false)
        {   
            fall();
            if (getY() > 700){
                playerHeath = 0;            
            }
        }
        else if (isTouching(Ground.class))
        {
            setLocation(getX(),getY() -1);
            vspeed = 0; 
        }

    }

    public void hitByEnemy()
    {
        if(isTouching(Enemy.class)&& !touchedByEnemy)
        {
            playerHeath --; 
            touchedByEnemy = true;
        }
        else if(!isTouching(Enemy.class))
        {
            touchedByEnemy = false;
        }
        if (playerHeath ==0)
        {
            Greenfoot.delay(10);
            getWorld(). removeObject(this);
            Greenfoot.setWorld(new GameOverScreen());
            Greenfoot.stop();
        }
    }

    public void hitCoin(){
        if(isTouching (Coin.class)){
            score = score + 1;
        }
        Actor coin = getOneIntersectingObject(Coin.class);
        if(coin != null){
            getWorld(). removeObject(coin);

        }
    }

    public void addLife()
    {
        if(score == 3 )
        {
            playerHeath = playerHeath + 1;
            score = 0;
        }
    }

    public void display()
    {
        getWorld().showText("playerHeath:" + playerHeath + "score:" + score, getWorld(). getWidth()/8,20);
    }
}

