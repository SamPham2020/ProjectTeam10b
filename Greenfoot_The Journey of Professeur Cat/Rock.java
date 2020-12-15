import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Rock 
 * 
 * @author Hong Hien Pham
 * @version 12/14/2020
 */
public class Rock extends Obstacles
{
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement(2);
        if (isAtEdge()) {
            getWorld().removeObject(this); 
        }          
    }    
}
