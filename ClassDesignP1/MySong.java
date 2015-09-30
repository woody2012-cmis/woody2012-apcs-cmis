public class MySong
    {
    //1. Create instance variables
    private String songName;
    private String songGenre;
    private double songLength;
    
    //2. Write constructor to initialize instance variables
    public MySong()
        {
        songName = "Catch Me If You Can.";
        songGenre = "EDM.";
        songLength = 3.45;
        }//end contructor ClassDesignP1
    
    public String toString()
        {
        String output = new String();
        output = "The song is called " + songName + "\n" +
                 "The genre is " + songGenre + "\n" +
                 "The song length is " + songLength + " mins.";
        return output;
        }//end method toString()
    }