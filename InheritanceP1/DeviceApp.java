public class DeviceApp
{
    public static void main(String[] args)
    {
        MyDevice[] Devices = new MyDevice[7];
        Devices[0] = new MyDevice(32, "Velvet Gold");
        Devices[1] = new MyPhone1(32, "Velvet Gold", true);
        Devices[2] = new MyPhone2(32, "Velvet Gold", true, "LED");
        //         Devices[3] = new MyPad("Woody Omaree", "March", 300000, "High");
        //         Devices[4] = new MyPod("Woody Omaree", "March", 300000, "High");
        //         Devices[5] = new MyWatch("Woody Omaree", "March", 300000, "High");
        //         Devices[6] = new MyTV("Woody Omaree", "March", 300000, "High");
        for ( MyDevice device : Devices )
        {
            System.out.println(device + "\n");
        }     
    }
}