public class BlackjackDriver
{
    public static void main(String[] args)
    {
        int value = 0;
        int totaldealervalue = 0;
        int totalplayervalue = 0;
        int[] a = new int[2];
        int[] b = new int[2];

        Blackjack[] dealer = new Blackjack[2];
        Blackjack[] player1 = new Blackjack[2];
        Blackjack[] player2 = new Blackjack[2];
        Blackjack[] player3 = new Blackjack[2];
        Blackjack[] player4 = new Blackjack[2];
        Blackjack[] player5 = new Blackjack[2];

        String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] suits = {"♥","♦","♣","♠"};

        for(int i = 0; i < dealer.length; i++)
        {
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            Blackjack dealerhand = new Blackjack(ranks[a[i]], suits[b[i]]);
            dealer[i] = dealerhand;
            System.out.println(dealer[i]);
        }

        for(int i = 0; i < dealer.length; i++)
        {
            if (ranks[a[i]]==("J"))
            {
                value = 10;
            }
            else if (ranks[a[i]]==("Q"))
            {
                value = 10;
            }
            else if (ranks[a[i]]==("K"))
            {
                value = 10;
            }
            else if (ranks[a[i]]==("A"))
            {
                value = 11;
            }
            else if (ranks[a[i]]==("2"))
            {
                value = 2;
            }
            else if (ranks[a[i]]==("3"))
            {
                value = 3;
            }
            else if (ranks[a[i]]==("4"))
            {
                value = 4;
            }
            else if (ranks[a[i]]==("5"))
            {
                value = 5;
            }
            else if (ranks[a[i]]==("6"))
            {
                value = 6;
            }
            else if (ranks[a[i]]==("7"))
            {
                value = 7;
            }
            else if (ranks[a[i]]==("8"))
            {
                value = 8;
            }
            else if (ranks[a[i]]==("9"))
            {
                value = 9;
            }
            else if (ranks[a[i]]==("10"))
            {
                value = 10;
            }
            totaldealervalue += value;
            System.out.println("Dealer Value: " + value);
        }

        System.out.print("Total Sum of Dealer: " + totaldealervalue + "\n");

        System.out.println("\n");

        for(int i = 0; i < player1.length; i++)
        {
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            Blackjack Player1hand = new Blackjack(ranks[a[i]], suits[b[i]]);
            player1[i] = Player1hand;
            System.out.println(player1[i]);
        }

        for(int i = 0; i < player1.length; i++)
        {
            if (ranks[a[i]]==("J"))
            {
                value = 10;
            }
            if (ranks[a[i]]==("Q"))
            {
                value = 10;
            }
            if (ranks[a[i]]==("K"))
            {
                value = 10;
            }
            if (ranks[a[i]]==("A"))
            {
                value = 11;
            }
            if (ranks[a[i]]==("2"))
            {
                value = 2;
            }
            if (ranks[a[i]]==("3"))
            {
                value = 3;
            }
            if (ranks[a[i]]==("4"))
            {
                value = 4;
            }
            if (ranks[a[i]]==("5"))
            {
                value = 5;
            }
            if (ranks[a[i]]==("6"))
            {
                value = 6;
            }
            if (ranks[a[i]]==("7"))
            {
                value = 7;
            }
            if (ranks[a[i]]==("8"))
            {
                value = 8;
            }
            if (ranks[a[i]]==("9"))
            {
                value = 9;
            }
            if (ranks[a[i]]==("10"))
            {
                value = 10;
            }
            totalplayervalue += value;
            System.out.println("Player 1 Value: " + value);
        }

        System.out.print("Total Sum of Player 1: " + totalplayervalue + "\n");

        System.out.println("\n");

        for(int i = 0; i < player2.length; i++)
        {
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            Blackjack Player2hand = new Blackjack(ranks[a[i]], suits[b[i]]);
            player2[i] = Player2hand;
            System.out.println(player2[i]);
        }

        for(int i = 0; i < player2.length; i++)
        {
            if (ranks[a[i]]==("J"))
            {
                value = 10;
            }
            if (ranks[a[i]]==("Q"))
            {
                value = 10;
            }
            if (ranks[a[i]]==("K"))
            {
                value = 10;
            }
            if (ranks[a[i]]==("A"))
            {
                value = 11;
            }
            if (ranks[a[i]]==("2"))
            {
                value = 2;
            }
            if (ranks[a[i]]==("3"))
            {
                value = 3;
            }
            if (ranks[a[i]]==("4"))
            {
                value = 4;
            }
            if (ranks[a[i]]==("5"))
            {
                value = 5;
            }
            if (ranks[a[i]]==("6"))
            {
                value = 6;
            }
            if (ranks[a[i]]==("7"))
            {
                value = 7;
            }
            if (ranks[a[i]]==("8"))
            {
                value = 8;
            }
            if (ranks[a[i]]==("9"))
            {
                value = 9;
            }
            if (ranks[a[i]]==("10"))
            {
                value = 10;
            }
            totalplayervalue += value;
            System.out.println("Player 2 Value: " + value);
        }

