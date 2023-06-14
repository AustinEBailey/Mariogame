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
    int fallSpeed =0; 
    int accel = 1;
    int speed = 2;
    int playerHealth = 6;
    boolean touchedByEnemy =false; 
    int score;
    int ammo =80;

    public void act()
    {
        checkFalling();
        addLife();
        move();
        hitCoin();
        ammo();
        display();
        hitByBossAmmo();
        hitByEnemy();
        fireProjectile();
        // Add your action code here.
    }

    public void hitByBossAmmo()
    {
        if(isTouching(BossAmmo.class))
        {
            playerHealth --;
            Actor bossAmmo = getOneIntersectingObject(BossAmmo.class);
            getWorld().removeObject(bossAmmo);
        }
    }

    public void move()
    {
        if(Greenfoot.isKeyDown("space") && (onGround()==true))
        {
            fallSpeed = jumpHight; 
            fall();
        } else if (isTouching(Ground.class))
        {
            fallSpeed =7; 
        }
    }

    public void fall()
    {
        setLocation(getX(), getY() + fallSpeed);
        fallSpeed = fallSpeed + accel; 
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
                playerHealth = 0;            
            }
        }
        else if (isTouching(Ground.class))
        {
            setLocation(getX(),getY() -1);
            fallSpeed = 0; 
        }

    }

    public void hitByEnemy()
    {
        if(isTouching(Enemy.class)&& !touchedByEnemy)
        {
            playerHealth --; 
            touchedByEnemy = true;
        }
        else if(!isTouching(Enemy.class))
        {
            touchedByEnemy = false;
        }
        if (playerHealth ==0)
        {
            GameOver gameover =new GameOver();
            getWorld(). addObject(gameover,getX()+500,350);
            getWorld(). removeObject(this);
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
            playerHealth = playerHealth + 1;
            score = 0;
        }
    }

    public void display()
    {
        getWorld().showText("playerHealth:" + playerHealth + "score:" + score + "Ammo:"+ ammo, getWorld(). getWidth()/8,20);
    }

    public void ammo()
    {
        if(isTouching (Ammo.class)){
            ammo = ammo + 3;
        }
        Actor ammo = getOneIntersectingObject(Ammo.class);
        if(ammo != null){
            getWorld(). removeObject(ammo);

        }
    }

    public void fireProjectile()
    {
        if (Greenfoot.mousePressed(null)&& ammo >=3)
        {
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile, getX(),getY());
            projectile.turnTowards(Greenfoot.getMouseInfo().getX(),Greenfoot.getMouseInfo().getY());
            ammo--;
        }
    }
}

