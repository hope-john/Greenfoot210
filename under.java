import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class under here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class under extends Actor
{
    /**
     * Act - do whatever the under wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      
       setLocation(getX(),getY()+4);
       if( getY() > getWorld().getHeight() + 10 ) {
           getWorld().removeObject(this);
        }
    }    
    public under()
    {
        GreenfootImage img = getImage();
                        img.scale(80,100);
}
public void remove()
    {
        Actor Laser = getOneObjectAtOffset(0,0,Laser.class);
    if(Laser!=null){
        
        getWorld().removeObject(Laser);

}
}
}
