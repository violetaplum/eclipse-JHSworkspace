package tcpServerImage;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.*;
import java.io.*;
import java.util.*;
//

public class TcpClientIMG {//extends JFrame
    public static void main(String[] args) throws Exception
    {
        Socket s1 = new Socket("127.0.0.1",7799);
        BufferedImage buffimage1 = ImageIO.read(s1.getInputStream());
        //소켓의 I/O stream으로 부터 받아

        File file7 = new File("/home/violeta/Pictures/spring.jpg");//이 파일에 png로 저장

        ImageIO.write(buffimage1,"jpg",file7);//상위의 확장자와 동일하게 맞춰야 한다
        //기존 확장자가 jpg이더라도 png로 변경되서 저장된다.
        System.out.println("Saved as JPG");
        //imgicon1 = new ImageIcon(buffimage1);
        //jLabel1.setIcon(imgicon1);

        s1.close();
        System.out.println("Success!!!~~");
    }
}
