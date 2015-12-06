import javax.swing.JOptionPane;
public class Clock
{
    private int hour ;
    private int minutes ;
    private int seconds ;
    private int totalsecs;
    
     
    public Clock(int hour, int minutes, int seconds)
    {
        this.hour = Integer.parseInt(JOptionPane.showInputDialog("Hour"));
        this.minutes = Integer.parseInt(JOptionPane.showInputDialog("Minutes"));
    }//end constructor
    
    
    public void setTime(int hour, int minutes, int seconds)
    {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public int calcsecs()
    {
        totalsecs= (hour*3600) + (minutes*60) + seconds;
        return totalsecs;
    }
   
    public void convertDaylightSaving(int savingsHour)
    {
        this.hour += savingsHour;
    }
    
    public String toString()
    {
        String output = "Time = " + hour + ":" + minutes + ":" + seconds + "\n"
                  + "Total of " + calcsecs() + " seconds" + "\n";
        return output;
    }
}//end class MySong