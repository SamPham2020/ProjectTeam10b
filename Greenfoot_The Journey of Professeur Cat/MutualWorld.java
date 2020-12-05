import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Parent world for all levels
 * 
 * @author Hong Hien PHam, Shawn Gregory
 * @version 12/5/2020
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
    
    //need to make mutual method to avoid repeating
    public void loseLife(int life) {        
        if (lifeNum > 0) {
           loseSound.play();
            lifeNum -= life;
            showText("Life:" + lifeNum, 50, 50);  
       }
       if (lifeNum > 0) {
            addObject(new Cat3(), 41, 296); 
       }
       if (lifeNum < 1) {
           addObject(new GameOverLose(score), 750, 300);               
       }
    }       
    
    /**
     * Play SFX when drowed
     */
    public void drowned() {
        splashSound.play();
    }
    
    /**
     * Play SFX when get something
     */
    public void gainSound() {
        get1Sound.play();
    }
    
    /** 
     * Play SFX when win
     */
    public void win() {
        winSound.play();
    }

    /**
     * Play SFX when get crushed
     */
    public void squish() {
        squishedSound.play();
    }  
    
    /**
     * prepare for initial world
     */
    private void prepare() {       
        for (int i = 0; i < lifeNum; i++) {
            addObject(new Heart(), 1480, 494 - i * 40);            
        }
        
        Button home = new Button(4, 20);
        addObject(home,1470, 567);  
        
        Button in = new Button(3, 20);
        addObject(in,1420,567);
    }      

    /**
     * add star, score, heart(based on number of stars)
     */
    public void addStar(int stars) { 
        starNum += stars;   
        score += 100;
        showText("score: " + score, 150, 50);
        if (starNum == 0) {        
            addObject(new Heart(), 1480, 414 + lifeNum * 40);              
            if (lifeNum <= 2) {               
                ++lifeNum;
                showText("Life: " + lifeNum, 50, 50);
            }
        }
    }       
}
