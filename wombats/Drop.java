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
    }

    public void fall()
    {
        setLocation(getX(), getY()+1);
    }

    public void remove()
    {
        Actor drop= new Drop();
        MyWorld world = (MyWorld)getWorld();
        if(getY() >= world.getHeight() -5)
        {
            world.removeObject(drop);
        }
    }
}