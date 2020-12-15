import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Car 
 * 
 * @author Hong Hien Pham
 * @version 12/14/2020
 */
public class Car extends Obstacles
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement(-1);
        
        if(getY() == 50) {
            getWorld().addObject(new Car(), getX(), 600);
            getWorld().removeObject(this);
        }
    }    
}
