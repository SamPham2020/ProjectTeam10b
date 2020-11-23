import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionPage extends World
{

    /**
     * Constructor for objects of class InstructionPage.
     * 
     */
    public InstructionPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1410, 670, 1); 
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("enter"))
            Greenfoot.setWorld(new Lvl1Temp());        
        if (Greenfoot.isKeyDown("m"))
            Greenfoot.setWorld(new AMainMenu());            
    }
}
