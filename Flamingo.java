                import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
                
                /**
                 * Write a description of class Flamingo here.
                 * 
                 * @author (your name) 
                 * @version (a version number or a date)
                 */
                public class Flamingo extends Actor
                {
                    private int speed = 10;
                    GreenfootImage img;
                    int temp = 1;
                    public void act()
                    {
                        imgs(temp);
                        temp++;
                        if(temp >= 36){
                            temp = 1;
                        }
                        
                        check();
                        
                    }
                     
                    public void imgs(int i){
                        img = new GreenfootImage("Flamingo"+i+".png");
                        setImage(img);
                        img.scale(79,160);
                    }
                    
                    public Flamingo()
                    {
                        GreenfootImage im = getImage();
                        im.scale(79,160);
                        //leftImage[i] = new GreenfootImage("Flamingo"+
                    }
                    
                    public void check()
                    {
                        if(Greenfoot.isKeyDown("left"))
                        {
                            moveLeft();
                        }
                        else if (Greenfoot.isKeyDown("right"))
                        {
                            moveRight();
                        }
                    }
                    public void moveLeft()
                    {
                        setLocation(getX()- speed,getY());
                    }
                    
                    public void moveRight()
                    {
                        setLocation(getX()+ speed,getY());
                    }
                }
                    
