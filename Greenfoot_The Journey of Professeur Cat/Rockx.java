import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rockx extends Actor
{ 
    public static int speed = 3;
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        setLocation(getX(), getY() + speed);
        if (isAtEdge()) 
            speed *= -1;
    }
    
    public static int getSpeed() {
    return speed;
    }
}