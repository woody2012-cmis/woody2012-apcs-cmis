import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
public class FallingObjects extends Actor
{
    public FallingObjects()
    {

    }

    public void act()
    {
        fall();
        
    }

    

    public void fall()
    {
        setLocation(getX(), getY()+1);                                                                                                                                                  
    }
}