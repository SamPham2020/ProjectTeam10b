import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl3 extends MutualWorld
{
    private GreenfootSound carSound = new GreenfootSound("Car_passby.wav"); 
     
    /**
     * Constructor for objects of class Lvl3.
     * 
     */
    public Lvl3()
    {
        prepare();
    }
    
    public void act() {
        addObstacles();   
        carSound.play();
        if (Greenfoot.isKeyDown("i"))
            Greenfoot.setWorld(new InstructionPage());        
        if (Greenfoot.isKeyDown("m"))
            Greenfoot.setWorld(new AMainMenu());       
        if (Greenfoot.isKeyDown("r"))
            Greenfoot.setWorld(new Lvl3());              
    }    
        
    /**
     * Add obstacles 
     */
    public void addObstacles() {
        setPaintOrder(Branch.class, Bridge.class, Flag.class, Cat3.class, Key.class);
        if (counter == 10) {
            if (Greenfoot.getRandomNumber(100) < 3) {   
                addObject(new Car(), 750, 672);
                addObject(new Train(), 150, 0);
                addObject(new Rock(), 520, 0);
                addObject(new Rock(), 590, 0);
            }            
            
            if (Greenfoot.getRandomNumber(100) < 4) {
                addObject(new Car(), 950, 672);
                addObject(new Train(), 250, 0);
                addObject(new Rock(), 520, 0);                
            }
    
            if (Greenfoot.getRandomNumber(100) < 5) {
                addObject(new Car(), 1150, 672);
                addObject(new Rock(), 1350, 0);
                addObject(new Train(), 350, 0);      
            }
            
            counter = 0;
        }
        else 
            counter++;   
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {   
        for (int i = 0; i < 3; i++) {
            addObject(new Track(), 150 + 100 * i, 300);
        }

        for (int i = 0; i < 3; i++) {
            addObject(new Road(), 750 + 200 * i, 300);
            addObject(new Bridge(), 750 + 200 * i, 25);
        }

        River river1 = new River(32);
        addObject(river1, 550, 300);           
        River river2 = new River(82);
        addObject(river2, 1350, 300);

        Cat3 cat = new Cat3();
        addObject(cat,41,296);

        for (int i = 0; i < 3; i++) {
            addObject(new Key(), Greenfoot.getRandomNumber(1300) + 100, Greenfoot.getRandomNumber(350) + 50);   
        }  

        Flag flag = new Flag();
        addObject(flag,284,473);
    }    
}
