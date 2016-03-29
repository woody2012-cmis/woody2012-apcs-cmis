import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

import java.util.Random;

/**
 * A world where persons live.
 * 
 * @author Michael Kolling
 * @version 1.0.1
 */
public class MyWorld extends World
{
    /**
     * Create a new world with 8x8 cells and
     * with a cell size of 60x60 pixels
     */
    public MyWorld() 
    {
        super(400, 500, 1);        
    }

    // /**
     // * Populate the world with a fixed scenario of persons and drops.
     // */    
    // public void populate()
    // {
        // Person w1 = new Person();
        // addObject(w1, 3, 3);
        
        // Person w2 = new Person();
        // addObject(w2, 1, 7);

        // Drop l1 = new Drop();
        // addObject(l1, 5, 3);

        // Drop l2 = new Drop();
        // addObject(l2, 0, 2);

        // Drop l3 = new Drop();
        // addObject(l3, 7, 5);

        // Drop l4 = new Drop();
        // addObject(l4, 2, 6);

        // Drop l5 = new Drop();
        // addObject(l5, 5, 0);
        
        // Drop l6 = new Drop();
        // addObject(l6, 4, 7);
    // }
    
    // /**
     // * Place a number of drops into the world at random places.
     // * The number of drops can be specified.
     // */
    // public void randomLeaves(int howMany)
    // {
        // for(int i=0; i<howMany; i++) {
            // Drop drop = new Drop();
            // int x = Greenfoot.getRandomNumber(getWidth());
            // int y = Greenfoot.getRandomNumber(getHeight());
            // addObject(drop, x, y);
        // }
    // }
}