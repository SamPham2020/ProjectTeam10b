import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl1 extends MutualWorld
{
    private static GreenfootSound wavesSound = new GreenfootSound("ocean.wav");

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Lvl1()
    {    
        prepare();
    }
    
     public void act() {
        //int timer = 0;
        //while(timer % 2 == 0) { 
        //    wavesSound.play();
        //    timer++;
        //}
        wavesSound.play();
    }    
    
    public void loseLife(int life) {        
        if (lifeNum > 0) {
            loseSound.play();
            lifeNum -= life;
        }
        if (lifeNum > 0) {
            addObject(new Cat(), 122,129); 
        }
        if (lifeNum < 1) {
            addObject(new GameOverLose(score), 750, 300);             
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
        addObject(land,1439, 60);
        Rockx rock4 = new Rockx();
        addObject(rock4,1198,167);
        Cat cat = new Cat();
        addObject(cat,122,129);
        Island3 island32 = new Island3();
        addObject(island32,1415,0);        
        Entrance2 entrance2 = new Entrance2();
        addObject(entrance2,1444,80);
        entrance2.setRotation(40);        
        Star star = new Star();
        addObject(star,536,299);
        Star star2 = new Star();
        addObject(star2,904,107);
        Star star3 = new Star();
        addObject(star3,1239, 517);
        removeObject(land);

        island32.setLocation(1436,38);
        island32.setLocation(1446,79);
        island32.setLocation(1456,81);
        island32.setLocation(1437,78);
        island32.setLocation(1415,81);
    }
}
