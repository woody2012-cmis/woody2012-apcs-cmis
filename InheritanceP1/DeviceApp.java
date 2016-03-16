public class DeviceApp
{
    public static void main(String[] args)
    {
        MyDevice[] Devices = new MyDevice[7];
        Devices[0] = new MyDevice(32, "Velvet Gold");
        Devices[1] = new MyPhone1(32, "Black", true);
        Devices[2] = new MyPhone2(16, "Yellow", false, "LED");
        Devices[3] = new MyPad(32, "Pink", true, "LED", 10.6);
        Devices[4] = new MyPod(16, "Red", 2000);
        Devices[5] = new MyWatch(16, "Gold", "Digital");
        Devices[6] = new MyTV(32, "Silver", true, "LED", 10.6, 1000);
        for ( MyDevice device : Devices )
        {
            System.out.println(device + "\n");
        }     
    }
}