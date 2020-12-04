import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cat2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat2 extends MutualCat
{
    /**
     * Act - do whatever the Cat2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        encounter();  
    }    
    
    /**
     * Interaction between cat2 and other objects and the consequences of lv2
     */    
    private void encounter() {
       if (isTouching(Ball.class) || isTouching(Bat.class)) {
           getWorld().setPaintOrder(Ball.class, Bat.class);
           stand = new GreenfootImage("squishedCat4.png");
           speed = 0;
       }   
       if (isTouching(Star.class)) {
            removeTouching(Star.class);
            MutualWorld myworld = (MutualWorld) getWorld();
            myworld.gainSound();
            myworld.addStar(-1);  
            iCorrectForKey++;
       }
       if (isTouching(Entrance2.class)) {           
            speed = 0;
            Greenfoot.setWorld(new Lvl3());                
       }
       if (speed == 0 && !isTouching(Entrance2.class)){  
            if (counter == 25) {
                Lvl2 myworld = (Lvl2)getWorld();
                myworld.loseLife(1);
                getWorld().removeObject(getWorld().getObjects(Heart.class).get(0));            
                getWorld().removeObject(this);   
            }
            else
                counter++;
       }    
    }
}
