import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl2Temp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2Temp extends World
{
    private int speed = 0;
    private int starNum = 3;
    private int lifeNum = AMainMenu.lifeNum;
    //public int lifeNum = 3; //Lvl3Sample.lifeNum;
    /**
     * Constructor for objects of class Lvl2Temp.
     * 
     */
    public Lvl2Temp()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1410, 670, 1); 
        prepare();
    }

    public void act() {
        if (Greenfoot.isKeyDown("i"))
            Greenfoot.setWorld(new InstructionPage());        
        if (Greenfoot.isKeyDown("m"))
            Greenfoot.setWorld(new AMainMenu());
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
        addObject(cat2,50,41);
        Bar bar = new Bar();
        addObject(bar, 1380, 350);
        Bat bat = new Bat();
        addObject(bat, 1100, 0);
        Bat bat2 = new Bat();
        addObject(bat2, 170, 0);
        Bat bat3 = new Bat();
        addObject(bat3, 625, 0);
        Ball ball = new Ball();
        addObject(ball, 395, 670);
        Ball ball2 = new Ball();
        addObject(ball2, 855, 670);
        for (int i = 0; i < lifeNum; i++) {
             addObject(new Heart(), 1380, 460 - (i * 40));
        }
        for (int i = 0; i < 3; i++) {
             addObject(new Star(), Greenfoot.getRandomNumber(500) + 450, Greenfoot.getRandomNumber(600) + 50);   
        } 
    }
    public void loseLife(int life) {        
        if (lifeNum >= 1) {
            lifeNum -= life;
            addObject(new Cat2(), 50, 41);
        }
        if (lifeNum == 0) 
            Greenfoot.setWorld(new Over());  
    }  
    public void addStar(int stars) { 
        starNum += stars;   
        if (starNum == 0)
            if (lifeNum != 3) {   
                lifeNum++;
                addObject(new Heart(), 1380, 380 + ((lifeNum - 1) * 40));
            }
    }
}
