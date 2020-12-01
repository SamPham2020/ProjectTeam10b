import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends Actor
{
    private GreenfootImage button1 = new GreenfootImage("start1.png");
    private GreenfootImage button2 = new GreenfootImage("start2.png");
    private boolean mouseDown;
    
    public Buttons() {
        setImage(button1);
        mouseDown = false; 
    }
    
    /**
     * Act - do whatever the Buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (!mouseDown && Greenfoot.mousePressed(this)) {
            setImage(button2);
            mouseDown = true;
        }
        if (mouseDown && Greenfoot.mouseClicked(this)) {
            setImage(button1); 
            mouseDown = false;
        }               
    }
}
