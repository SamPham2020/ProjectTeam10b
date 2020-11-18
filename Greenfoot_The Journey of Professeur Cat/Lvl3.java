import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl3 extends World
{

    /**
     * Constructor for objects of class Lvl3.
     * 
     */
    public Lvl3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 600, 1); 
        prepare();
    }

    public void act() {
        if (Greenfoot.isKeyDown("i"))
            Greenfoot.setWorld(new InstructionPage());        
        if (Greenfoot.isKeyDown("m"))
            Greenfoot.setWorld(new AMainMenu());            
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TemporaryCatForLvlTransition tenporaryCatForLvl = new TemporaryCatForLvlTransition();
        addObject(tenporaryCatForLvl,41,296);      
        House house = new House();
        addObject(house,1452,34);
    }
}
