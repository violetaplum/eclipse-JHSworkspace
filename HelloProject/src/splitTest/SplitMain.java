package splitTest;
import java.util.*;

public class SplitMain
{
    public static void main(String[] args)
    {
        String s1 = "baboonda1,Baeyul,river and the ocean, kongjoo,Marry,blue";

        String [] bae = s1.split(","); //String.split("") : String을 ""을 기준으로 잘라서 array로 만들어준다 -> . 이나 \ 은 불가함
        String words = "b";

        for(int i=0;i<bae.length;i++)
        {
            if(bae[i].startsWith(words) || bae[i].startsWith(words.toUpperCase()))
                        //String.endsWith("") : ""로 끝나는경우
            {
                System.out.println(bae[i]);

            }
        }
    }
}
