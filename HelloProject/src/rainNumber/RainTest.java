package rainNumber;

public class RainTest
{
    public static void main(String[] args)
    {
        int[][] table = new int[5][5];
        int count=0;
        for(int num=0;num<9;num++)
        {
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++)
                {
                    if(i+j==num)
                    {
                        count++;
                        table[i][j]=count;
                    }
                }
            }
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(table[i][j]+"\t");
            }
            System.out.println();
        }
    }
}