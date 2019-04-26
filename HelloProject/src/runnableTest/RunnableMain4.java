package runnableTest;

class RunnableClass5 implements Runnable
{
    String moya;

    public RunnableClass5()
    {
        this.moya = "사랑한다.";
    }

    public RunnableClass5(String str)
    {
        this.moya = str;
    }

    @Override
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(i+"번 "+moya);
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }

        }
        System.out.println(moya);
    }

}

public class RunnableMain4 {
    public static void main(String[] args)
    {
        Thread th1 = new Thread(new RunnableClass5());
        Thread th2 = new Thread(new RunnableClass5("썸이다~~"));
        th1.start();
        th2.start();
        //각각 넣어주는 run class가 같기 때문에 Thread는 다르지만 인자가 안들어가면 '사랑한다'가 들어가고 들어가면'썸이다~'
        //생성자로 구분되기 때문에
    }
}
