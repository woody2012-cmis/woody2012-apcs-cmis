public class Clock
{
    private int hours;
    private int mins;
    private int secs;
    private int totalsecs;
    private int addhour;
   
    public Clock()
    {
        hours = 18;
        mins = 23;
        secs = 42;
    }
    
    public Clock(int hours,int mins, int secs)
    {
        this.hours=hours;
        this.mins=mins;
        this.secs=mins;
    }
    
    
    public void setTime(int hours,int min, int secs)
    {
        this.hours=hours;
        this.mins=mins;
        this.secs=mins;
    }
    
    //convert time to secs
    public int totalsecs()
    {
        totalsecs = (hours*3600) + (mins*60) + secs;
        return totalsecs;
    }
    
    //daylightsaving +1 hour
    public int convertDaylightSaving(int addhour)
    {
        this.hours = this.hours+addhour;
        return hours;
    }
    
    public String toString()
    
    {
         String result = String.format(
        "Time: %02d : %02d : %02d \n"+
        "Total seconds: %d\n", hours, mins, secs, totalsecs);
        return result;
    }
    
}
