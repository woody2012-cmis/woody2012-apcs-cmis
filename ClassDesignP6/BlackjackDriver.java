public class BlackjackDriver
{
    public static void main(String[] args)
    {
        int value = 0;
        int totaldealervalue = 0;
        int totalplayervalue = 0;
        int[] a = new int[2];
        int[] b = new int[2];

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
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            dealer[i] = "Card of Dealer: " + ranks[a[i]] + suits[b[i]];
            System.out.println(dealer[i]);
        }

        for(int i = 0; i < dealer.length; i++)
        {
            if (dealer[i]==("J"))
            {
                value = 10;
            }
            else if (dealer[i]==("Q"))
            {
                value = 10;
            }
            else if (dealer[i]==("K"))
            {
                value = 10;
            }
            else if (dealer[i]==("A"))
            {
                value = 11;
            }
            else if (dealer[i]==("2"))
            {
                value = 2;
            }
            else if (dealer[i]==("3"))
            {
                value = 3;
            }
            else if (dealer[i]==("4"))
            {
                value = 4;
            }
            else if (dealer[i]==("5"))
            {
                value = 5;
            }
            else if (dealer[i]==("6"))
            {
                value = 6;
            }
            else if (dealer[i]==("7"))
            {
                value = 7;
            }
            else if (dealer[i]==("8"))
            {
                value = 8;
            }
            else if (dealer[i]==("9"))
            {
                value = 9;
            }
            else if (dealer[i]==("10"))
            {
                value = 10;
            }
            totaldealervalue += value;
            System.out.println("Dealer Value: " + value);
        }
        
        System.out.print("Total sum of dealer: " + totaldealervalue + "\n");

        System.out.println("\n");
        for(int i = 0; i < player1.length; i++)
        {
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            player1[i] = "Card of Player 1: " + ranks[a[i]] + suits[b[i]];
            System.out.println(player1[i]);
        }

        for(int i = 0; i < player1.length; i++)
        {
            if (player1[i]==("J"))
            {
                value = 10;
            }
            if (player1[i]==("Q"))
            {
                value = 10;
            }
            if (player1[i]==("K"))
            {
                value = 10;
            }
            if (player1[i]==("A"))
            {
                value = 11;
            }
            if (player1[i]==("2"))
            {
                value = 2;
            }
            if (player1[i]==("3"))
            {
                value = 3;
            }
            if (player1[i]==("4"))
            {
                value = 4;
            }
            if (player1[i]==("5"))
            {
                value = 5;
            }
            if (player1[i]==("6"))
            {
                value = 6;
            }
            if (player1[i]==("7"))
            {
                value = 7;
            }
            if (player1[i]==("8"))
            {
                value = 8;
            }
            if (player1[i]==("9"))
            {
                value = 9;
            }
            if (player1[i]==("10"))
            {
                value = 10;
            }
            System.out.println(value);
        }
        System.out.println("\n");

        for(int i = 0; i < player2.length; i++)
        {
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            player2[i] = "Card of Player 2: " + ranks[a[i]] + suits[b[i]];
            System.out.println(player2[i]);
        }

        for(int i = 0; i < player1.length; i++)
        {
            if (player2[i]==("J"))
            {
                value = 10;
            }
            if (player2[i]==("Q"))
            {
                value = 10;
            }
            if (player2[i]==("K"))
            {
                value = 10;
            }
            if (player2[i]==("A"))
            {
                value = 11;
            }
            if (player2[i]==("2"))
            {
                value = 2;
            }
            if (player2[i]==("3"))
            {
                value = 3;
            }
            if (player2[i]==("4"))
            {
                value = 4;
            }
            if (player2[i]==("5"))
            {
                value = 5;
            }
            if (player2[i]==("6"))
            {
                value = 6;
            }
            if (player2[i]==("7"))
            {
                value = 7;
            }
            if (player2[i]==("8"))
            {
                value = 8;
            }
            if (player2[i]==("9"))
            {
                value = 9;
            }
            if (player2[i]==("10"))
            {
                value = 10;
            }
            System.out.println(value);
        }

        System.out.println("\n");

        for(int i = 0; i < player3.length; i++)
        {
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            player3[i] = "Card of Player 3: " + ranks[a[i]] + suits[b[i]];
            System.out.println(player3[i]);
        }

        for(int i = 0; i < player1.length; i++)
        {
            if (player3[i]==("J"))
            {
                value = 10;
            }
            if (player3[i]==("Q"))
            {
                value = 10;
            }
            if (player3[i]==("K"))
            {
                value = 10;
            }
            if (player3[i]==("A"))
            {
                value = 11;
            }
            if (player3[i]==("2"))
            {
                value = 2;
            }
            if (player3[i]==("3"))
            {
                value = 3;
            }
            if (player3[i]==("4"))
            {
                value = 4;
            }
            if (player3[i]==("5"))
            {
                value = 5;
            }
            if (player3[i]==("6"))
            {
                value = 6;
            }
            if (player3[i]==("7"))
            {
                value = 7;
            }
            if (player3[i]==("8"))
            {
                value = 8;
            }
            if (player3[i]==("9"))
            {
                value = 9;
            }
            if (player3[i]==("10"))
            {
                value = 10;
            }
            System.out.println(value);
        }

        System.out.println("\n");

        for(int i = 0; i < player4.length; i++)
        {
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            player4[i] = "Card of Player 4: " + ranks[a[i]] + suits[b[i]];
            System.out.println(player4[i]);
        }

        for(int i = 0; i < player1.length; i++)
        {
            if (player4[i]==("J"))
            {
                value = 10;
            }
            if (player4[i]==("Q"))
            {
                value = 10;
            }
            if (player4[i]==("K"))
            {
                value = 10;
            }
            if (player4[i]==("A"))
            {
                value = 11;
            }
            if (player4[i]==("2"))
            {
                value = 2;
            }
            if (player4[i]==("3"))
            {
                value = 3;
            }
            if (player4[i]==("4"))
            {
                value = 4;
            }
            if (player4[i]==("5"))
            {
                value = 5;
            }
            if (player4[i]==("6"))
            {
                value = 6;
            }
            if (player4[i]==("7"))
            {
                value = 7;
            }
            if (player4[i]==("8"))
            {
                value = 8;
            }
            if (player4[i]==("9"))
            {
                value = 9;
            }
            if (player4[i]==("10"))
            {
                value = 10;
            }
            System.out.println(value);
        }

        System.out.println("\n");

        for(int i = 0; i < player5.length; i++)
        {
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            player5[i] = "Card of Player 5: " + ranks[a[i]] + suits[b[i]];
            System.out.println(player5[i]);
        }

        for(int i = 0; i < player1.length; i++)
        {
            if (player5[i]==("J"))
            {
                value = 10;
            }
            if (player5[i]==("Q"))
            {
                value = 10;
            }
            if (player5[i]==("K"))
            {
                value = 10;
            }
            if (player5[i]==("A"))
            {
                value = 11;
            }
            if (player5[i]==("2"))
            {
                value = 2;
            }
            if (player5[i]==("3"))
            {
                value = 3;
            }
            if (player5[i]==("4"))
            {
                value = 4;
            }
            if (player5[i]==("5"))
            {
                value = 5;
            }
            if (player5[i]==("6"))
            {
                value = 6;
            }
            if (player5[i]==("7"))
            {
                value = 7;
            }
            if (player5[i]==("8"))
            {
                value = 8;
            }
            if (player5[i]==("9"))
            {
                value = 9;
            }
            if (player5[i]==("10"))
            {
                value = 10;
            }
            System.out.println(value);
        }
    }//end method main
}//end CardDriver