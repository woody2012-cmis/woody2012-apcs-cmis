import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
public class BadDrop extends Actor
{
    public BadDrop()
    {
        
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
        MyWorld world = (MyWorld)getWorld();
        if(getY() >= world.getHeight() -5)
        {
            world.removeObject(this);
        }
    }
}