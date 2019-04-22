package threeThreadtest;

class ThreeThreadClass extends Thread
{
    String fruit;
    public ThreeThreadClass(){}
    public ThreeThreadClass(String str)
    {
        this.fruit = str;
    }
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(fruit+"\t"+i+"개 주세요");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }

        }
    }
}

public class ThreeThreadMain {
    public static void main(String[] args)
    {
        ThreeThreadClass ttc1 = new ThreeThreadClass("사과");
        ThreeThreadClass ttc2 = new ThreeThreadClass("배");
        ThreeThreadClass ttc3 = new ThreeThreadClass("감");

        //ThreadPriority() : 우선순위를 간단하게 Thread.MIN_PRIORITY, Thread.NORM_PRIORITY,Thread.MAX_PRIORITY 정해줄 수도 있고 숫자로 정해줄수도 있다.
        //하지만 우선순위를 정해주더라도 약간만 영향을 끼칠 뿐임

        ttc1.setPriority(1);    //Thread.setPriority() : 우선순위 정하는 메소드 1~10까지 줄 수 있음
        ttc2.setPriority(ttc2.NORM_PRIORITY);   //원래는 너한번, 나한번 으로 수행되는 것인데
        ttc3.setPriority(ttc3.MAX_PRIORITY);    //1번부터 10번까지의 우선순위를 정해줄 수 있다.

        System.out.println(ttc1.getPriority()+"\t"+ttc2.getPriority()+"\t"+ttc3.getPriority());
        ttc1.start();
        ttc2.start();
        ttc3.start();
    }
}
