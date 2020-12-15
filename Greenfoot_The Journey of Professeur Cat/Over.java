import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Last Scene
 * 
 * @author Hong Hien Pham
 * @version 12/14/2020
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
        // Shows Total Score
        getBackground().drawImage(score, 350,200);
        
        Button credit = new Button(2, -50);
        addObject(credit, 1150, 150);
   
        Button home = new Button(4, -50);
        addObject(home, 1350, 150);  
    }
}
