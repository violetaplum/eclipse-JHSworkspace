package threadTest;

class ThreadClass2 extends Thread
{
    public void run()
    {
        System.out.println(getName()+" : 나는 스레드 입니다!");
        //getName() : Thread-1,Thread-0..등등이 찍힌다
    }
}

public class ThreadMain2
{
    public static void main(String[] args)
    {
        ThreadClass2 t1 = new ThreadClass2();//Thread-0
        ThreadClass2 t2 = new ThreadClass2();//Thread-1

        t1.start();
        t2.start(); //.start()하지 않으면 올라가지 않는다.
        //t1,t2 둘중 뭐가 먼저 올라갈지 아무도 모른다.
    }
}
