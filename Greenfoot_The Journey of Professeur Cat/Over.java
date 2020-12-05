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
        super(1416, 672, 1);
        prepare();
    }
    public void prepare() {
        Button credit = new Button(2, -100);
        addObject(credit, 425, 450);
        
        Button in = new Button(3, -100);
        addObject(in, 175, 450);
        
        Button home = new Button(4, 20);
        addObject(home, 1250, 150);  
    }
}
