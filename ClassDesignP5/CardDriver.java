public class CardDriver
{
    public static void main(String[] args)
    {
        String[] myHand = new String[3];
        String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] suits = {"♥","♦","♣","♠"};
        for(int i = 0; i < myHand.length; i++)
        {
            int a = ((int) (Math.random()*12));
            int b = ((int) (Math.random()*4));
            myHand[i] = "Card: " + ranks[a] + suits[b];
            System.out.println(myHand[i]);
        }
    }//end method main
}//end CardDriver