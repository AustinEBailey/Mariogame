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
    int enemySpeed = -3;
    int count = 1;
    int speed = 1;
    int vspeed = 0; 
    int accel = 1;
    boolean check = false;
    public Enemy(int height, int width)
    {
        getImage().scale(height, width);
    }
    public void act()
    {
        if(check == false){
            checkFall();
        }
        mapMove();
        moveEnemy();
        size();
        // Add your action code here.
    }

    public void checkFall(){
        if(!isTouching(Ground.class))
        {   do{
                fall();  
            }while(onGround() == false);

        }
        if (isTouching(Ground.class))
        {
            setLocation(getX(),getY() -1);
            vspeed = 0; 
        }
        check = true;
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

    public void size()
    {
      

    }

}
