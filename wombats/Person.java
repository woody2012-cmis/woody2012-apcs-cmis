import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.util.List;
import java.util.ArrayList;
public class Person extends Actor
{
    private int dropsEaten;

    public Person()
    {
        dropsEaten = 0;
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        // setRotation(90);
        // if (Greenfoot.isKeyDown("up"))
        // { 
            // move(-4);
        // }
        // if (Greenfoot.isKeyDown("down"))
        // { 
            // move(4); 
        // }
        // setRotation(0);
        if (hitDrop())
        {
            eatDrop();
        }
        eatDrop();
    }

    public boolean hitDrop()
    {
        Actor drop = getOneObjectAtOffset(0, 0, Drop.class);
        Actor baddrop = getOneObjectAtOffset(0, 0, BadDrop.class);
        if(drop != null) 
        {
            return true;
        }
        if(baddrop != null) 
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    public void eatDrop()
    {
        Actor drop = getOneObjectAtOffset(0, 0, Drop.class);
        Actor baddrop = getOneObjectAtOffset(0, 0, BadDrop.class);
        if(drop != null || baddrop != null)
        {
            // eat the drop...
            getWorld().removeObject(drop);
            getWorld().removeObject(baddrop);
            // score = score + 1;        
        }
    }
    
    // public int getScore()
       // {
        // return score;    
       // }
}