import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonForStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonForStart extends Actor
{
    protected GreenfootImage button1 = new GreenfootImage("start.png");
    protected GreenfootImage button2 = new GreenfootImage("start2.png");
    private boolean mouseDown;
    
    public ButtonForStart() {
        setImage(button1);
        mouseDown = false; 
    }
            
    /**
    * Act - do whatever the ButtonForStart wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.
    */
    public void act() 
    {    
        if (!mouseDown && Greenfoot.mousePressed(this)) {
            setImage(button2);
            mouseDown = true;
        }
        if (mouseDown && Greenfoot.mouseClicked(this)) {        
            Greenfoot.setWorld(new Lvl1());               
            setImage(button1);          
            mouseDown = false;                
        }               
    }
}
