import java.util.ArrayList;
public class MyPod
{
    private String color;
    private int memory;
    ArrayList<String> songLibrary = new ArrayList<String>();

    public MyPod()
    {
        // initialise instance variables
        this.color = new String("Yellow");
        this.memory = 32;
        songLibrary.add( "Wait" );
        songLibrary.add( "Turning Tables" );
        songLibrary.add( "Drift" );
        songLibrary.add( "Smoke" );
        songLibrary.add( "The Scientist" );
        songLibrary.add( "Smother" );
        songLibrary.add( "Up&Up" );
    }

    public MyPod(String color, int memory, String[] songLibrary)
    {
        this.color = color;
        this.memory = memory;
    }

    public String toString()
    {
        String output = new String();

        output = color + "\n" + memory + "GB" + "\n";

        for( String s : songLibrary)
        {
            output += s + "\n";
        }

        return output;
    }
}