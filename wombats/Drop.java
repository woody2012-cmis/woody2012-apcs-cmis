import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
public class Drop extends FallingObjects
{
    public Drop()
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
        setLocation(getX(), getY()+1);
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