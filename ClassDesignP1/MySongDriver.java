public class MySongDriver
    {
    public static void main (String[] args)
        {
        MySong song1 = new MySong();
        MySong song2 = new MySong("I.", "rock ballad.", 3.27);
        System.out.println(song1 + "\n" + "\n" + song2);
        }
    }