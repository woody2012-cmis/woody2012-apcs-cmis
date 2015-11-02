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

        String[] allranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] allsuits = {"♥","♦","♣","♠"};
        int value = 0;
        
        int[] ranks = new int[2]; //contains numbers in the allranks
        int[] suits = new int[2]; //contains numbers in the allsuits

         for(int i = 0; i < dealer.length; i++)
        {
            ranks[i] = ((int) (Math.random()*12));
            suits[i] = ((int) (Math.random()*4));
            dealer[i] = "Card of Dealer: " + allranks[ranks[i]] + allsuits[ranks[i]];
            System.out.println(dealer[i]);
        }
        
        for(int i = 0; i < dealer.length; i++)
        {
            if (dealer[i].ranks.equals("J"))
            {
                value = 10;
            }
             if (dealer[i].ranks.equals("Q"))
            {
                value = 10;
            }
             if (dealer[i].ranks.equals("K"))
            {
                value = 10;
            }
             if (dealer[i].ranks.equals("A"))
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

  
        System.out.println("\n");

        for(int i = 0; i < player1.length; i++)
        {
            int ranks = ((int) (Math.random()*12));
            int suits = ((int) (Math.random()*4));
            player1[i] = "Card of Player 1: " + allranks[ranks[i]] + allsuits[ranks[i]];
            System.out.println(player1[i]);
        }

        System.out.println("\n");

        for(int i = 0; i < player2.length; i++)
        {
            int ranks = ((int) (Math.random()*12));
            int suits = ((int) (Math.random()*4));
            player2[i] = "Card of Player 2: " + allranks[ranks[i]] + allsuits[ranks[i]];
            System.out.println(player2[i]);
        }

        System.out.println("\n");

        for(int i = 0; i < player3.length; i++)
        {
            int ranks = ((int) (Math.random()*12));
            int suits = ((int) (Math.random()*4));
            player3[i] = "Card of Player 3: " + allranks[ranks[i]] + allsuits[ranks[i]];
            System.out.println(player3[i]);
        }

        System.out.println("\n");

        for(int i = 0; i < player4.length; i++)
        {
            int ranks = ((int) (Math.random()*12));
            int suits = ((int) (Math.random()*4));
            player4[i] = "Card of Player 4: " + allranks[ranks[i]] + allsuits[ranks[i]];
            System.out.println(player4[i]);
        }

        System.out.println("\n");

        for(int i = 0; i < player5.length; i++)
        {
            int ranks = ((int) (Math.random()*12));
            int suits = ((int) (Math.random()*4));
            player5[i] = "Card of Player 5: " + allranks[ranks[i]] + allsuits[ranks[i]];
            System.out.println(player5[i]);
        }
    }//end method main
}//end CardDriver