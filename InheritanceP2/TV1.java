public class TV1 extends Television
{
    private String model;
    private double price;
    
    public TV1(String model, double price)
    {
        super(model, price);
        this.model = model;
        this.price = price;
    }

    public String toString()
    {
        return super.toString() ;
    }
}
