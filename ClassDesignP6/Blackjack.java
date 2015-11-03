public class Blackjack
{
    private String ranks;
    private String suits;

    public Blackjack()
    {
        ranks = "2";
        suits = "♥";
    }//end constructor 

    public Blackjack(String ranks, String suits)
    {
        this.ranks = ranks;
        this.suits = suits;
    }//end construtor 2

    public String toString()
    {
        String output = new String();
        output = ranks + suits;
        return output;
    }
}