import javax.swing.JOptionPane;
public class MySong
{
    //1. Create instance variables
    private String songName;
    private String songGenre;
    private double songLength;
    private int yearReleased;
    String mins = "";
    String user = JOptionPane.showInputDialog( "Usernam");
    int pass = Integer.parseInt(JOptionPane.showInputDialog( "Password"));
    
    //2. Write constructor to initialize instance variables
    public MySong()
    {
        songName = new String ("Catch Me If You Can.");
        songGenre = new String ("EDM.");
        songLength = 3.45;
        yearReleased = 2014;
    }//end contructor 
    
     public MySong(String songName, String songGenre, double songLength)
    {
        this.songName = songName;
        this.songGenre = songGenre;
        this.songLength = songLength;
    }
    
    public int getyearReleased()
    {
        return yearReleased;
    }//end method getyearReleased

    public void setyearReleased(int year)
    {
        if (user.equals("Woody") && pass == (123))
        {
            this.yearReleased=year;
        }
    }//end method setyearReleased
    
     public String convertToSecond()
    {
        mins = (int)(songLength/60) + "." + (int)(songLength%60);
        return mins;
    }

    public String toString()
    {
        String output = new String();
        output = "The song is called " + songName + "\n" +
        "The genre is " + songGenre + "\n" +
        "The song length is " + songLength + " mins.";
        return output;
    }//end method toString()
}

   