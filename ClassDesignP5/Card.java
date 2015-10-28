import javax.swing.JOptionPane;
public class Card
{
    private String rank;
    private String suit;
    String[] ranks = {"2 of ", "3 of ", "4 of ", "5 of ", "6 of ", "7 of ", "8 of ", "9 of ", "10 of ", "J of ", "Q of ", "K of ", "A of "};
    String[] suites = {" clubs", " spades", " diamonds", " hearts"};
    String Card;
    
    int randomslotranks = new Random().nextInt(ranks.length);
    int randomslotsuites = new Random().nextInt(suites.length);
    
    public Card()
    {
        numofcards = 52;
        cardsgiven = 3;
    }//end constructor 

    public Card(int numofcards, int cardsgiven)
    {
        this.myHand = myHand;
    }//end constructor 

    public String toString()
    {
        String output = new String();
        output = myHand; 
        return output;
    }
}