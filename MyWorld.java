import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Island1 island1 = new Island1();
        addObject(island1,125,161);
        Rock rock = new Rock();
        addObject(rock,261,167);
        Island3 island3 = new Island3();
        addObject(island3,490,320);
        Rock rock2 = new Rock();
        addObject(rock2,1264,446);
        Rock rock3 = new Rock();
        addObject(rock3,695,333);
        Island2 island2 = new Island2();
        addObject(island2,893,195);
        removeObject(rock2);

        addObject(rock2,1081,150);
        Land land = new Land();
        addObject(land,1439,320);
        Rock rock4 = new Rock();
        addObject(rock4,1198,500);
        Rock rock5 = new Rock();
        addObject(rock5,1315,100);
        Cat cat = new Cat();
        addObject(cat,122,129);
        House house = new House();
        addObject(house,1444,43);
        Key key = new Key();
        addObject(key,536,299);
        Key key2 = new Key();
        addObject(key2,904,107);
        Key key3 = new Key();
        addObject(key3,1440,443);
    }
}
