package threadTest2;
class ThreadClass1 extends Thread
{
    private String name;
    public ThreadClass1(String name)
    {
        this.name = name;
    }
    public void run()   //Thread 는 run() 이 꼭 있어야함
            //얘만 10번 돌리게 되지 않는다.
            //어떤 Thread가 먼저 돌지 랜덤임
            //하지만 10번 수행완료 전까진 종료되지 않음
    {
        //Thread.currentThread().setName("경석 : ");
        for(int i=0;i<10;i++)
        {
            System.out.println(name+" : (미래보라고껴안는수아에게)환자구나!!!");
            //getName() + " : (미래보라고껴안는수아에게)환자구나!!!");
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
class ThreadClass2 extends Thread
{
    String name;
    public ThreadClass2(String name)
    {
        this.name = name;
    }
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(name+" : (경석이를일부러껴안으며)이래도 아무런 느낌없어!!!!");
            //getName() + " : (미래보라고껴안는수아에게)환자구나!!!");
            try
            {
                Thread.sleep(1000);//상단은 5초간격 하단은 10초간격일뿐 별 의미는 없다.
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}


public class ThreadMain {
    public static void main(String[] args)
    {
        ThreadClass1 tc1 = new ThreadClass1("경석");
        ThreadClass2 tc2 = new ThreadClass2("수아");
        tc1.start();//ThreadClass의 run() 호출
        tc2.start();
        System.out.println("* 회사 향수체험후 뒷풀이 마친후.. 비오는날");
    }
}
