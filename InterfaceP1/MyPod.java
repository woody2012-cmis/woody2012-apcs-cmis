public class MyPod extends MyDevice
{
    public MyPod()
    {
        super();
    }

    public MyPod(int memory, String color)
    {
        super(memory, color);
    }

    public void connectToBluetooth()
    {
        System.out.println("Connecting to bluetooth for MyPod");
    }
    
    public String toString()
    {
        String output = new String("");
        output = super.toString() ;
        return output;
    }
}
