import javax.swing.JOptionPane;
public class Card
{
    private String equipment;
    private int pax;
    
    public Card()
    {
        this.equipment = "A333 HS-PKS";
        this.pax = 213;
    }

    public Card(String equipment, int pax)
    {
        this.equipment = equipment;
        this.pax = pax;
    }//end userinout constructor 

    public String toString()
    {
        String output = new String();
        output = "JX480/ BKK-HKG / EQUIPMENT: " + equipment + " / " + "PAX: " + pax; 
        return output;
    }
}