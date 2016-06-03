import greenfoot.*; 
import java.util.Random;
public class MyWorld extends World
{
    Counter counter = new Counter();
    /**
     * Create a new world with 8x8 cells and
     * with a cell size of 60x60 pixels
     */
    public MyWorld() 
    {
        super(400, 500, 1);        
        prepare();
    }

    public Counter getCounter()
    {
        return counter;
    }

    private void prepare()
    {
        addObject(counter, 100, 40);
        BadDrop baddrop = new BadDrop();
        addObject(baddrop,230,56);
        Person person = new Person();
        addObject(person,223,481);
        person.setLocation(215,478);
        Drop drop = new Drop();
        addObject(drop,113,176);
        removeObject(drop);
        removeObject(baddrop);
        Drop drop2 = new Drop();
        addObject(drop2,277,25);
        BadDrop baddrop2 = new BadDrop();
        addObject(baddrop2,120,22);
        removeObject(drop2);
        removeObject(baddrop2);
    }

    private int shorttime = 1;
    private int longtime = 0;
    private int count = 1;

    FallingObjects a = new Drop();
    FallingObjects b = new Drop1();
    FallingObjects c = new BadDrop();
    FallingObjects d = new BadDrop1();
    public void act() 
    {
        FallingObjects[] drop = {a,b};
        FallingObjects[] drop1 = {c,d};
        if(longtime==0)
        {
            BadDrop d1 = new BadDrop();
            addObject(d1, (int)(Math.random()*400) + 1, 0);
            longtime = 1200;
            count = 1;
        }
        if(longtime==0)
        {
            BadDrop d2 = new BadDrop();
            addObject(d2, (int)(Math.random()*400) + 1, 0);
            longtime = 1200;
            count = 1;
        }
        if(true)
        {
            longtime--;
            count = 1;
        }
        if(shorttime==1)
        {
            Drop d1 = new Drop();
            addObject(d1, (int)(Math.random()*400) + 1, 0);
            shorttime = 200;
            count = 1;
        }
        if(shorttime==1)
        {
            Drop d2 = new Drop();
            addObject(d2, (int)(Math.random()*400) + 1, 0);
            shorttime = 200;
            count = 1;
        }
        if(true)
        {
            shorttime--;
            count = 1;
        }
    }    
    // Strawberry a = new Strawberry();
    // iceCream    b = new Vanilla();
    // iceCream  c = new Chocalate();
    // Garbage e = new onion();
    // Garbage f = new bananaPeal();
    // Garbage g = new Hamburger();
    // public void act() 
    // {

    // iceCream[] drop = {a,b,c,a,b,c};
    // Garbage[] drop1={e,f,g,e,f,g};

    // if(time2 == 0)
    // {

    // addObject(drop[(int)(Math.random()*6)], ((int) (Math.random( )*500))+60,10);
    // time2 = 55;
    // count2 = 100;
    // }
    // if(time3 == 0)
    // {
    // addObject(drop1[(int)(Math.random()*6)], ((int) (Math.random( )*500))+60,10);
    // time3 = 35;
    // count3 = 50;
    // }

    // if(counter())
    // {
    // time--;
    // count = 1;
    // time2--;
    // count2 = 1;
    // time3--;
    // count3 = 1;
    // }

    // }    

    private boolean counter()
    {
        if(count > 0)//count==1
        {
            count--; //count becomes0
        }
        return count == 0; //count is 0 which is true threfore statement is true
    }
}