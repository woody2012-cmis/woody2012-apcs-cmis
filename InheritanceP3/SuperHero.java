public abstract class SuperHero
{
    private String suitColor;
    private String name;
    private boolean hasCape;
    public SuperHero()
    {
        this.suitColor = new String();
        this.hasCape = false;
        this.name = new String();
    } 

    public void setSuitColor(String suitColor)
    {
        this.suitColor = new String( suitColor );
    } 

    public String getSuitColor()
    {
        return suitColor;  
    }

    public void setCape(boolean cape)
    {
        this.hasCape = cape;   
    } 

    public boolean isCaped()
    {
        return hasCape;
    } 

    public void setName(String name)
    {
        this.name = new String( name );
    } 
    
    public String getName()
    {
        return name;  
    } 

    public abstract String motto();  

    public String toString()
    {
        String output = new String("");
        output =  getName() + "\t" +hasCape + "\t" + getSuitColor() + "\t" + motto();
        return output;
    }
} // end abstract class SuperHero
