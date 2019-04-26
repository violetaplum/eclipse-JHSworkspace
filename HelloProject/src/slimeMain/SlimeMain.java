package slimeMain;

public class SlimeMain {
    public static void main(String[] args)
    {
        int[][] arr = new int[5][5];
        int i=0;
        int j=0;
        int count = 1;
        //가로세로 5-5
        //양끝점 만날때마다 방향이 바뀜

        //00 01 02 03 04
        //14 24 34 44
        //43 42 41 40
        //03 02 01
        //11 12 13
        //23 33
        //

        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                arr[i][j]=count;
                count++;
            }
        }
    }
}
