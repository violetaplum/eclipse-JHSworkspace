package threadTest;
class ThreadClass5 extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(getName()+"  내가 쓰고있다 닝겐..!!!");

            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
class ThreadClass6 extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(getName()+"  스미마셍..; ");

            try
            {
                Thread.sleep(1000);  //500 밀리세컨드(0.5초) 쉬어라
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadMain4 {
    public static void main(String[] args)
    {
        ThreadClass5 t1 = new ThreadClass5();
        ThreadClass6 t2 = new ThreadClass6();

        t1.start();
        t2.start();
    }
}
