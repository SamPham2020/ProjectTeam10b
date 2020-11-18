import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
* Write a description of class TemporaryCatForLvlTransition here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class TemporaryCatForLvlTransition extends Actor
{
private boolean isDown;
public int speed = 4;
private int counter = 0;
private int iCorrectForKey = 0;
private GreenfootImage stand = null;
private GreenfootImage run1 = null;
private GreenfootImage run2 = null;

public TemporaryCatForLvlTransition() {
    stand = new GreenfootImage("Stand1.png");    
    run1 = new GreenfootImage("Run1.png");
    run2 = new GreenfootImage("Run2.png");
    setImage(stand);
    isDown = false; 
}

/**
 * Act - do whatever the TemporaryCatForLvlTransition wants to do. This method is called whenever
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
    
        if (isTouching(Entrance1.class))
            Greenfoot.setWorld(new Lvl2());    
        if (isTouching(Entrance2.class))
            Greenfoot.setWorld(new Lvl3());
        if (isTouching(House.class))
            Greenfoot.setWorld(new Over());    
        
        if (isTouching(Car.class) && getX() > 560 || isTouching(Train.class) && getX() > 1000) {
            getWorld().setPaintOrder(Bridge.class, Car.class, Flag.class, Train.class);
            stand = new GreenfootImage("squishedCat4.png");
            speed = 0;
        }   
        if (isTouching(River.class) && getX() > 189 && getX() < 320) {
            if (isTouching(Rock.class) && speed != 0) {
                setLocation(getX(), getY() + 3);
                getWorld().setPaintOrder(TemporaryCatForLvlTransition.class);
            }
            else
            {               
                stand = new GreenfootImage("graycatdrowed2.png");
                getWorld().setPaintOrder(Branch.class, Rock.class);
                speed = 0;                
            }
        }
        if (isTouching(Key.class)) {
            removeTouching(Key.class);
            Lvl3Sample myworld = (Lvl3Sample) getWorld();
            myworld.addKey(-1);  
            myworld.addObject(new Correct(), 1390, 130 + iCorrectForKey * 40);
            iCorrectForKey++;
        }
        if (isTouching(House.class)) {           
            getWorld().showText("Congratz! You have finished the sample lv3.\n Press enter to go to final scene ", 700, 330); 
            speed = 0;
            if (Greenfoot.isKeyDown("enter"))
                Greenfoot.setWorld(new Over());                
        }
        if (speed == 0 &&  !isTouching(House.class)){  
            if (counter == 50) {
                Lvl3Sample myworld = (Lvl3Sample)getWorld();
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
