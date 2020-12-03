import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl1Temp extends MutualWorld
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Lvl1Temp()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        prepare();
    }
    
     public void act() {
        Greenfoot.playSound("waves.wav");
        reset();
        if (Greenfoot.isKeyDown("r"))
            Greenfoot.setWorld(new Lvl2());                  
    }    

    public void loseLife(int life) {        
        if (lifeNum > 0) {
            loseSound.play();
            lifeNum -= life;
            showText("Life: " + lifeNum, 50, 50);  
        }
        if (lifeNum > 0) {
            addObject(new Cat2(), 53,353); 
        }
        if (lifeNum < 1) {
            showText("Game Over\nPress m to return to the main menu", 705, 335);              
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Island1 island1 = new Island1();
        addObject(island1,125,161);
        Rockx rock = new Rockx();
        addObject(rock,261,167);
        Island3 island3 = new Island3();
        addObject(island3,490,320);
        Rockx rock2 = new Rockx();
        addObject(rock2,1264,167);
        Rockx rock3 = new Rockx();
        addObject(rock3,695,167);
        Island2 island2 = new Island2();
        addObject(island2,893,195);
        removeObject(rock2);

        addObject(rock2,1081,167);
        Land land = new Land();
        addObject(land,1439,320);
        Rockx rock4 = new Rockx();
        addObject(rock4,1198,167);
        Rockx rock5 = new Rockx();
        addObject(rock5,1315,167);
        Cat cat = new Cat();
        addObject(cat,122,129);
        Entrance2 entrance2 = new Entrance2();
        addObject(entrance2,1444,43);
        Star star = new Star();
        addObject(star,536,299);
        Star star2 = new Star();
        addObject(star2,904,107);
        Star star3 = new Star();
        addObject(star3,1440,443);
    }
}
