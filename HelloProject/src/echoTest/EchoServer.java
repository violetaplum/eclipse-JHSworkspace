package echoTest;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws IOException
    {
        ServerSocket ss1 = new ServerSocket(7185);
        Socket s1 = ss1.accept(); //--> 받은 소캣이 접속. 접속 소캣을 넣어준다. 준비가 된 상태
        //Socket s1 = new ServerSocket(port number).accept();



        InputStream is1 = s1.getInputStream();  //s1은 클라이언트 쪽 소캣
        //입력용 접속객체
        //InputStream is1 = new ServerSocket(port numebr).accept().getInputStream();

        OutputStream os1 = s1.getOutputStream();
        //출력용 접속 객체
        int b1;

        while(true)
        {
            b1 = is1.read();    //-> is1 은 입력 스트림 한 바이트씩 읽는다.
            if (b1 == -1) //-> -1은 더이상 처리할 것이 없다는 것.
            {
                break;
            } else
            {
                os1.write(b1);// 받을게 더이상 없으면 쓰라는 것.
            }

        }
    }



}
