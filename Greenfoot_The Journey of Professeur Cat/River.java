import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class River here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class River extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("river .png");
    
    public River() {
        img1.scale(img1.getWidth() - 82, img1.getHeight());
        setImage(img1);
    }
    
    /**
     * Act - do whatever the River wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
