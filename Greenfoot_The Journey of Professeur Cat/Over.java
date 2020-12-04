import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Over extends World
{
    /**
     * Constructor for objects of class Over.
     * 
     */
    public Over()
    {    
        super(1500, 600, 1); 
        ButtonForHome buttonForHome = new ButtonForHome(20);
        addObject(buttonForHome,1470,567);        
    }
}
