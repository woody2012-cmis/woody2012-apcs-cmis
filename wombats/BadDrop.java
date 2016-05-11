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
            getWorld().removeObject(this);
            GameOver gameover = new GameOver();
            myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
        }
    }
}