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
    private int speedOnRock = 3;
    private int counter = 0;
    private GreenfootImage stand = null;
    private GreenfootImage run1 = null;
    private GreenfootImage run2 = null;
    
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
    public void act() {
        movement();
        if (isMove()) {
            switchImage();
        }
        else
            setImage(stand);
        if (isTouching(Island1.class)) {
            setLocation(getX(), getY());
            getWorld().setPaintOrder(Cat.class);
        }
        if (isTouching(Rock.class) && speed != 0) {
            setLocation(getX(), getY() + speedOnRock);
            if (isAtEdge())
                speedOnRock *= -1;
            getWorld().setPaintOrder(Cat.class);
        }
        else if(!isTouching(Island1.class) && !isTouching(Island2.class) && !isTouching(Island3.class) && !isTouching(Land.class) &&
        !isTouching(Rock.class)){
            stand = new GreenfootImage("graycatdrowed2.png");
            getWorld().setPaintOrder(Rock.class);
            speed = 0;
        }
        if (isTouching(Key.class)) {
            removeTouching(Key.class);
        }
        if (isTouching(House.class)) {
            getWorld().showText("Congrats! Mission Accomplished!", 700, 330);
            speed = 0;
        }
      //  if (Greenfoot.isKeyDown("enter"))
        //    Greenfoot.setWorld(new lvl3());
        
    }    

    /**
     * checks if the character is moving
     */
    public Boolean isMove() {
        if (speed == 4 && isDown == true)
            return true;
        else
            return false;
    }
    
    public void switchImage() {
        if (getImage() == run1) {
            if (counter == 10) {
                setImage(run2);
                counter = 0;
            }
            else
            counter += 1;
        }
        else {
            if (counter == 10) {
                setImage(run1);
                counter = 0;
            }
            else
                counter += 1;
            }
        }
        
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
    