import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverLose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverLose extends Actor
{
    /**
     * Act - do whatever the GameOverLose wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Image (String Game_Over, String Try_Again, String Score, int score) 
    {
        GreenfootImage over = new GreenfootImage(300, 300);
        
        //getWorld().setPaintOrder(Rockx.class); //Car.class, Ball.class);
        Font font = over.getFont();
        over.setColor(new Color(125, 125, 125));
        over.fillRect(0, 0, 300, 300);
        over.setColor(new Color(150, 150, 150));
        over.fillRect(5, 5, 290, 290);
        over.setFont(font.deriveFont(20.0f));
        over.setColor(Color.WHITE);
        over.drawString(Game_Over, 70, 135);
        over.drawString(Try_Again, 70, 160);
        over.drawString(Score + score, 70, 185);
        setImage(over);
    }  
    public GameOverLose(int score) {
        Image("Game Over", "Please Try Again", "Score: ", score);
    }
}
