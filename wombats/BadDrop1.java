import greenfoot.*;
public class BadDrop1 extends FallingObjects
{
    public BadDrop1()
    {
        super();
    }

    public void act()
    {
        super.act();
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
        }
    }
}