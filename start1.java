import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start1 extends World
{
     GreenfootSound myMusic = new GreenfootSound("Song1.mp3");

    /**
     * Constructor for objects of class start1.
     * 
     */
    public start1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        GreenfootImage image = new GreenfootImage("Palma_forest.png");
        image.scale(1000,800);
        setBackground(image);
        
        Ground gr = new Ground();
        addObject(gr,500,650);
        
        Start st = new Start();
        addObject(st,850,520);
        
        Fla fl = new Fla();
        addObject(fl,200,520);
        
        Word wo = new Word();
        addObject (wo,500,60);
        
        arrows ar = new arrows();
        addObject (ar,200,720);
        
        bar ba = new bar();
        addObject (ba,620,730);
        
        myMusic.play();
       

    }
    
}
