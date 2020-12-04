import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonForHome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonForHome extends Actor
{
    protected GreenfootImage button1 = new GreenfootImage("h1.png");
    protected GreenfootImage button2 = new GreenfootImage("h2.png");
    private boolean mouseDown;
    
    public ButtonForHome(int sizeChange) {
        button1.scale(button1.getWidth() - sizeChange, button1.getHeight() - sizeChange);      
        button2.scale(button2.getWidth() - sizeChange, button2.getHeight() - sizeChange);  
        setImage(button1);
        mouseDown = false; 
    }
    
    /**
    * Act - do whatever the ButtonForHome wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.
    */
    public void act() 
    {    
        if (!mouseDown && Greenfoot.mousePressed(this)) {
            setImage(button2);
            mouseDown = true;
        }
        if (mouseDown && Greenfoot.mouseClicked(this)) {        
            Greenfoot.setWorld(new AMainMenu());           
            setImage(button1);          
            //Temporary reset => will put mutual world under main menu
            MutualWorld w = new MutualWorld();
            w.lifeNum = 3;
            w.score = 0;
            mouseDown = false;                
        }               
    }
}
