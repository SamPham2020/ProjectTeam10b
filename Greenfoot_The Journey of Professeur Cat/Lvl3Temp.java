import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl3Temp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl3Temp extends World
{
    private int counter = 0;
    private int keyNum = 3;
    private int lifeNum = 3;    
    private GreenfootSound carSound = new GreenfootSound("Car_passby.wav"); 
    private GreenfootSound get1Sound = new GreenfootSound("PointCollected.wav");
    private GreenfootSound loseSound = new GreenfootSound("GameOver.wav");
    private GreenfootSound winSound = new GreenfootSound("yay_victory.wav");
    private GreenfootSound squishedSound = new GreenfootSound("squished.mp3");
    private GreenfootSound splashSound = new GreenfootSound("splash.mp3");
    /**
     * Constructor for objects of class Lvl3Temp.
     * 
     */
    public Lvl3Temp()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 600, 1); 
        prepare();
    }

    public void act() {
        levelTransition();
        addObstacles();   
        carSound.play();
    }
    
    /**
     * Add obstacles 
     */
    public void addObstacles() {
        setPaintOrder(Branch.class, Bridge.class, Flag.class, Cat.class);
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
    
    public void addKey(int keys) { 
        keyNum += keys;           
        gainSound();
        if (keyNum == 0)
            addObject(new House(), 1450, 50);
    }  
    
    public void loseLife(int life) {        
        if (lifeNum > 0) {
            loseSound.play();
            lifeNum -= life;           
        }
        if (lifeNum > 0) {
            addObject(new Cat3(), 53,353); 
        }
        if (lifeNum < 1) {
            showText("Game Over\nPress m to return to the main menu", 705, 335);              
        }
    }        
    
    public void drowned() {
        splashSound.play();
    }
    
    public void gainSound() {
        get1Sound.play();
    }
    
    public void win() {
        winSound.play();
    }
    
    public void squish() {
        squishedSound.play();
    }
    
    /**
     * Jump bewteen pages 
     */
    public void levelTransition() { 
        if (Greenfoot.isKeyDown("r"))
            Greenfoot.setWorld(new Lvl3Temp());          
        if (Greenfoot.isKeyDown("i"))
            Greenfoot.setWorld(new InstructionPage());        
        if (Greenfoot.isKeyDown("m"))
            Greenfoot.setWorld(new AMainMenu());    
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
    
        BigRiver bigRiver = new BigRiver();
        addObject(bigRiver, 550, 300);
        River river = new River();
        addObject(river,1350, 300);
    
        Cat3 cat = new Cat3();
        addObject(cat,41,296);
    
        for (int i = 0; i < 3; i++) {
            addObject(new Key(), Greenfoot.getRandomNumber(1300) + 100, Greenfoot.getRandomNumber(350) + 50);   
        }  
    
        Flag flag = new Flag();
        addObject(flag,284,473);
    
        Bar bar = new Bar();
        addObject(bar,1481,381);
        Heart heart = new Heart();
        addObject(heart,1480,413);
        Heart heart2 = new Heart();
        addObject(heart2,1479,452);
        Heart heart3 = new Heart();
        addObject(heart3,1479,494);
    }
}
