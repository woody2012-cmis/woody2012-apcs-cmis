public class Driver
{
    public static void main ( String[] args )
    {
        Jukebox song = new Jukebox();
        System.out.println( song );
        System.out.println( "Random Song = " + song.randomSong() + "\n");
        System.out.println("Song with rating of 5 is " + song.playSongofRating(5));
    }
}