package queueTest;
import java.util.*;

public class QueueMain
{
    public static void main(String[] args) {

        //Queue.offer(Object); : LinkedList로 Queue를 만들어 뭔가 집어넣기
        //Queue.peek(); : 꺼내서 출력만 하기
        //Queue.poll(); : 꺼내서 출력하고 없애기

        Queue<String> q1 = new LinkedList<>();
        q1.offer("babo");
        q1.offer("ondal");
        q1.offer("Princess");
        System.out.println(q1.size());

        Queue<String> q2 = new LinkedList<>();
        q2.offer("hello");
        q2.offer("nice");
        q2.offer("to");
        q2.offer("meet");
        q2.offer("you");

        Iterator<String> itr2 = q2.iterator();
        while (itr2.hasNext())
        {
            System.out.println(itr2.next());
        }
        while(!q2.isEmpty())
        {
            System.out.print(q2.poll()+" ");
        }



        Iterator<String> itr = q1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        if(!q1.isEmpty())
        {
            q1.poll();
        }
        if(!q1.isEmpty())
        {
            q1.poll();
        }
        q1.offer("hong gill dong");

        /*
        System.out.println(q1.poll());
        System.out.println(q1.poll());
        System.out.println(q1.poll());*/

    }
}
