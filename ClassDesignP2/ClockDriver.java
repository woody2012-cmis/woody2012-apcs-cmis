public class ClockDriver
{
    public static void main (String[] args)
    {
        Clock KitchenClock = new Clock();
        Clock BedroomClock = new Clock(15, 20, 10); 
        
        System.out.println(KitchenClock + "\n" + BedroomClock);
    }
}