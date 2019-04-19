package threadTest;
import java.util.Random;

public class ThreadMain extends Thread
{
    private static int index = 0;
    private int id = -1;
    public ThreadMain(int id)
    {
        this.id = id;
    }
    public void run()
    {
        System.out.println(id+"번 스레드 동작중!!");
        Random r = new Random(System.currentTimeMillis());
        try
        {
            long s = r.nextInt(3000);
            Thread.sleep(s); //Thread.sleep(Random.nextInt(bound);
            index++;
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(id+"번 스레드 동작 종료..");
    }
    public static void main(String[] args)
    {
        System.out.println("Start main method. ");
        for(int i=0;i<10;i++)
        {
            ThreadMain test = new ThreadMain(i);
            test.start(); //Thread 내의 run()이 실행된다.
        }
    }

}