public class ClockStore
{
    private Clock[] clockInStock;
    private int bigClock;
    public ClockStore()
    {
        clockInStock = new Clock[3];
        clockInStock[0] = new Clock( 12, 30, 45 );
        clockInStock[1] = new Clock( 16, 54, 23 );
        clockInStock[2] = new Clock( 21, 05, 38 );
    }

    public int mostSeconds()
    {
        
        for (int i = 0; i < clockInStock.length; i++)
        {
            if (clockInStock[i].totalsecs() > bigClock)
            {
                bigClock = i;
            }
        }
        return bigClock;
    }
    
    public String toString()
    {
        String result = String.format(
                "Time: %02d : %02d : %02d \n"+
                "Total seconds: %d\n", hour, min, sec, totalsecs);
        return result;
    }
}
