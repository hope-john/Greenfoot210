    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class Fla here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class Fla extends Flamingo
    {
        GreenfootImage img;
                        int temp = 1;
        
        public void act() 
        {
            imgs(temp);
            temp++;
                            if(temp >= 36){
                                temp = 1;
            if(this.getX() >= 900) {
                MyWorld myWorld = new MyWorld();
                Greenfoot.setWorld(myWorld);
            }
            
        }
        setLocation(getX()+2,getY());
    }

 public void imgs(int i){
                        img = new GreenfootImage("Flamingo"+i+".png");
                        setImage(img);
                        img.scale(79,160);
                    }
                    
                    public Fla()
                    {
                        GreenfootImage im = getImage();
                        im.scale(79,160);
                    }
                }
