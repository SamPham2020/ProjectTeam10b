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
     * checks if the rocks are at the edge, if so, make the rocks move to the oposite direction
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        setLocation(getX(), getY() + speed);
        if (isAtEdge()) 
            speed *= -1;
    }
    /**
     * this method  is created to return the speed of the rocks
     */
    public static int getSpeed() {
        return speed;
    }
}
