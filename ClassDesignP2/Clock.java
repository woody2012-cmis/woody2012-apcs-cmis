import javax.swing.JOptionPane;
public class Clock
{
    //1. Create instance variables
    private int hour;
    private int minute;
    private int second;

    //2. Write constructor to initialize instance variables
    public Clock()
    {
        this.hour = 18;
        this.minute = 25;
        this.second = 22;
    }//end contructor ClassDesignP1

    public Clock(int hour, int minute, int second)
    {
        this.hour = Integer.parseInt(JOptionPane.showInputDialog("Enter the hour"));
        this.minute = Integer.parseInt(JOptionPane.showInputDialog("Enter the minute"));
        this.second = Integer.parseInt(JOptionPane.showInputDialog("Enter the second"));
    }//end contructor ClassDesignP1

    public String toString()
    {
        String output = new String();
        output = hour + ":" + minute + ":" + second;
        return output;
    }//end method toString()
}