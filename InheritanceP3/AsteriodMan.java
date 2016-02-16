public class AsteriodMan extends SuperHero
{
    private String motto;
    
    public AsteriodMan()
    {
        super();
       
    }
    
    public abstract String motto()
    {
        return "To the universe";
    }

    public String toString()
    {
        return super.toString() + String.format("\nMotto: %s", motto);
    }
}
