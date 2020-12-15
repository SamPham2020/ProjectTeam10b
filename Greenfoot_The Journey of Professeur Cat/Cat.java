import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the class of the cat interaction with the objects of the first level
 * 
 * @author Krikor Astour 
 * @version (a version number or a date)
 */
public class Cat extends MutualCat
{
    private boolean isDown;
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
     * to make the cat behave according to the game
     * interaction conditions between objects
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        movement();
        if (isTouching(Island1.class)) {
            setLocation(getX(), getY());
            getWorld().setPaintOrder(Instruction.class, GameOverLose.class, Star.class, Cat.class);
        }
        if (isTouching(Rockx.class) && speed != 0) {
            setLocation(getX(), getY() + Rockx.getSpeed());
            getWorld().setPaintOrder(Instruction.class, GameOverLose.class, Star.class, Cat.class);
        }
        else if(!isTouching(Island1.class) && !isTouching(Island2.class) && !isTouching(Island3.class) &&
        !isTouching(Rockx.class)){
            stand = new GreenfootImage("graycatdrowed2.png");
            getWorld().setPaintOrder(Instruction.class, GameOverLose.class, Star.class, Rockx.class);
            speed = 0;
        }
        if (isTouching(Star.class)) {
            removeTouching(Star.class);
            MutualWorld myworld = (MutualWorld) getWorld();
            myworld.gainSound();
            myworld.addStar(-1);
        }
        if (isTouching(Entrance2.class)) {
            getWorld().showText("Congrats! Mission Accomplished!", 700, 330);
            speed = 0;
            Greenfoot.setWorld(new Lvl2());
        }    
        if (speed == 0 &&  !isTouching(Entrance2.class)) {  
        if (counter == 25) {  
            MutualWorld myworld = (MutualWorld) getWorld();
            myworld.loseLife(1);
            getWorld().removeObject(getWorld().getObjects(Heart.class).get(0));            
            getWorld().removeObject(this);   
            counter = 0;
        }
        else
            counter++;
        }     
    }         
}
    
