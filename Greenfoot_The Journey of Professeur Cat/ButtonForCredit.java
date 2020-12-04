import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonForCredit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonForCredit extends Actor
{
    protected GreenfootImage button1 = new GreenfootImage("c.png");
    protected GreenfootImage button2 = new GreenfootImage("c2.png");
    private boolean mouseDown;
    
    public ButtonForCredit(int sizeChange) {
        button1.scale(button1.getWidth() - sizeChange, button1.getHeight() - sizeChange);      
        button2.scale(button2.getWidth() - sizeChange, button2.getHeight() - sizeChange);  
        setImage(button1);
        mouseDown = false; 
    }
    
    /**
    * Act - do whatever the ButtonForCredit wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.
    */
    public void act() 
    {    
        if (!mouseDown && Greenfoot.mousePressed(this)) {
            setImage(button2);
            mouseDown = true;
        }
        if (mouseDown && Greenfoot.mouseClicked(this)) {        
            getWorld().addObject(new CreditPage(), 750, 300);            
            setImage(button1);          
            mouseDown = false;                
        }               
    }
}
