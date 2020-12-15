import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * city lvl
 * 
 * @author Hong Hien Pham 
 * @version 12/5/2020
 */
public class Lvl3 extends MutualWorld
{
    private int counter = 0;
    private int timer = 500;
    private GreenfootSound carSound = new GreenfootSound("Car_passby.wav"); 
    private GreenfootSound eagle = new GreenfootSound("Eagle.wav");     
    private GreenfootSound train = new GreenfootSound("train.wav");
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
        train.setVolume(50);
    }    
        
    /**
     * Add obstacles 
     */
    public void addObstacles() {
        setPaintOrder(Instruction.class, GameOverLose.class, Eagle.class, Bridge.class, Flag.class, Cat3.class, Key.class);         
        //When eagle appears
        if (timer == 0 && lifeNum > 0) {
            addObject(new Eagle(), 1500, 0);
            eagle.play();
            timer = 500;
        }
        else 
            timer--;
            
        if (counter == 25) {         
            if (Greenfoot.getRandomNumber(100) < 3) {  
                addObject(new Rock(), 1350, 0);
                addObject(new Rock(), 520, 0);
                addObject(new Rock(), 590, 0);                
            }            
            
            if (Greenfoot.getRandomNumber(100) < 1) {   
                train.play();
                addObject(new Car(), 775, 600);
                addObject(new Train(), 150, 0);
                addObject(new Rock(), 520, 0);
                addObject(new Rock(), 590, 0);
            }            
            
            if (Greenfoot.getRandomNumber(100) < 1) {
                train.play();
                addObject(new Car(), 975, 600);
                addObject(new Train(), 250, 0);
                addObject(new Rock(), 520, 0);                
            }
    
            if (Greenfoot.getRandomNumber(100) < 1) {
                train.play();
                addObject(new Car(),1175, 600);
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
            addObject(new Car(), 720 + 200 * i + Greenfoot.getRandomNumber(20), Greenfoot.getRandomNumber(80) + 50);             
            addObject(new Car(), 720 + 200 * i, Greenfoot.getRandomNumber(20) + 250);   
            addObject(new Car(), 720 + 200 * i + Greenfoot.getRandomNumber(20), Greenfoot.getRandomNumber(80) + 450);
            addObject(new Bridge(0), 750 + 200 * i, 25);
        }
 
        River river1 = new River(32);
        addObject(river1, 550, 300);           
        River river2 = new River(82);
        addObject(river2, 1350, 300);

        Cat3 cat = new Cat3();
        addObject(cat,41,296);

        for (int i = 0; i < 3; i++) {
            addObject(new Key(), Greenfoot.getRandomNumber(300) + 500 * i + 100, Greenfoot.getRandomNumber(250) + 100);   
        }  

        Flag flag = new Flag();
        addObject(flag,284,473);
    }    
}
