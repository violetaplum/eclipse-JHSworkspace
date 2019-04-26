package tcpServerImage;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.*;
import java.util.*;
import java.io.*;
//Server에서 Client로 사진을 보낸다


public class TcpServerIMG {
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss1 = new ServerSocket(57799);
        System.out.println("서버 준비되어 있음,....");
        while(true)
        {
            System.out.println("기다리는중...");
            Socket s1 = ss1.accept();
            System.out.println(s1.getInetAddress());

            File file1 = new File("E:/spring.jpg");
            BufferedImage buffimage1 = ImageIO.read(file1);
            ImageIO.write(buffimage1,"jpg",s1.getOutputStream());
            s1.close();
            System.out.println();
        }
    }
}
