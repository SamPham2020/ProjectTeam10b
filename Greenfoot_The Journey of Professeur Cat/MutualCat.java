import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
* Write a description of class MutualCat here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class MutualCat extends Actor
{
    private boolean isDown;
    public int speed = 4;
    public int counter = 0;
    protected int iCorrectForKey = 0;
    protected GreenfootImage stand = null;
    protected GreenfootImage run1 = null;
    protected GreenfootImage run2 = null;
    
    public MutualCat() {
        stand = new GreenfootImage("Stand1.png");    
        run1 = new GreenfootImage("Run1.png");
        run2 = new GreenfootImage("Run2.png");
        setImage(stand);
        isDown = false; 
    }
             
    /**
     * Verify if the character is moving    
     */
    public Boolean isMove() {
        if (speed == 4 && isDown == true)
            return true;
        else
            return false;
    }
        
    /**
     * Animation when moving
     */
    public void switchImage() {
        if (getImage() == run1) {
            if (counter == 10) {
                setImage(run2);
                counter = 0;
            }
            else
                counter = counter + 1;
        }
        else {
            if (counter == 10) {
                setImage(run1);
                counter = 0;
            }
            else
                counter = counter + 1;
        }             
    }
    
    /**
     * Movement made based on entered key 
     */
    public void movement() { 
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - speed);  
            isDown = true;
        }
        else if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + speed);
            isDown = true;
        }    
        else if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - speed, getY());
            isDown = true; 
        }
        else if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + speed, getY());  
            isDown = true;
        }
        else if (Greenfoot.isKeyDown("space")) {
            //setLocation(getX() + speed * 2, getY());  
            move(speed * 2);
            isDown = true;
        }
        else 
            isDown = false;
            
        if (isMove()) {           
            switchImage();
        }
        else
            setImage(stand);                
    }
}
