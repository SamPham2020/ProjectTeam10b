import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int counter = 0;
    private int keyNum = 3;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1416, 672, 1); 
        prepare();
    }
   
    public void act() {
        setPaintOrder(Branch.class, Bridge.class, Flag.class, Cat.class);
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
        showKeyNum();
        if (keyNum == 0)
            addObject(new House(), 1350, 50);
    }
    
    public void showKeyNum() {
        showText("Key(s) Left: " + keyNum, 100, 100);
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
        House house = new House();
        addObject(house,70,245);
        removeObject(house);
    }
}
