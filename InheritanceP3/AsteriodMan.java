public class AsteriodMan extends SuperHero
{
    private String suitColor;
    private boolean hasCape;
    
    public AsteriodMan()
    {
        super();
    }

    public String motto()
    {
        return "To the universe";
    }

    public String toString()
    {
        return "AsteriodMan\t" + super.toString();
    }
}
