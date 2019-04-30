package socketTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class SocketTest2 {
    public static void main(String[] args) throws Exception
    {
        String juso = "127.0.0.1";
        System.out.println(InetAddress.getByName(juso).getHostAddress());
        System.out.println(InetAddress.getByName(juso).getHostName());

        byte[] byte5 = InetAddress.getByName(juso).getAddress();
        for(int i=0;i<byte5.length;i++)
        {
            System.out.print((int)byte5[i]+""+"\t");
        }
        System.out.println();

        String juso2 = "www.naver.com";
        System.out.println(InetAddress.getByName(juso2).getHostAddress());
        System.out.println(InetAddress.getByName(juso2).getHostName());

        byte[] byte6 = InetAddress.getByName(juso2).getAddress();

        for(int i=0;i<byte6.length;i++)
        {
            System.out.println((int)byte6[i]+""+"\t");

        }
        System.out.println();

        String juso3 = "www.daum.net";
        System.out.println(InetAddress.getByName(juso3).getHostAddress());
        System.out.println(InetAddress.getByName(juso3).getHostName());
        byte[] byte7 = InetAddress.getByName(juso3).getAddress();
        for(int i=0;i<byte7.length;i++)
        {
            System.out.print(byte7[i]+""+"\t");
        }
        System.out.println();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InetAddress[] inetBae1 = InetAddress.getAllByName("www.naver.com");
        InetAddress[] inetBae2;
        try {
            inetBae2 = InetAddress.getAllByName(reader.readLine());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        for(int i=0;i<inetBae1.length;i++)
        {
            System.out.println(inetBae1[i]);
            System.out.println(inetBae1[i].getHostName());
            System.out.println(inetBae1[i].getHostAddress());


        }
    }
}
