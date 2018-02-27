import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
   //GreenfootSound myMusic = new GreenfootSound("Song1.mp3");
    
    private int frame;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false); 
        GreenfootImage image = new GreenfootImage("Palma_forest.png");
        image.scale(1000,800);
        setBackground(image);
        
        Ground gr = new Ground();
        addObject(gr,500,650);
        
       
        
        Flami flm = new Flami();
        addObject(flm,150,520);
        frame = 0;
        
        Counter counter = new Counter();
        addObject(counter,100,65);
        
        //Over ov = new Over();
        //addObject(Ov,500,400);
        
      
      //myMusic.play();    
    }
    public void act()
    {
        if( frame == 15 ){
            addObject(new under(),Greenfoot.getRandomNumber(880),0);
            frame = 0;
        }
        frame++;
    }
    
   
}



