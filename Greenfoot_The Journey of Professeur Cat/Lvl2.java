import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2 extends World
{

    /**
     * Constructor for objects of class Lvl2.
     * 
     */
    public Lvl2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1410, 670, 1); 
    }

    public void act() {
        if (Greenfoot.isKeyDown("i"))
            Greenfoot.setWorld(new InstructionPage());        
        if (Greenfoot.isKeyDown("m"))
            Greenfoot.setWorld(new AMainMenu());            
    }    
}
