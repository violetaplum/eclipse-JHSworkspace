package rainNumber;

public class RainTest {
    public static void main(String[] args)
    {
        int[][] table = new int[5][5];
        int count=0;

       for(int sum=0;sum<9;sum++) //행과 열의 숫자합이 최대 8이므로 9전까지
       {
           for(int j=0;j<5;j++) //행
           {
               for(int k=0;k<5;k++) //열
               {
                   if(j+k==sum) //행과 열의 숫자가 하나씩 늘어나는데 둘의 합이
                   {
                       count++;
                       table[j][k]=count;
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





       int[][] arr = new int[5][5];
       int value=0;

       for(int sum2=0;sum2<9;sum2++)
       {
           for(int i=0;i<5;i++)
           {
               for(int j=0;j<5;j++)
               {
                   if(i+j==sum2)
                   {
                       value++;
                       arr[i][j]=value;
                   }
               }
           }
       }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }











    }
}
