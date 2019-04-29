package src.test_codes;

public class SandCockTest {
    public static void main(String[] args)
    {
        for(int i=0,j=0;i<7;i++)
        {
            for(int k=0;k<(7-j);k++)
            {
                System.out.print((k<j)?" ":"*");
            }
            if(i<4)
            {
                j++;
            }
            else
            {
                j--;
            }
        }
    }
}
