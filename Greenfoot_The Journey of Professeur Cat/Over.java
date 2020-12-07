import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Over extends World
{
    private GreenfootImage score = new GreenfootImage("" + MutualWorld.score, 120, new Color(255, 202, 24), new Color(0, 0, 0, 0));
    /**
     * Constructor for objects of class Over.
     * 
     */
    public Over()
    {    
        super(1500, 600, 1);
        prepare();
    }
    public void prepare() {
        getBackground().drawImage(score, 350,200);
        Button credit = new Button(2, -50);
        addObject(credit, 1050, 150);
        
        Button in = new Button(3, -50);
        addObject(in, 1200, 150);
        
        Button home = new Button(4, -50);
        addObject(home, 1350, 150);  
    }
}
