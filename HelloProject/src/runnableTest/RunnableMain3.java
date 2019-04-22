package runnableTest;

class RunnableClass3 implements Runnable
{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++) {
            System.out.println("Ich Liebe Dich"); //독일어로 I love you..!
            try {
                Thread.sleep(100);

            }
            catch(InterruptedException e)
            {
                e.getStackTrace();
            }
        }
    }
}
class RunnableClass4 implements Runnable
{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++) {
            System.out.println("널 사랑해.."); //독일어로 I love you..!
            try {
                Thread.sleep(100);  // Thread.sleep(time); : try,catch문이 필요해진다..
            }
            catch(InterruptedException e)
            {
                e.getStackTrace();
            }
        }
    }
}

public class RunnableMain3 {
    public static void main(String[] args)
    {
        Thread tr1 = new Thread(new RunnableClass3());
        Thread tr2 = new Thread(new RunnableClass4());
        tr1.start();
        tr2.start();
    }
}
