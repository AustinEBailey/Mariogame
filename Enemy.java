import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 1;
    int speed = 2;
    int vspeed = 0; 
    int accel = 1;
    boolean check = false;
    int health = 3; 
    boolean hitByprojectile =false; 
    public void act()
    {
        if(check == false){
            checkFall();
        }

        mapMove();
        moveEnemy();
        hitByProjectile();
        // Add your action code here.
    }

    public void hitByProjectile()
    {
        if (isTouching(Projectile.class)&& !hitByprojectile)
        {
            health--;
            Actor projectile = getOneIntersectingObject(Projectile.class);
            getWorld(). removeObject(projectile);
            if(health <=0)
            {
                getWorld(). removeObject(this);
            }
        }
    }

    public void checkFall(){
        if(!isTouching(Ground.class))
            do{
                fall();  
            }while(onGround() == false);

        if (isTouching(Ground.class))
            setLocation(getX(),getY() -1);
        vspeed = 0; 

        check = true;
    }

    public void mapMove()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() - 4, getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() + 4, getY());
        }
    }

    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2,Ground.class);
        return under != null;
    }

    public void moveEnemy()
    {
        if (check == true){
            if(onGround() == true){
                setLocation(getX() + count * speed, getY());
            } else{
                getImage().mirrorHorizontally();
                if (count == 1){
                    count = -1;  
                }else if (count == -1){
                    count = 1;
                }
                do{setLocation(getX() + count * speed, getY());}while(onGround() == false);

            }
        }
    }

    public void fall()
    {
        setLocation(getX(), getY() + vspeed);
        vspeed = vspeed + accel; 

    }

}
