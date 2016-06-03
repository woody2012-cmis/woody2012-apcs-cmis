import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
public class Drop1 extends FallingObjects
{
    public Drop1()
    {
        super();
    }

    public void act()
    {

        fall();
        remove();
        
    }

    public void fall()
    {
        super.fall();
    }

    public void remove()
    {
        if(getY() >=  getWorld().getHeight() -5)
        {
            World myWorld = getWorld();
            myWorld.removeObject(this);
            MyWorld world = (MyWorld)myWorld;
            Counter counter = world.getCounter();
            counter.subtractScore();
        }
    }
}