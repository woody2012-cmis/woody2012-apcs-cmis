import javax.swing.JOptionPane;
public class Cubiverse
{
    private int w;
    private int h;
    private int d;
    private int volume;
    private double x;
    private double y;
    private double z;
    private double dfl;
    private double dfbt;
    private double dfbk;
    private String name;

    public Cubiverse()
    {
        w = 1;
        h = 1;
        d = 1;
        volume = w * h* d;
        x = 0.5;
        y = 0.5;
        z = 0.5;
        dfl = w * x;
        dfbt = h * y;
        dfbk = d * z;
        name = "Default Cubiverse-" + Math.random ();
    }

    public Cubiverse(int w, int h, int d, String name)
    {
        this.w = w;
        this.h = h;
        this.d = d;
        volume = w * h* d;
        x = 0.5;
        y = 0.5;
        z = 0.5;
        dfl = w * x;
        dfbt = h * y;
        dfbk = d * z;
        this.name = name;
    }

    public Cubiverse(double x, double y, double z, String name)
    {
        w = 1;
        h = 1;
        d = 1;
        volume = w * h* d;
        this.x = x;
        this.y = y;
        this.z = z;
        dfl = w * x;
        dfbt = h * y;
        dfbk = d * z;
        this.name = name;
    }

    public String toString()
    {
        String result = String.format ("Name: %s \n" + 
                "w: %d \n" +
                "h: %d \n" +
                "d: %d \n" +
                "volume: %d \n" +
                "x: %.2f \n" +
                "y: %.2f \n" +
                "z: %.2f \n" +
                "distance from left: %.2f \n" +
                "distance from bottom: %.2f \n" +
                "distance from back: %.2f \n", name, w, h, d, volume, x, y, z, dfl, dfbt, dfbk);
        return result;
    }
}