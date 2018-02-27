import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Flam extends Flamingo
{
   private int img;
   private int direction;
   GreenfootImage[] rightImage = new GreenfootImage[36];
   GreenfootImage[] leftImage = new GreenfootImage[36];
   public Flam()
   {
      GreenfootImage img = getImage();
                        img.scale(79,160); 
       for(int i = 0;i<36 ; i++){
           rightImage[i] = new GreenfootImage("Flamingo"+(i+1)+".png");
           leftImage[i] = new GreenfootImage("Flamingo"+(i+1)+".png");
           leftImage[i].mirrorHorizontally();
        }
        
    }
    private int speed = 5;
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("Right"))
        {
            setLocation(getX()+5,getY());
            img +=1;
            direction = 1;
            
            GreenfootImage img = getImage();
                        img.scale(79,160); 
        }
        if(Greenfoot.isKeyDown("Left"))
        {
            setLocation(getX()-5,getY());
            img -=1;
            direction = -1;

            GreenfootImage img = getImage();
                        img.scale(79,160); 
    
    } 
    if(Greenfoot.isKeyDown("space"))
    {
        shoot();
    }

   
    if(img>=36)img-=36;
    if(img<0)img+=36;
    if(direction ==1){setImage(rightImage[img]);}
    else{setImage(leftImage[img]);}
}
public void shoot()
{
    getWorld().addObject(new Laser(),getX(),getY());
}
}
