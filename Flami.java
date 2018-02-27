import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flami here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flami extends Actor
{
    /**
     * Act - do whatever the Flami wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   private int img;
   private int direction;
   public static int fireRate = 45;
   GreenfootImage[] rightImage = new GreenfootImage[36];
   GreenfootImage[] leftImage = new GreenfootImage[36];
   public Flami()
   {
      GreenfootImage img = getImage();
      img.scale(79,160); 
       for(int i = 0;i<36 ; i++){
           rightImage[i] = new GreenfootImage("Flamingo"+(i+1)+".png");
           rightImage[i].scale(79,160);
           leftImage[i] = new GreenfootImage("Flamingo"+(i+1)+".png");
           leftImage[i].scale(79,160);
           rightImage[i].mirrorHorizontally();
        }
        
    }
    private int speed = 5;
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("Right"))
        {
            setLocation(getX()+3,getY());
            img +=1;
            direction = -1;
            
            image();
        }
        if(Greenfoot.isKeyDown("Left"))
        {
            setLocation(getX()-3,getY());
            img -=1;
            direction = 1;

            image();
    
    } 
    if(Greenfoot.isKeyDown("space"))
    {
        fireRate--;
        if(fireRate==0){
            shoot();
            fireRate=45;
        }
    }

    
    if(img>=36)img-=36;
    if(img<0)img+=36;
    if(direction ==1){setImage(rightImage[img]);}
    else{setImage(leftImage[img]);}
    
    death();
    Lase();
}
public void image(){
    GreenfootImage img = getImage();
                        img.scale(79,160); 
}
public void shoot()
{
    getWorld().addObject(new Laser(),getX()+3,getY());;
    getWorld().addObject(new LaserLeft(),getX()-3,getY());;
}
public void death()
{
    Actor under = getOneObjectAtOffset(0,0,under.class);
    if(under !=null){
        World myWorld = getWorld();
        Over ov = new Over();
        myWorld.addObject(ov,500,400);
        myWorld.removeObject(this);
        
        Retry re = new Retry();
        myWorld.addObject(re,500,600);
    }
}
public void Lase()
{
    //Actor Laser = getOneObjectAtOffset(0,0,Laser.class);
    //if(Laser !=null){
      //  World MyWorld;
       // World myWorld = getWorld();
       // myWorld.removeObject(under);
    }
}

 
