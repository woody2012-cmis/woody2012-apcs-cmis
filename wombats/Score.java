import greenfoot.*;
import java.awt.Color;
public class Score extends Actor  
{
    int score = 0;
    public void act()
    {
        setImage(new GreenfootImage("Score : " + score, 24, Color.GREEN, Color.BLACK));
    }
    
    public int getScore()
    {
        return score;
    }
}
