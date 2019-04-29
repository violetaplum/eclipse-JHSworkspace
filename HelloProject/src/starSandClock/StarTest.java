package starSandClock;

public class StarTest
{
    public static void main(String[] args)
    {
        for(int i=0,j=0;i<9;i++)
        {
            for(int k=0;k<(9-j);k++)
            {
                System.out.print((k<j)? " ":"*");
            }
            if(i<4)
            {
                j++;
            }
            else
            {
                j--;
            }
            System.out.println();
        }
    }
}