public class ClockStore
{
    private Clock[] clockInStock;
    private int bigClock;
    private int hour;
    private int min;
    private int sec;
    private int totalsecs;
    public ClockStore()
    {
        clockInStock = new Clock[3];
        clockInStock[0] = new Clock( 12, 30, 45 );
        clockInStock[1] = new Clock( 17, 54, 54 );
        clockInStock[2] = new Clock( 21, 05, 38 );
    }

    public int mostSeconds()
    {       
        for (int i = 0; i < clockInStock.length; i++)
        {
            if (clockInStock[i].totalsecs() > bigClock)
            {
                bigClock = i + 1;
            }
        }
        return bigClock;
    }

       public String toString()
    {
        String a = "";
        for ( Clock s : clockInStock )
        {
            a += s;
        }
        String output = String.format(
                "%s", a);
        return output;
    }
}
