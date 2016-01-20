public class Clock
{
    private int hours;
    private int mins;
    private int secs;
    private int totalsecs;

    public Clock(int hours, int mins, int secs)
    {
        this.hours= hours;
        this.mins= mins;
        this.secs= secs;
    }//end constructor

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

    public String toString( )
    {
        String output = String.format(
                "%02d:%02d:%02d \n" + "Total seconds: %d\n", hours, mins, secs, totalsecs());
        //output =  "The time is " + hour + ":" +  minute + ":" + second + "\nTotal seconds is " +  totalSeconds() ;
        return output;
    }
}
