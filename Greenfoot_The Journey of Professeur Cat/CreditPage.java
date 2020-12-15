import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * CreditPage 
 * 
 * @author Hong Hien Pham
 * @version 12/14/2020
 */
public class CreditPage extends Actor
{
    /**
     * Act - do whatever the CreditPage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(null)){
            getWorld().removeObject(this);       
        }
    }    
}
