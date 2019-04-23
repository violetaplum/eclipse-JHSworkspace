package socketTest;
import java.net.*;
import java.io.*;
import java.util.*;


class ChatThread extends Thread
{
    private Socket sock;
    private String id;
    private BufferedReader br;
    private HashMap<String,Object> hm;
    private boolean initFlag = false;
    public ChatThread(Socket sock, HashMap<String, Object> hm)
    {
        this.sock = sock;
        this.hm = hm;
        try
        {
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            id = br.readLine();
            broadcast(id+"님이 접속하셨습니다.");
            System.out.println("접속한 사용자의 아이디 : "+id);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private void broadcast(String s) {
    }
}


public class SocketMain5 {
    public static void main(String[] args) throws Exception
    {

    }
}
