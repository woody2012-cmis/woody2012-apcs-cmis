public class PacMan extends SuperHero
{
    private String suitColor;
    private boolean hasCape;
    
    public PacMan()
    {
        super();
    }

    public String motto()
    {
        return "To the universe";
    }

    public String toString()
    {
        return "PacMan\t" + super.toString();
    }
}
