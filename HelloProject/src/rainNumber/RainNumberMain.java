package rainNumber;


public class RainNumberMain {
    public static void main(String[] args) {
        //가로세로5-5
        int[][] table = new int[5][5];
        int count = 1;
        int num = 0;
        //00
        //01 10
        //02 11 20
        //04 31 22 13 40
        //14 23 32 41
        //24 33 42
        //34 43
        //44
        while(num<5)
        {
            //처음에 num은 0으로 시작한다.
            //i,j모두 num을 기준으로 움직임

                int i=0;
                int j=num;
                while(j>=0)
                {
                    table[i][j] = count;
                    i++;
                    j--;
                    count++;

                }
                num++;
        }
            num=1;
        while(num<5)
        {
            int k = num;
            int h = 4;
            while(k<=4) {
                table[k][h] = count;
                k++;
                h--;
                count++;
            }
            num++;
        }


        for(int i=0;i<5;i++)
        {
          for(int j=0;j<5;j++)
          {
              System.out.print(table[i][j]+"\t");
          }
          System.out.println();
        }


        //-----------------------------------------------------------------------------------------------------


        System.out.print("--------------------------------------------------");
        System.out.println();

        int[][] arr = new int[5][5];
        int cnt=0;
        for(int j=0;j<9;j++)
        {
            for(int k=0;k<5;k++)
            {
                for(int i=0;i<5;i++)
                {
                    if(i+k==j)
                    {
                        cnt++;
                        arr[k][i]=cnt;
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
