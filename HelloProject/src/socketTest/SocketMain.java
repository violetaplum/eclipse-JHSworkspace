package socketTest;
import java.net.*;
public class SocketMain {
    public static void main(String[] args) throws UnknownHostException {
        //InetAddress 클래스는 IP주소표현을 위해 사용
        InetAddress inet1= InetAddress.getLocalHost(); //--> static method

        //클래스명.static 메소드()
        //InetAddress : 현재 ip주소를 알려준다.
        System.out.println(inet1.getHostAddress()); //String    --> IPv4 의 주소가 나온다.
        //InetAddress.getLocalHost().getHostAddress();
        System.out.println(InetAddress.getLocalHost().getHostAddress());


        //dotted decimal address
        System.out.println(inet1.getHostName()); //String      --> 내 컴퓨터 이름이 찍힌다.
        //InetAddress.getLocalHost().getHostName();
        System.out.println(InetAddress.getLocalHost().getHostName());

        //domain name

        //118.36.3.103 --> 네트워크, 호스트
        //1 -PC


        byte[] byte4 = inet1.getAddress();  //1111001101010111000001110
        //InetAddress.getLocalHost().getAddress() : InetAddress객체의 실제 IP주소를 바이트 배열로 리턴
        //InetAddress.getLocalHost().getHostAddress() : IP주소를 문자열로 반환
        //InetAddress.getLocalHost().getHostName() : 호스트 이름을 문자열로 반환
        //InetAddress.getLocaHost().toString() : IP주소를 스트링 문자열로 오버라이딩한 메소드. 스트링 문자열의 형식은 '호스트이름/IP주소'. 따라서 InetAddress객체를
        //                                         화면에 출력하면 'java.sun.com /209.249.116.141'이 출력됨
        for(int i=0;i<byte4.length;i++)
        {
            System.out.print((int)byte4[i]+""+"\t");
        }
        //-36 36 3 103 --> 앞에 -가 붙은 이유는 2진수를 정수로 변환할때 맨 앞의 숫자가 '1'이었기 때문에 음수로 취급한 것임      255.0-255.0-255.0-255
        System.out.println();

        for(int i=0;i<byte4.length;i++)
        {
            System.out.print(byte4[i]+""+"\t");
        }
        // -64	-88	56	1  --> 192.168.56.1
        // --> 0~255 까지 256
        //256-64 = 192
        //256-88 = 168
        //56
        //1

    }
}
