package threadTest;
import java.util.Random;

class ThreadClass extends Thread
{

    public void run()  //스레드가 생성되면 run()이 수행된다. 이는 Thread를 상속받은 클래스객체.start()를 하면 된다.
    {

        System.out.println("스레드와 오늘부터 1일~~~~");
    }
}

public class ThreadMain extends ThreadClass
{
    public static void main(String[] args)
    {
        ThreadClass test = new ThreadClass();   //delegation (위임하다) : C 언어의 포인터와 같은말
        test.start();   //스레드 가동해라.. 실행명령은 아니다.
        //스레드를 하면 뭐가 먼저 찍힐지 모른다.
        System.out.println("스레드 가자!!");
    }
}