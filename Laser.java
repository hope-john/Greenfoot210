import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Laser extends Actor
{
    private int speed = 4;
    public Laser()
    {
        GreenfootImage img = getImage();
                        img.scale(120,150);
        speed = 4;
    }
    
    public void setSpeed(int s)
    {
        speed =s;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    public void act() 
    {
       
        move(speed);
         Lase();
        if(hitEdge())
        {
            World w = getWorld();
            w.removeObject(this);
        }
        
    }    
    
    public boolean hitEdge()
    {
        World w = getWorld();
        int width = w.getWidth();
        int height = w.getHeight();
        
        int laserW = getImage().getWidth();
        int laserH = getImage().getHeight();
        
        if(getX() +laserW/2 > width)
        {
            return true;
        }
        else if (getX() - laserW < 0)
        {
            return true;
        }
        else if(getY() +laserH/2 >= height)
        {
            return true;
        }
        else if (getY() - laserH/2 <=  0)
        {
            return true;
        }
        else
        {
            return false;
        }
      
    }
 
    public void Lase()
    {
        Actor un = getOneObjectAtOffset(0,0,under.class);
    if(un!=null){
        //World MyWorl
        getWorld().removeObject(un);
        World MyWorld;
        World Myworld = getWorld();
        Counter.score+=1;
    }
    }
}



