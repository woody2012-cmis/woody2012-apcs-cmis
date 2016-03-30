import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
public class Drop extends Actor
{
    public Drop()
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