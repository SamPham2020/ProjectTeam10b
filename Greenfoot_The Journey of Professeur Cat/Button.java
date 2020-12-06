import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Allow programmers to build buttons for start, credit, instruction, and home 
 * @author Hong Hien Pham
 * @version 12/5/2020
 */
public class Button extends Actor
{
    private GreenfootImage button1;
    private GreenfootImage button2;
    private GreenfootSound mouse = new GreenfootSound("MouseClicked.wav");
    private boolean mouseDown;    
    private int num;
   
    /**
     * Default constructor = start button at normal size
     */
    public Button() {
        button1 = new GreenfootImage("start.png");
        button2 = new GreenfootImage("start2.png");        
        setImage(button1);
        this.num = 1;
    }
    
    /**
     * Button constructor based on entered num: 
     *      1: start
     *      2: credit
     *      3: instruction
     *      4: home(return to the main menu + reset)
     */
    public Button(int num, int sizeChange) {
        this.num = num;
        String str = "";
        String str2 = "";
        switch (num) {
            case 1: 
                str = "start.png";
                str2 = "start2.png";      
                break;
            case 2:
                str = "c.png";
                str2 = "c2.png"; 
                break;
            case 3: 
                str = "in.png";
                str2 = "in2.png";
                break;
            default:
                str = "h1.png";
                str2 = "h2.png";                
        }                    
        button1 = new GreenfootImage(str);
        button2 = new GreenfootImage(str2);   
        button1.scale(button1.getWidth() - sizeChange, button1.getHeight() - sizeChange);      
        button2.scale(button2.getWidth() - sizeChange, button2.getHeight() - sizeChange);        
        setImage(button1);
        mouseDown = false; 
    }
    
    /**
    * Act - do whatever the Button wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.
    */
    public void act() 
    {           
        //pressed
        if (!mouseDown && Greenfoot.mousePressed(this)) {
            mouse.play();                  
            setImage(button2);      
            mouseDown = true;
        }
        //released
        if (mouseDown && Greenfoot.mouseClicked(this)) {
            setImage(button1); 
            function(num);
            mouseDown = false;
        }               
    }

    /**
     * Give a function according for the chosen number for button
     */
    public void function(int num) {
        switch (num) {
            //start => lvl1
            case 1:          
                Greenfoot.setWorld(new Lvl1());        
                break;
            //credit
            case 2: 
                getWorld().addObject(new CreditPage(), 750, 300);   
                break;
            //Instruction    
            case 3: 
                getWorld().addObject(new Instruction(), 750, 300);
                break;
            //return the main menu
            default:
                MutualWorld w = new MutualWorld();
                w.lifeNum = 3;
                w.score = 0;            
                Greenfoot.setWorld(new AMainMenu());                
        }          
    }
}
