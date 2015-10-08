public class MySong
{
    //1. Create instance variables
    private String songName;
    private String songGenre;
    private double songLength;

    //2. Write constructor to initialize instance variables
    public MySong()
    {
        songName = new String ("Catch Me If You Can.");
        songGenre = new String ("EDM.");
        songLength = 3.45;
    }//end contructor ClassDesignP1

    public MySong(String songName, String songGenre, double songLength)
    {
        this.songName = songName;
        this.songGenre = songGenre;
        this.songLength = songLength;
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