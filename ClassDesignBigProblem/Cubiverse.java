import javax.swing.JOptionPane;
public class Cubiverse
{
    private int w;
    private int h;
    private int d;
    private int v;
    private double x;
    private double y;
    private double z;
    private String name;

    public Cubiverse()
    {
        this.w = 1;
        this.h = 1;
        this.d = 1;
        this.v = 1;
    }
    
    public Cubiverse(double x, double y, double z, String name)
    {
        this.y = y;
        this.x = x;
        this.z = z;
        this.name = "Name: Default Cubiverse ";
    }//end userinout constructor 
  
    public String toString()
    {
        String output = new String();
        output = this.name + Math.random() + 
        "\n" + "w: " + w + 
        "\n" + "h: " + h +
        "\n" + "d: " + d +
        "\n" + "volume: " + v + 
        "\n" + "x: " + x + 
        "\n" + "y: " + y + 
        "\n" + "z: " + z + 
        "\n" + "distance from left: " + x + 
        "\n" + "distance from bottom: " + y + 
        "\n" + "distance from back: " + z + "\n";
        return output;
    }
}