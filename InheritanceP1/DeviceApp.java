public class DeviceApp
{
    public static void main(String[] args)
    {
        MyDevice[] Devices = new MyDevice[7];
        Devices[0] = new MyDevice(32, "Velvet Gold");
        Devices[1] = new MyPhone1(32, "Velvet Gold", true);
        Devices[2] = new MyPhone2(32, "Velvet Gold", true, "LED");
        Devices[3] = new MyPad(32, "Velvet Gold", true, "LED", 10.6);
        Devices[4] = new MyPod(32, "Velvet Gold", 2000);
        Devices[5] = new MyWatch(32, "Velvet Gold", "Digital");
        Devices[6] = new MyTV(32, "Velvet Gold", true, "LED", 10.6, 1000);
        for ( MyDevice device : Devices )
        {
            System.out.println(device + "\n");
        }     
    }
}