        System.out.print("Total Sum of Player 2: " + totalplayervalue + "\n");

        System.out.println("\n");

        totalplayervalue = 0;

        for(int i = 0; i < player3.length; i++)
        {
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            Blackjack Player3hand = new Blackjack(ranks[a[i]], suits[b[i]]);
            player3[i] = Player3hand;
            System.out.println(player3[i]);
        }

        for(int i = 0; i < player3.length; i++)
        {
            if (ranks[a[i]]==("J"))
            {
                value = 10;
            }
            if (ranks[a[i]]==("Q"))
            {
                value = 10;
            }
            if (ranks[a[i]]==("K"))
            {
                value = 10;
            }
            if (ranks[a[i]]==("A"))
            {
                value = 11;
            }
            if (ranks[a[i]]==("2"))
            {
                value = 2;
            }
            if (ranks[a[i]]==("3"))
            {
                value = 3;
            }
            if (ranks[a[i]]==("4"))
            {
                value = 4;
            }
            if (ranks[a[i]]==("5"))
            {
                value = 5;
            }
            if (ranks[a[i]]==("6"))
            {
                value = 6;
            }
            if (ranks[a[i]]==("7"))
            {
                value = 7;
            }
            if (ranks[a[i]]==("8"))
            {
                value = 8;
            }
            if (ranks[a[i]]==("9"))
            {
                value = 9;
            }
            if (ranks[a[i]]==("10"))
            {
                value = 10;
            }
            totalplayervalue += value;
            System.out.println("Player 3 Value: " + value);
        }

        System.out.print("Total Sum of Player 3: " + totalplayervalue + "\n");

        System.out.println("\n");

        totalplayervalue = 0;

        for(int i = 0; i < player4.length; i++)
        {
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            Blackjack Player4hand = new Blackjack(ranks[a[i]], suits[b[i]]);
            player4[i] = Player4hand;
            System.out.println(player4[i]);
        }

        for(int i = 0; i < player4.length; i++)
        {
            if (ranks[a[i]]==("J"))
            {
                value = 10;
            }
            if (ranks[a[i]]==("Q"))
            {
                value = 10;
            }
            if (ranks[a[i]]==("K"))
            {
                value = 10;
            }
            if (ranks[a[i]]==("A"))
            {
                value = 11;
            }
            if (ranks[a[i]]==("2"))
            {
                value = 2;
            }
            if (ranks[a[i]]==("3"))
            {
                value = 3;
            }
            if (ranks[a[i]]==("4"))
            {
                value = 4;
            }
            if (ranks[a[i]]==("5"))
            {
                value = 5;
            }
            if (ranks[a[i]]==("6"))
            {
                value = 6;
            }
            if (ranks[a[i]]==("7"))
            {
                value = 7;
            }
            if (ranks[a[i]]==("8"))
            {
                value = 8;
            }
            if (ranks[a[i]]==("9"))
            {
                value = 9;
            }
            if (ranks[a[i]]==("10"))
            {
                value = 10;
            }
            totalplayervalue += value;
            System.out.println("Player 4 Value: " + value);
        }

        System.out.print("Total Sum of Player 4: " + totalplayervalue + "\n");

        System.out.println("\n");

        totalplayervalue = 0;

        for(int i = 0; i < player5.length; i++)
        {
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            Blackjack Player5hand = new Blackjack(ranks[a[i]], suits[b[i]]);
            player5[i] = Player5hand;
            System.out.println(player5[i]);
        }

        for(int i = 0; i < player5.length; i++)
        {
            if (ranks[a[i]]==("J"))
            {
                value = 10;
            }
            if (ranks[a[i]]==("Q"))
            {
                value = 10;
            }
            if (ranks[a[i]]==("K"))
            {
                value = 10;
            }
            if (ranks[a[i]]==("A"))
            {
                value = 11;
            }
            if (ranks[a[i]]==("2"))
            {
                value = 2;
            }
            if (ranks[a[i]]==("3"))
            {
                value = 3;
            }
            if (ranks[a[i]]==("4"))
            {
                value = 4;
            }
            if (ranks[a[i]]==("5"))
            {
                value = 5;
            }
            if (ranks[a[i]]==("6"))
            {
                value = 6;
            }
            if (ranks[a[i]]==("7"))
            {
                value = 7;
            }
            if (ranks[a[i]]==("8"))
            {
                value = 8;
            }
            if (ranks[a[i]]==("9"))
            {
                value = 9;
            }
            if (ranks[a[i]]==("10"))
            {
                value = 10;
            }
            totalplayervalue += value;
            System.out.println("Player Value: " + value);
        }

        System.out.print("Total Sum of Player 5: " + totalplayervalue + "\n");

    }//end method main
}//end CardDriver