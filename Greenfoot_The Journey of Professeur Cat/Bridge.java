import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bridge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bridge extends Actor
{
    private GreenfootImage img1 = new GreenfootImage("bridge.png");
    private int sizeChange;
    
    public Bridge(int sizeChange) {
        img1.scale(img1.getWidth() + sizeChange, img1.getHeight());
        setImage(img1);
    }      
}
