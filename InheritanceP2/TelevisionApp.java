public class TelevisionApp
{
    public static void main(String[] args)
    {
        Television[] TV = new Television[5];
        TV[0] = new TV1("HD Bronze", 59.99);
        TV[1] = new TV2("DLP Silver", 99.99);
        TV[2] = new TV3("LCD Gold", 199.99);
        TV[3] = new TV4("LED Platinum", 399.99);
        TV[4] = new TV5("Plasma Sapphire", 499.99);

        for ( Television television : TV )
        {
            System.out.println(television + "\n");
        }     
    }
}