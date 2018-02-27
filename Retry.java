import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Retry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Retry extends Actor
{
    /**
     * Act - do whatever the Retry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.getMouseInfo()!=null && Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }
        else if (Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
        
        
    }  
    
    public Retry()
    {
        GreenfootImage img = getImage();
                        img.scale(170,225);
    }
}
