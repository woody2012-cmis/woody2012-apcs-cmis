import greenfoot.*;
public class BadDrop extends FallingObjects
{
    public BadDrop()
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
        }
    }
}