import greenfoot.*;
import java.awt.Color;
public class Counter extends Actor  
{
    int score = 0;
    int speed = 5;
    public void increaseSpeed(int speed)
    {
        if (score == 10)
        {
            this.speed += speed;
        }
    }

    public void act()
    {
        setImage(new GreenfootImage("Score : " + score, 24, Color.GREEN, Color.BLACK));
        GameOver();
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

    public void GameOver()
    {
        if (score < 0)
        {
            for (int i = 0; i <= 0; i++)
            {
                GameOver gameover= new GameOver();
                World myWorld = getWorld();
                myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
                Greenfoot.stop();
            }
        }
    }
}