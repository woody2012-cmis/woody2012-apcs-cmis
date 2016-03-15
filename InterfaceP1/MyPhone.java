public class MyPhone extends MyDevice
{
    private String carrier;
    
    public MyPhone()
    {
        super();
        this.carrier = new String("dtac");
    }

    public MyPhone(int memory, String color, String carrier)
    {
        super(memory, color);
        this.carrier = carrier;
    }

    public void connectToBluetooth()
    {
        System.out.println("Connecting to bluetooth for MyPhone");
    }
  
    public String toString()
    {
        String output = new String("");
        output = super.toString() +
        "\nCarrier: " + carrier;
        return output;
    }
}
