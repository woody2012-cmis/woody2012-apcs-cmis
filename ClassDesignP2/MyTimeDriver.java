public class MyTimeDriver
{
    public static void main (String[] args)
    {
        MyTime time1 = new MyTime();
        MyTime timeUser = new MyTime(15, 20, 10); 
        System.out.println(time1 + "\n" + timeUser);
    }
}