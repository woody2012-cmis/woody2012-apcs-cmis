public class MySong
{
    public String name;
    public int rating;
    
    public MySong()
    {
        name = "Party";
        rating = 5;
    }
    
    public MySong( String name, int rating )
    {
        this.name = name;
        this.rating = rating;
    }
    
    public String toString()
    {
        String output = String.format( "Name: %s \nRating: %d", name, rating );
        return output;
    }
}