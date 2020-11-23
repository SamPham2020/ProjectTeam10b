import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl1Temp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl1Temp extends World
{

    /**
     * Constructor for objects of class Lvl1Temp.
     * 
     */
    public Lvl1Temp()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1410, 672, 1); 
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
        addObject(tenporaryCatForLvl,48,309);        
        Entrance1 entrance1 = new Entrance1();
        addObject(entrance1,1365,319);
    }
}
