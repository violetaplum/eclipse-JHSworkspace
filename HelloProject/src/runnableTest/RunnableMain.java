package runnableTest;

class RunnableClass1 implements Runnable //Runnable 인터페이스 구현 (run()이 구현돼야 함)
{
    //쓰레드가 아니기 때문에 Runnable 클래스 하나 만든 후 스레드객체 에 넣고 가동시켜야 한다.
    //이때 main에서는 스레드를 상속받을 필요 없음
    @Override
    public void run()
    {
        System.out.println("Runnable plus 1!!");
    }
    //Thread.sleep(); 만 아니면 try catch문 없어도 된다..

}

public class RunnableMain
{
    public static void main(String[] args)
    {
        RunnableClass1 rc1 = new RunnableClass1();    //먼저 Runnable을 선언 후 Thread클래스에 인자로 전달
        Thread th1 =  new Thread(rc1);  //  new Thread(new RunnableClass())
        th1.start();    //Thread.start()
    }
}