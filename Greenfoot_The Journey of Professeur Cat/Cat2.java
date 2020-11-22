import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
* Write a description of class Cat2 here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Cat2 extends Actor
{
    private boolean isDown;
    public int speed = 4;
    private int counter = 0;
    private int iCorrectForKey = 0;
    private GreenfootImage stand = null;
    private GreenfootImage run1 = null;
    private GreenfootImage run2 = null;
    
    public Cat2() {
        stand = new GreenfootImage("Stand1.png");    
        run1 = new GreenfootImage("Run1.png");
        run2 = new GreenfootImage("Run2.png");
        setImage(stand);
        isDown = false; 
    }
    
    /**
     * Act - do whatever the Cat2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        movement();
        if (isMove()) {           
            switchImage();
        }
        else
            setImage(stand);    
        if (isTouching(Bat.class) || isTouching(Ball.class)) {
            stand = new GreenfootImage("squishedCat4.png");
            speed = 0;
        }   
        if (isTouching(Star.class)) {
            removeTouching(Star.class);
            Lvl2 myworld = (Lvl2) getWorld();
            myworld.addStar(-1);  
            myworld.addObject(new Correct(), 1380, 230 + iCorrectForKey * 40);
            iCorrectForKey++;
        }
        if (isTouching(Entrance2.class)) {           
            speed = 0;
            Greenfoot.setWorld(new Lvl3());                
        }
        if (speed == 0 && !isTouching(Entrance2.class)){  
            if (counter == 50) {
                Lvl2 myworld = (Lvl2)getWorld();
                myworld.loseLife(1);
                getWorld().removeObject(getWorld().getObjects(Heart.class).get(0));            
                getWorld().removeObject(this);   
            }
            else
                counter++;
        }
        
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
        else 
            isDown = false;
    }
}
