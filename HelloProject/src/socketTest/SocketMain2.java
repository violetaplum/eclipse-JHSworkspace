package socketTest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class SocketMain2 {
    public static void main(String[] args) throws UnknownHostException
    {
        String juso="127.0.0.1";   // --> 256의 반이 넘어버리면 -가 나오고 안넘으면 -가 붙어서 나온다.

        System.out.println(InetAddress.getByName(juso).getHostAddress());
        System.out.println(InetAddress.getByName(juso).getHostName());

        byte[] byte5 = InetAddress.getByName(juso).getAddress();
        for(int i=0;i<byte5.length;i++)
        {
            System.out.print((int)byte5[i]+""+"\t");
        }
        System.out.println();

        //----------------------------------------------------------------------------

        String juso2 = "www.naver.com";
        System.out.println(InetAddress.getByName(juso2).getHostAddress());
        System.out.println(InetAddress.getByName(juso2).getHostName());

        byte[] byte6 = InetAddress.getByName(juso2).getAddress();
        for(int i=0;i<byte6.length;i++)
        {
            System.out.print((int)byte6[i]+""+"\t");
        }
        System.out.println();

        String juso3 = "www.daum.net";
        System.out.println(InetAddress.getByName(juso3).getHostAddress());
        System.out.println(InetAddress.getByName(juso3).getHostName());
        //InetAddress.getByName() : host로 지정된 컴퓨터를 나타내는 InetAddress객체 반환


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
            System.out.println(inetBae1[i]);    // ip이름/ip주소 로 구성 되어 있다
            System.out.println(inetBae1[i].getHostName());  //여기서는 상위의 이름만 출력된다.
            System.out.println(inetBae1[i].getHostAddress());   //상위의 주소가 출력된다.

        }
    }
}
