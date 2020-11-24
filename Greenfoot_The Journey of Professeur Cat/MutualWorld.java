import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl3Temp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MutualWorld extends World
{
    protected int counter = 0;
    protected int keyNum = 3;  
    protected int starNum = 3;    
    protected static int score = 0; 
    protected static int lifeNum = 3;    
    private GreenfootSound get1Sound = new GreenfootSound("PointCollected.wav");
    protected GreenfootSound loseSound = new GreenfootSound("GameOver.wav");
    private GreenfootSound winSound = new GreenfootSound("yay_victory.wav");
    private GreenfootSound squishedSound = new GreenfootSound("squished.mp3");
    private GreenfootSound splashSound = new GreenfootSound("splash.mp3");
    /**
     * Constructor for objects of class Lvl3Temp.
     * 
     */
    public MutualWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 600, 1); 
        showText("Life: " + lifeNum, 50, 50);
        showText("score: " + score, 150, 50);
        prepare();
    }
    
    protected void addKey(int keys) { 
        keyNum += keys;          
        score += 100;
        showText("score: " + score, 150, 50);
        gainSound();
        if (keyNum == 0)
            addObject(new House(), 1450, 50);
    }
    
    public void loseLife(int life) {        
        if (lifeNum > 0) {
            loseSound.play();
            lifeNum -= life;
            showText("Life:" + lifeNum, 50, 50);  
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
    
    private void prepare() {       
        Bar bar = new Bar();
        addObject(bar,1481,381);
        Heart heart = new Heart();
        addObject(heart,1480,413);
        Heart heart2 = new Heart();
        addObject(heart2,1479,452);
        Heart heart3 = new Heart();
        addObject(heart3,1479,494);
    }      

    public void addStar(int stars) { 
        starNum += stars;   
        score += 100;
        showText("score: " + score, 150, 50);
        if (starNum == 0) {                       
            if (lifeNum < 3) { 
                addObject(new Heart(), 1480, 494 - lifeNum * 40);                
                lifeNum++;
                showText("Life: " + lifeNum, 50, 50);
            }
        }

    }       
}
