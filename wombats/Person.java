import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

import java.util.List;
import java.util.ArrayList;

/**
 * Person. A Person moves forward until it can't do so anymore, at
 * which point it turns left. If a person finds a drop, it eats it.
 * 
 * @author Michael Kolling
 * @version 1.0.1
 */
public class Person extends Actor
{
    private static final int EAST = 0;
    private static final int WEST = 1;
    private static final int NORTH = 2;
    private static final int SOUTH = 3;

    private int direction;
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
        if (hitDrop())
        {
            eatDrop();

        }
    }

    /**
     * Check whether there is a drop in the same cell as we are.
     */
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

    /**
     * Eat a drop.
     */
    public void eatDrop()
    {
        Actor drop = getOneObjectAtOffset(0, 0, Drop.class);
        Actor baddrop = getOneObjectAtOffset(0, 0, BadDrop.class);
        if(drop != null || baddrop != null)
        {
            // eat the drop...
            getWorld().removeObject(drop);
            getWorld().removeObject(baddrop);
            dropsEaten = dropsEaten + 1; 
        }
        
    }

    // /**
     // * Move one cell forward in the current direction.
     // */
    // public void move()
    // {
        // if (!canMove()) {
            // return;
        // }
        // switch(direction) {
            // case SOUTH :
            // setLocation(getX(), getY() + 1);
            // break;
            // case EAST :
            // setLocation(getX() + 1, getY());
            // break;
            // case NORTH :
            // setLocation(getX(), getY() - 1);
            // break;
            // case WEST :
            // setLocation(getX() - 1, getY());
            // break;
        // }
    // }

    // /**
     // * Test if we can move forward. Return true if we can, false otherwise.
     // */
    // public boolean canMove()
    // {
        // World myWorld = getWorld();
        // int x = getX();
        // int y = getY();
        // switch(direction) {
            // case SOUTH :
            // y++;
            // break;
            // case EAST :
            // x++;
            // break;
            // case NORTH :
            // y--;
            // break;
            // case WEST :
            // x--;
            // break;
        // }
        // // test for outside border
        // if (x >= myWorld.getWidth() || y >= myWorld.getHeight()) {
            // return false;
        // }
        // else if (x < 0 || y < 0) {
            // return false;
        // }
        // return true;
    // }

    // /**
     // * Turns towards the left.
     // */
    // public void turnLeft()
    // {
        // switch(direction) {
            // case SOUTH :
            // setDirection(EAST);
            // break;
            // case EAST :
            // setDirection(NORTH);
            // break;
            // case NORTH :
            // setDirection(WEST);
            // break;
            // case WEST :
            // setDirection(SOUTH);
            // break;
        // }
    // }

    // /**
     // * Sets the direction we're facing.
     // */
    // public void setDirection(int direction)
    // {
        // this.direction = direction;
        // switch(direction) {
            // case SOUTH :
            // setRotation(90);
            // break;
            // case EAST :
            // setRotation(0);
            // break;
            // case NORTH :
            // setRotation(270);
            // break;
            // case WEST :
            // setRotation(180);
            // break;
            // default :
            // break;
        // }
    // }

    // /**
     // * Tell how many leaves we have eaten.
     // */
    // public int getLeavesEaten()
    // {
        // return leavesEaten;
    // }
}