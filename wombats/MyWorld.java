import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

import java.util.Random;

/**
 * A world where persons li
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
        prepare();
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
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BadDrop baddrop = new BadDrop();
        addObject(baddrop,230,56);
        Person person = new Person();
        addObject(person,223,481);
        person.setLocation(215,478);
        Drop drop = new Drop();
        addObject(drop,113,176);
    }

    private int time = 1;
    private int count = 1;
    public void act() 
    {
        if(time == 0)
        {
            BadDrop r1 = new BadDrop();
            addObject(r1, (int)(Math.random()*400) + 1, 0);
            time = 20;
            count = 1;
        }
        if(counter())
        {
            time--;
            count = 1;
        }
    }    

    private boolean counter()
    {
        if(count > 0)
        {
            count--;
        }
        return count == 0;
    }
}