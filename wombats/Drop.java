import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
public class Drop extends FallingObjects
{
    public Drop()
    {
        super();
    }

    public void act()
    {

    }

    public void fall()
    {
        setLocation(getX(), getY()+1);
    }

    public void remove()
    {
        MyWorld world = (MyWorld)getWorld();
        if(getY() >= world.getHeight() -5)
        {
            world.removeObject(this);
        }
    }
}