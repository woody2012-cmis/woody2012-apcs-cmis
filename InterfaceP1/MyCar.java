public class MyCar extends Vehicle
{
    private int mpg;
    private double lucky;
    
    public MyCar(int milesPerGallon)
    {
        this.mpg = milesPerGallon;
    }

    public MyCar(int passengers, int milesPerGallon)
    {
        super(passengers);
        this.mpg = milesPerGallon;
    }

    public void connectToBluetooth()
    {
        System.out.println("Connecting to bluetooth for MyCar");
    }

    public String discountable()
    {
        lucky = Math.random();
        if( lucky > 0.5)
        {
            return "Your car is discountable";
        }
        else
        {
            return "Your car is full price";
        }
    }

    public String toString()
    {
        return super.toString() + "\n" +
        "Miles per gallon: " + mpg;
    }
}
