import greenfoot.*;
import java.awt.Color;
public class Counter extends Actor  
{
    int score = 0;
    public void act()
    {
        setImage(new GreenfootImage("Score : " + score, 24, Color.GREEN, Color.BLACK));
    }

    public void addScore()
    {
        score++;
    }
    
    public void subtractScore()
    {
        score--;
    }
    
    public void baddropScore()
    {
        score = score-10 ;
    }
    
    public int getScore()
    {
        return score; 
    }
}
