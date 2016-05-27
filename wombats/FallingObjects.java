import greenfoot.*; 
public abstract  class FallingObjects extends Actor
{
    public void act()
    {

    }
    
    public abstract void fall();
    
    public abstract void remove();
    
    private int speed;
    public void incrementSpeed(int speed)
    {
        this.speed += speed;
    }
}