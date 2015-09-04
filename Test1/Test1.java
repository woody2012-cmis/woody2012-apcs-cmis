import javax.swing.JOptionPane;
public class Test1
    {
     public static void main( String[] args )
     { 
           String input = JOptionPane.showInputDialog ( "Give me an integer." );
           int num = Integer.parseInt (input);

           int r = num%2;
           int index = 0;
           int [] randomNumbers = new int [51]; 
           for (int index = 1; index<randomNumbers.length;index++)
           if( r == 1 )
                {
                System.out.println( randomNumbers[index] + ":" + (int)(Math.random() * 51 ));
                }
           else
                {
                System.out.println( randomNumbers[index] + ":" + (int)(Math.random() * 51 ));
                }
                
           
     } //end main
        } //end class
   
        
//public class FundamentalsP7
    //{
    // public static void main( String[] args )
      ///  {
      // int [] randomNumbers = new int[10];
     //  int positive = 0;
     //  int negative = 0;
            
     //  for(int index = 0;index<randomNumbers.length;index++)
    //   {
   // int i = 0;
            
  //  i = (int)(101*Math.random());
 //   if (i % 2 == 0)
  //  {
   //  randomNumbers[index] = ((int)(101*(-1)*Math.random()));
  //   negative++;
 //   }//end if
  //  else
 //   {
  //   randomNumbers[index] = ((int)(101*Math.random()));
  //   positive++;
 //   }//end else
 
 //  }//end for

  // int index = 0;
//while (index < randomNumbers.length)
//{
   // System.out.println(randomNumbers[index] + "\t" );
  //  index++;
//}//end while
 //  System.out.println("There are " + positive + " positive" + " numbers" + ".");
//for (int i = 0; i < randomNumbers.length; i++)
//{
//    if (randomNumbers [i] > 0)
//    {
//     System.out.println(randomNumbers[i]);
//    }
//}

//    }//end main
//}//end class
    
//import javax.swing.JOptionPane;
//public class FundamentalsP9
 //   {
 ///    public static void main( String[] args )
 ///    { 
   //      String username = JOptionPane.showInputDialog ( "Username" );
   //      String password1 = JOptionPane.showInputDialog ( "Password" );
         
   //      int password=Integer.parseInt(password1);
           
   //      if(username.equals("woodysone") && password == 123 )
    //            {
   //             System.out.println( "Log in successful" );
   //             }//end if
   //      else
   //             {
   //             System.out.println( "Login unsuccessful... please try again" );
  //              }//end if
  //   } //end main
     //   } //end class
  //
 
   