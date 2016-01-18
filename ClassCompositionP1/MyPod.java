public class MyPod
{
    // instance variables 
    private String color;
    private String[] songLibrary;
    private int memory;

    public MyPod()
    {
        // initialise instance variables
        this.color = new String("Yellow");
        this.songLibrary = new String[3];
        this.memory = 32;
    }

    public MyPod(String color, int memory)
    {
        // put your code here
        this.color = new String(color);
        this.memory = memory;
        this.songLibrary = new String[3];
        songLibrary[0] = new String("Wait");
        songLibrary[1] = new String("Turning Tables");
        songLibrary[2] = new String("Drift");
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
