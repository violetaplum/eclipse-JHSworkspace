package src.stackTest;
import java.util.*;

public class StackMain {
    public static void main(String[] args)
    {
        Stack<Object> st = new Stack<>();

        st.push("bread1");
        st.push("bread2");
        st.push("bread3");
        st.push("bread4");
        st.push("bread5");
        System.out.println(st.size());
        Iterator<Object> itr = st.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()); //Stack의 성질과 맞지 않게 넣은 순서대로 출력된다..
        }
        while(!st.isEmpty())
        {
            System.out.println(st.pop());   //이경우엔 Stack성질대로 출력된다.
        }
        System.out.println(st.size());
    }
}
