package threadTest;

class ThreadClass3 extends Thread
{
    public void run()
    {
        System.out.println(getName()+"   우리는 서로 다른 Thread 클래스");
        System.out.println("All you need is LOVE!!!!");
    }
}

class ThreadClass4 extends Thread
{

    public void run()
    {
        System.out.println(getName()+"   우리는 서로 다른 Thread 클래스");
        System.out.println("What do you about me?");
    }
}


public class ThreadMain3 {
    public static void main(String[] args)
    {
        ThreadClass3 t1 = new ThreadClass3();
        ThreadClass4 t2 = new ThreadClass4();

        t1.start();
        t2.start();
    }
}
