import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl3Sample here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl3Sample extends World
{
    private int counter = 0;
    private int keyNum = 3;
    private int lifeNum = 3;
    /**
     * Constructor for objects of class Lvl3Sample.
     * 
     */
    public Lvl3Sample()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1410, 670, 1); 
        prepare();
    }
    
    public void act() {
        setPaintOrder(Branch.class, Bridge.class, Flag.class, Cat.class);
        if (Greenfoot.isKeyDown("i"))
            Greenfoot.setWorld(new InstructionPage());        
        if (Greenfoot.isKeyDown("m"))
            Greenfoot.setWorld(new AMainMenu());           
        if (counter == 7) {
            if (Greenfoot.getRandomNumber(100) < 3) 
                addObject(new Car(), 583, 672);
            if (Greenfoot.getRandomNumber(100) < 3) {
                addObject(new Car(), 679, 672);
                addObject(new Train(), 1091, 0);
            }
            if (Greenfoot.getRandomNumber(100) < 3) 
                addObject(new Train(), 1004, 0);
            if (Greenfoot.getRandomNumber(100) < 5)
                addObject(new Rock(), 211, 0);
            if (Greenfoot.getRandomNumber(100) < 5)    
                addObject(new Rock(), 310, 0);
            counter = 0;
        }
        else 
            counter++;    
    }
    
    public void addKey(int keys) { 
        keyNum += keys;   
        if (keyNum == 0)
            addObject(new House(), 1350, 50);
    }  
    
    public void loseLife(int life) {        
        if (lifeNum > 0) {
            lifeNum -= life;           
        }
        if (lifeNum > 0) {
            addObject(new Cat(), 53,353); 
        }
        if (lifeNum < 1) 
            showText("Game Over\nPress m to return to the main menu", 705, 335);  
    }     
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cat cat = new Cat();
        addObject(cat,53,353);        
        Bridge bridge = new Bridge();
        addObject(bridge,630,26);
        Bridge bridge2 = new Bridge();
        addObject(bridge2,636,649);
        River river = new River();
        addObject(river,256,336);
        Branch branch = new Branch();
        addObject(branch,230,642);
        Branch branch2 = new Branch();
        addObject(branch2,222,7);
        Flag flag = new Flag();
        addObject(flag,1147,541);
        for (int i = 0; i < 3; i++) {
            addObject(new Key(), Greenfoot.getRandomNumber(500) + 450, Greenfoot.getRandomNumber(600) + 50);   
        }        
        Bar bar = new Bar();
        addObject(bar,1390,259);
        Heart heart = new Heart();
        addObject(heart,1390,373);
        Heart heart2 = new Heart();
        addObject(heart2,1390,330);
        Heart heart3 = new Heart();
        addObject(heart3,1390,288);
    }
}
