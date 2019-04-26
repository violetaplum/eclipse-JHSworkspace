package socketTest;
import java.net.*;
import java.io.*;

public class SocketMain3 {
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("주소 입력 >> ");
        String url = reader.readLine();
        InetAddress addr = null;
        try
        {
            addr = InetAddress.getByName(url);
        }
        catch(UnknownHostException e)
        {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println(url+"의 IP번호 = "+addr.getHostAddress());
        System.out.println(url+"의 이름 = "+addr.getHostName());
    }
}
