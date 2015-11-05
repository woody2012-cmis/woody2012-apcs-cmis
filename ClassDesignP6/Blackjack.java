public class Blackjack
{
    public String ranks;
    public String suits;

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
        String result = String.format(
        "%s %s", ranks, suits);
        return result;
    }
}