import javax.swing.JOptionPane;
public class ClockDriver
    {
        public static void main(String[] args)
        {
            Clock Clock = new Clock();
            Clock.totalsecs();
            System.out.println(Clock);
            
            Clock.setTime(1,1,1);
            Clock.totalsecs();
            System.out.println(Clock);
            
            Clock.convertDaylightSaving(1);
            Clock.totalsecs();
            System.out.println(Clock);
            
            
        }//end method main
    }//end class ClockDriver
