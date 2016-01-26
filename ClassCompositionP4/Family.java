import java.util.ArrayList;
public class Family
{
   public static void main ( String[] args )
   {
       ArrayList<String> myFamily = new ArrayList<String>();
       myFamily.add("Chan");
       myFamily.add("Vanda");
       myFamily.add("Taveedej");
       myFamily.add("Jeerapa");
       for (int i = 0; i < myFamily.size(); i++ )
       {
           System.out.println(myFamily.get(i));
       }
   }
}

