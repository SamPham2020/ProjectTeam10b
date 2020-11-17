import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class Cat here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Cat extends Actor
{
    private boolean isDown;
    private int speed = 4;
    private int counter = 0;
    private int gravity = 0;
    private GreenfootImage stand = null;
    private GreenfootImage run1 = null;
    private GreenfootImage run2 = null;
    public int lvl = 0; 
    int plus = 1;
    
    public Cat() {
        stand = new GreenfootImage("Stand1.png");    
        run1 = new GreenfootImage("Run1.png");
        run2 = new GreenfootImage("Run2.png");
        setImage(stand);
        isDown = false; 
    }
    
    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
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
        if (isTouching(Car.class) && getX() > 560 || isTouching(Train.class) && getX() > 1000) {
            getWorld().setPaintOrder(Bridge.class, Car.class, Flag.class, Train.class);
            stand = new GreenfootImage("squishedCat4.png");
            speed = 0;
        }   
        if (isTouching(River.class) && getX() > 189 && getX() < 320) {
            if (isTouching(Rock.class) && speed != 0) {
                setLocation(getX(), getY() + 3);
                getWorld().setPaintOrder(Cat.class);
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
            MyWorld myworld = (MyWorld)getWorld();
            myworld.addKey(-1);         
        }
        if (isTouching(House.class)) {           
            getWorld().showText("Congratz! You have finished the sample lvl.\n Press enter to go to lvl1 ", 700, 330); 
            speed = 0;
            if (Greenfoot.isKeyDown("enter"))
                Greenfoot.setWorld(new Lvl1());                
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