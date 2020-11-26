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
    private int sizeChange;
    
    public River(int sizeChange) {
        img1.scale(img1.getWidth() - sizeChange, img1.getHeight());
        setImage(img1);
    }          
}
