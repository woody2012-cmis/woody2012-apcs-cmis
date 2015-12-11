import javax.swing.JOptionPane;
public class ClockDriver
    {
        public static void main(String[] args)
        {
          
            
            String input = JOptionPane.showInputDialog("Enter hour");
            int hours = Integer.parseInt (input);
            String input1 = JOptionPane.showInputDialog("Enter minutes");
            int mins = Integer.parseInt (input1);
            String input2 = JOptionPane.showInputDialog("Enter seconds");
            int secs = Integer.parseInt (input2);
            
          
            
            Clock Clock = new Clock(hours, mins, secs);
            Clock.totalsecs();
            System.out.println(Clock);
            Clock.setTime((int)(Math.random()*24), (int)(Math.random()*60), (int)(Math.random()*60));
            
            
            System.out.println(Clock);
          
            Clock.convertDaylightSaving(1);
            Clock.totalsecs();
            System.out.println(Clock);
            
            
        }//end method main
    }//end class ClockDriver
