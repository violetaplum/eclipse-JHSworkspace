package ondalTest;
import java.util.*;

public class OndalTestMain {
    public static void main(String[] args)
    {
        //o,d,l출력하시오

        String ondal = "ondal";
        int n=0;
        char[] ch = ondal.toCharArray();
        char[] c = new char[ch.length];
        for(int i=0;i<ch.length;i=i+2)
        {
            c[n] = ch[i];
            n++;
        }
        String str = new String(c);
        System.out.println(str);



    }
}
