import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main Menu
 * 
 * @author Hong Hien Pham
 * @version 12/5/2020
 */
public class AMainMenu extends World
{
    /**
     * Constructor for objects of class AMainMenu.
     */
    public AMainMenu()
    {    
        super(1500, 600, 1);   
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Button start = new Button();
        addObject(start, 1250, 150); 
        
        Button credit = new Button(2, -100);
        addObject(credit, 500, 400);
        
        Button in = new Button(3, -100);
        addObject(in, 250, 400);
    }
}
