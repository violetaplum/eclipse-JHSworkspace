package chattingTest;

class ThreadSyncClass
{
    synchronized void kaja1(String insa) throws InterruptedException
    {
        char[] insaCH = insa.toCharArray();
        for(int i=0;i<insaCH.length;i++)
        {
            System.out.print(insaCH[i]);
            Thread.sleep(100);  //대기상태
        }
        /*for(int i=0;i<10;i++) {
            System.out.println(insa);
        }*/

    }
    synchronized void kaja2(String insa) throws InterruptedException        //synchronized 선언이 중요!!
            //synchronized --> 끝나기 전까진 아무도 접근 할 수 없는 것..

    {
        char[] insaCH = insa.toCharArray();
        for(int i=0;i<insaCH.length;i++)
        {
            System.out.print(insaCH[i]);
            Thread.sleep(100);  //대기상태
        }
        /*for(int i=0;i<10;i++) {
            System.out.println(insa);
        }*/
    }
}
public class ThreadSyncMainClass extends Thread
{
    String irum;
    static ThreadSyncClass tsc1;
    // static 프로그램 실행즉시 생성된다.
    // 그리고 프로그램 끝날때까지 사용 가능

    public ThreadSyncMainClass(String string)
    {
        this.irum = string;
    }
    public static void main(String[] args)
    {
        tsc1 = new ThreadSyncClass();
        ThreadSyncMainClass src1 = new ThreadSyncMainClass("유은");   //재귀 객체선언
        ThreadSyncMainClass src2 = new ThreadSyncMainClass("태희");

        src1.start();
        src2.start();

    }
    @Override
    public void run()   //공유되는 메소드는 run()메소드임
    {
        if(irum.equals("유은"))
        {
            try
            {
                tsc1.kaja1("방가방가");
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }



        }
        if(irum.equals("태희"))
        {
            try{
                tsc1.kaja2("안녕이라는");
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }
}
