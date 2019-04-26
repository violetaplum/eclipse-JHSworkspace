package socketTest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class SocketMain4 {
    public static void main(String[] args) throws Exception
    {
        String name = "온달";
        byte[] byteName = name.getBytes();
        String name2 = new String(byteName);
        System.out.println(name2);
        String url;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        url = reader.readLine();
        System.out.println(InetAddress.getByName(url));
        Socket s1 = new Socket("127.0.0.1",7856);     // Socket(host,port);
        ServerSocket ss1 = new ServerSocket(7988);          //나중에 포트번호가 같아야 한다.
        //포트번호는 한번 가동 시 다시 가동 시키거나 바꿔줘야한다.
        //사용할때마다 또 쓰면 안된다..
        //다시한번 가동할때 새 포트번호를 다시 써줘야함
        Socket s2 = ss1.accept();   //해줘야 받아들임
        //클라이언트 쪽에서 connect하면 바로 접속됨
    }
}
