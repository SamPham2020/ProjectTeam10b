    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AMainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AMainMenu extends World
{
    public static int lifeNum = 3;
    /**
     * Constructor for objects of class AMainMenu.
     * 
     */
    public AMainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1410, 670, 1);   
    }
        
    public void act() {
        if (Greenfoot.isKeyDown("enter"))
            Greenfoot.setWorld(new Lvl1Temp());        
        if (Greenfoot.isKeyDown("i"))
            Greenfoot.setWorld(new InstructionPage());
        if (Greenfoot.isKeyDown("c"))
            Greenfoot.setWorld(new Credit());            
    }
    public static int getLife() {
        return lifeNum;
    }
}
