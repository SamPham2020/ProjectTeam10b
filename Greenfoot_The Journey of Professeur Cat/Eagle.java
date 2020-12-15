import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Eagle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eagle extends Actor
{
    
    /**
     * Act - do whatever the Eagle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       turnTowards(Cat3.getCat3XPos(), Cat3.getCat3YPos());
       move(2);
       turn(180);
    }    
}
