import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Cat of level 3 
 * 
 * @author Hong Hien Pham
 * @version 12/14/2020
 */
public class Cat3 extends MutualCat
{
    private int counter;
    private static int x;
    private static int y;
    /**
     * Act - do whatever the Cat3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        x = getX();
        y = getY();
        movement();
        encounter();        
    }    
        
    /**
     * Interaction between cat3 and other objects and the consequences of lv3
     */
    private void encounter() {
        Lvl3 myworld = (Lvl3) getWorld();     
        //if touch train or car 
        if (isTouching(Car.class) || isTouching(Train.class)) {
            getWorld().setPaintOrder(Instruction.class, Bridge.class, Car.class, Flag.class, Train.class);
            myworld.squish();
            stand = new GreenfootImage("squishedCat4.png");
            speed = 0;
        }   
        
        //if touch eagle
        if (isTouching(Eagle.class)) {
            stand = new GreenfootImage("Dead.png");
            speed = 0;        
        }
        
        int rockSpeed = 2;
        // if touch river
        if (getX() > 1320 && getX() < 1390  || getX() > 500 && getX() < 605) {
            if (isTouching(Rock.class) && speed != 0) {
                setLocation(getX(), getY() + rockSpeed);
                getWorld().setPaintOrder(MutualCat.class);
            }
            else
            {               
                stand = new GreenfootImage("graycatdrowed2.png");
                myworld.drowned();
                getWorld().setPaintOrder(Rock.class);
                speed = 0;                
            }
        }     
        // if touch key
        if (isTouching(Key.class)) {
            removeTouching(Key.class);
            myworld.addKey(-1);  
        }
        // if touch house 
        if (isTouching(House.class)) {           
            getWorld().showText("Congratz! You have finished the sample lv3.", 700, 330); 
            speed = 0;
            Greenfoot.setWorld(new Over());    
            myworld.win();
        }
        // if lose life 
        if (speed == 0 &&  !isTouching(House.class)){  
            if (counter == 5) {                
                myworld.loseLife(1);
                getWorld().removeObjects(getWorld().getObjects(Eagle.class)); 
                getWorld().removeObject(getWorld().getObjects(Heart.class).get(0));            
                getWorld().removeObject(this); 
                counter = 0;
            }
            else
                counter++;
        }     
    }   
    
    public static int getCat3XPos() {
        return x;
    }

    public static int getCat3YPos() {
        return y;
    }    
}
