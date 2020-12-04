import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AMainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AMainMenu extends World
{
    /**
     * Constructor for objects of class AMainMenu.
     * 
     */
    public AMainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 600, 1);   
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ButtonForStart buttonForStart = new ButtonForStart();
        addObject(buttonForStart, 1250, 150);

        ButtonForCredit buttonForCredit = new ButtonForCredit(-100);
        addObject(buttonForCredit, 500, 400);

        ButtonForInstruction buttonForInstruction = new ButtonForInstruction(-100);
        addObject(buttonForInstruction,250, 400);

    }
}
