package runnableTest;

class RunnableClass2 implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("I Love You!!");
    }
}

public class RunnableMain2 {
    public static void main(String[] args)
    {
        RunnableClass2 r1 = new RunnableClass2();
        Thread th1 =new Thread(r1);
        Thread th2 = new Thread(new RunnableClass2());
        // Thread 하나 가지고 두번 불러서 쓰는 경우
        // 그러니 만들어 놓은 Thread는 두개이다
        th1.start();
        th2.start();
    }
}
