import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Train here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Train extends Obstacles
{   
    private int counter = 1;
    private GreenfootImage img1 = new GreenfootImage("train2-1.png");
    private GreenfootImage img2 = new GreenfootImage("train2-2.png");
    private GreenfootImage img3 = new GreenfootImage("train2-3.png");
    private GreenfootImage img4 = new GreenfootImage("train2-4.png");
    private GreenfootImage img5 = new GreenfootImage("train2-5.png");
    private GreenfootImage img6 = new GreenfootImage("train2.png");
    
    public Train() {
        setImage(img1);
    }
    
    /**
     * Act - do whatever the Train wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement(3);
        switchTrainImg();
    }
    
    public void switchTrainImg() {
        if (getImage() != img6) {
            if (getY() == 15) {
                setImage(img2);            
            }
            if (getY() == 30) {
                setImage(img3);            
            }     
            if (getY() == 45) {
                setImage(img4);            
            }
            if (getY() == 60) {
                setImage(img5);            
            }          
            if (getY() == 75) {
                setImage(img6);  
            }
        }
    }
}
