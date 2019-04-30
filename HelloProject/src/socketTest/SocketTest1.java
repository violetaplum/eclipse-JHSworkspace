package socketTest;
import java.net.*;

public class SocketTest1 {
    public static void main(String[] args) throws UnknownHostException
    {
        InetAddress inet1 = InetAddress.getLocalHost();
        System.out.println(inet1.getHostAddress());
        System.out.println(InetAddress.getLocalHost().getHostAddress());
        System.out.println(inet1.getHostName());
        System.out.println(InetAddress.getLocalHost().getHostName());
        System.out.println(InetAddress.getLocalHost().getHostName());

        byte[] byte4 = inet1.getAddress();
        for(int i=0;i<byte4.length;i++)
        {
            System.out.print((int)byte4[i]+""+"\t");
        }
        System.out.println();

        for(int i=0;i<byte4.length;i++)
        {
            System.out.print(byte4[i]+""+"\t");
        }

    }
}
