import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2 extends MutualWorld
{
    private int speed = 0;
    private GreenfootSound caveSound = new GreenfootSound("moving-a-boulder.wav"); 
    /**
     * Constructor for objects of class Lvl2.
     * 
     */
    public Lvl2()
    {
        prepare();
    }
    
    public void act() {
        /*sorry, this is kinda loud, so I[Sam] lowered volume,
         * you[Shawn] can delete/modify this line if you want 
         * or we can make the audio button/option for user later
         */ 
        caveSound.setVolume(50);
        caveSound.play();         
    }    

    public void loseLife(int life) {        
        if (lifeNum > 0) {
            squish();
            lifeNum -= life;
            showText("Life: " + lifeNum, 50, 50);  
        }
        if (lifeNum > 0) {
            addObject(new Cat2(), 82, 552); 
        }
        if (lifeNum < 1) {
            showText("Game Over", 750, 300);              
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Entrance2 entrance2 = new Entrance2();
        addObject(entrance2,1352,53);       
        Cat2 cat2 = new Cat2();
        addObject(cat2, 82, 552);
        for (int i = 0; i < 3; i++) {
            addObject(new Star(), Greenfoot.getRandomNumber(500) + 450, Greenfoot.getRandomNumber(600) + 50);   
        } 
        Bat bat = new Bat();
        addObject(bat,213,24);
        Bat bat2 = new Bat();
        addObject(bat2,670,22);
        Bat bat3 = new Bat();
        addObject(bat3,1141,21);
        Ball ball = new Ball();
        addObject(ball,439,562);
        Ball ball2 = new Ball();
        addObject(ball2,908,565);
    }
     
}
