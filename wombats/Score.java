import greenfoot.*;
import java.awt.Color;

public class Score extends Actor  
{

    int score = 0;

    /**
     * Constructor for objects of class Counter
     */
    public void act()
    {
        int score = ((Person) getWorld().getObjects(Person.class).get(0)).getScore();
        setImage(new GreenfootImage("Score : " + score, 24, Color.GREEN, Color.BLACK));
    }
    

   
}
