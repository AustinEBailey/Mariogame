import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class BossEnemy extends Actor
{
    int vspeed = 0; 
    int accel = 1;
    int count = 1;
    int speed = 1;
    int shotDelay = 0;
    boolean check = false;
    boolean act = true;
    int timer = 1;
    int health = 50;
    /**
     * Act - do whatever the BossEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(check == false){
            checkFall();
        }
        mapMove();
        moveEnemy();
        shoot();
        hitByProjectile();
        // Add your action code here.
    }
      public void hitByProjectile()
    {
        if (isTouching(Projectile.class))
        {
            health--;
            Actor projectile = getOneIntersectingObject(Projectile.class);
            getWorld(). removeObject(projectile);
            if(health <=0)
            {
                int x = Greenfoot.getRandomNumber(2);
                if( x == 0){
                getWorld().addObject(new Ammo(), getX(), getY());
                } else {
                getWorld().addObject(new Coin(), getX(), getY());
                }
                getWorld(). removeObject(this); 
                Greenfoot.setWorld(new Endscreen());
            }
        }
    }

        public void fall()
        {
            setLocation(getX(), getY() + vspeed);
            vspeed = vspeed + accel; 

        }

        public void checkFall(){
            if(!isTouching(Ground.class))
                do{
                    fall();  
                }while(onGround() == false);

            if (isTouching(Ground.class))
                setLocation(getX(),getY() -1); 

            check = true;
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

        public void shoot()
        {
            int x = Greenfoot.getRandomNumber(500);
            if(shotDelay >= x * 100)
            {
                getWorld().addObject(new BossAmmo(), getX(), getY());
                shotDelay = 0;
            }
            shotDelay++;
        }

      

        boolean onGround()
        {
            Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2,Ground.class);
            return under != null;
        }

        public void mapMove()
        {
            if(Greenfoot.isKeyDown("right"))
            {
                setLocation(getX()  -4, getY());
            }
            if(Greenfoot.isKeyDown("left"))
            {
                setLocation(getX() + 4, getY());
            }
        }

    }
