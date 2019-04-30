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
        byte[] byte4 = inet1.getAddress();
    }
}
