import greenfoot.*; 
public   abstract class FallingObjects extends Actor
{
    public void act()
    {
        increaseSpeed();
    }

    public void fall()
    {
        setLocation(getX(), getY()+1);   
    }

    public abstract void remove();

    private int speed = 1;

    public void incrementSpeed(int speed)
    {
        this.speed += speed; 
    }

    public void increaseSpeed()
    {
        int score = ((Score) getWorld().getObjects(Score.class).get(0)).getScore();
        if(score%10==0)
        {
            incrementSpeed(10);
        }
    }
}