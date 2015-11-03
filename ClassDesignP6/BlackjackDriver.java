public class BlackjackDriver
{
    public static void main(String[] args)
    {
        String[] dealer = new String[2];
        String[] player1 = new String[2];
        String[] player2 = new String[2];
        String[] player3 = new String[2];
        String[] player4 = new String[2];
        String[] player5 = new String[2];

        String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] suits = {"♥","♦","♣","♠"};
        

        for(int i = 0; i < dealer.length; i++)
        {
            if (dealer[i]==("J"))
            {
                value = 10;
            }
            if (dealer[i]==("Q"))
            {
                value = 10;
            }
            if (dealer[i]==("K"))
            {
                value = 10;
            }
            if (dealer[i]==("A"))
            {
                value = 11;
            }
            else 
            {
                int value = Integer.parseInt(ranks);
                value = ranks;
            }
            System.out.println(value);
        }

        for(int i = 0; i < dealer.length; i++)
        {
            int a = ((int) (Math.random()*13));
            int b = ((int) (Math.random()*4));
            dealer[i] = "Card of Dealer: " + ranks[a] + suits[b];
            System.out.println(dealer[i]);
        }

        System.out.println("\n");
        
        for(int i = 0; i < player1.length; i++)
        {
            int a = ((int) (Math.random()*13));
            int b = ((int) (Math.random()*4));
            player1[i] = "Card of Player 1: " + ranks[a] + suits[b];
            System.out.println(player1[i]);
        }

        System.out.println("\n");

        for(int i = 0; i < player2.length; i++)
        {
            int a = ((int) (Math.random()*13));
            int b = ((int) (Math.random()*4));
            player2[i] = "Card of Player 2: " + ranks[a] + suits[b];
            System.out.println(player2[i]);
        }

        System.out.println("\n");

        for(int i = 0; i < player3.length; i++)
        {
            int a = ((int) (Math.random()*13));
            int b = ((int) (Math.random()*4));
            player3[i] = "Card of Player 3: " + ranks[a] + suits[b];
            System.out.println(player3[i]);
        }

        System.out.println("\n");

        for(int i = 0; i < player4.length; i++)
        {
            int a = ((int) (Math.random()*13));
            int b = ((int) (Math.random()*4));
            player4[i] = "Card of Player 4: " + ranks[a] + suits[b];
            System.out.println(player4[i]);
        }

        System.out.println("\n");

        for(int i = 0; i < player5.length; i++)
        {
            int a = ((int) (Math.random()*13));
            int b = ((int) (Math.random()*4));
            player5[i] = "Card of Player 5: " + ranks[a] + suits[b];
            System.out.println(player5[i]);
        }
    }//end method main
}//end CardDriver