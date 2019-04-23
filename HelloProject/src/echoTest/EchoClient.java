package echoTest;
import java.io.*;
import java.net.*;
import java.util.*;

public class EchoClient {
    public static void main(String[] args) throws UnknownHostException, IOException
    {
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("127.0.0.1",7113); //Server의 포트번호와 동일하다.
        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        //Buffered~ : 은 문자열 단위 이므로 도우미이다.
        //Server에서는 한바이트 한바이트 처리했지만 여기선 한자한자 읽을 수 있다.

        while(true)
        {
            System.out.print("글자 쳐봐 >> ");
            String bada1forSever = sc.nextLine();
            if(bada1forSever.length()==0)
            {
                break;
            }
            bw1.write(bada1forSever,0,bada1forSever.length());
            //server로 보냄 키보드 받은 것을 0번째부터 모든 길이만큼 전부다 전송
            bw1.newLine();// 줄바꿈도 보냄
            bw1.flush();// 무조건 전송한 후 buffer 비움
            String bada2fromServer = br1.readLine(); //server로부터 받음
            System.out.println("서버로부터 다시 왔다는~~~"+ bada2fromServer);
        }
        s.close();

    }
}
