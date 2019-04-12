package subString3;
import java.util.*;


public class TestMain {
    public static void main(String[] args)
    {
        String ondal = args[0];

        char[] chOndal = ondal.toCharArray();
        char temp;
        //ondal --> olnad
        String fin ="";
        String str2;

        if(chOndal.length%2!=0)
        {
            str2 = ondal.substring(1,ondal.length()+1);
            char[] cc = str2.toCharArray();
            for(int i=0;i<ondal.length()/2;i++)
            {
                temp=cc[i];
                cc[i] = cc[ondal.length()-i-2];
                cc[ondal.length()-i-2] = temp;
            }
            fin = new String(cc);
        }
        else if(chOndal.length%2==0)
        {
            char[] cc = ondal.toCharArray();
            for(int i=0;i<ondal.length()/2;i++)
            {
                temp=cc[i];
                cc[i] = cc[ondal.length()-i-1];
                cc[ondal.length()-i-1] = temp;
            }
            fin = new String(cc);
        }
        System.out.println(fin);



       /* char[] c2 = new char[chOndal.length];
        int n=0;
        int m=(int)Math.floor(chOndal.length/2);
        int k = chOndal.length-1;
        for(int i=0;i<m;i++)
        {
            c2[n] = chOndal[i];
            c2[n+1] = chOndal[k];
            k--;
            n=n+2;

        }
        if(chOndal.length/2!=0)
        {
            c2[c2.length-1]=chOndal[m];
            String s2 = new String(c2);
            System.out.println(s2);
        }*/

        //짝수일때는 짝이 맞게 맨앞,맨뒤 바꾸고 그다음 맨앞,맨뒤 바꾼다.
        //홀수일때는 맨앞은 놔두고 그 뒤를 맨앞으로 취급 한 뒤 반복.



    }
}

