import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
public class BadDrop extends FallingObjects
{
    public BadDrop()
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
        MyWorld world = (MyWorld)getWorld();
        Actor baddrop= new BadDrop();
        if(getY() >= world.getHeight() -5)
        {
            world.removeObject(baddrop);
        }
    }
}