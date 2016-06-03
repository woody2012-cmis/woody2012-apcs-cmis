import greenfoot.*;
import java.awt.Color;
public class Score extends Actor implements Bonus
{
    int score = 0;
    public int getScore()
        {
            return score;
        }
        
    public void act()
    {
        if(score == 10)
        {
            Bonus();
        }   
        if(score == 100)
        {
            Deduction();
        }
        setImage(new GreenfootImage("Score : " + score, 24, Color.GREEN, Color.BLACK));
    }

    public void Bonus()
    {
        score += 15;
    }
    
    public void Deduction()
    {
        score += 2;
    }
}
