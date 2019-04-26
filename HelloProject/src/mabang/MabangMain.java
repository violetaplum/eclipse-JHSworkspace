package mabang;
import java.util.*;



public class MabangMain {
    static int arr[][] = new int[5][5];

    public void ma(int number)
    {
        int hng,h;//행
        int yul,y;//열
        int count;//채울숫자

        //0행 가운데 1을 둠
        hng=0;
        yul=(number-1)/2;
        arr[0][yul]=1;

        for(count=2;count<=number*number;count++)
        {//현재 행이 제일 윗행이면 제일 아래행으로
            if(hng==0)
            {
                h=number-1;
            }
            else
            {
                h=hng-1;
            }
            //현재 열이 가장 왼쪽열이면 제일 오른쪽 열로
            //아니면 하나 왼쪽 열로 이동
            if(yul==0)
            {
                y=number-1;
            }
            else
            {
                y=yul-1;
            }
            //이동 후의 위치가 빈칸이면
            if(arr[h][y]==0)
            {
                hng=h;
                yul=y;
            }
            else //빈칸 아니면 하나 아래행으로
            {
                hng++;
            }
            arr[hng][yul]=count;
        }
    }

    public static void main(String[] args)
    {

       int value=5,sum=0;
       int i=0,j=0;
       MabangMain m = new MabangMain();
       m.ma(value);
       for(i=0;i<value;i++)
       {
           for(j=0;j<value;j++)
           {
               if(arr[i][j]<10) System.out.print(" ");
               else System.out.print(" ");
           }

       }
        for(i=0;i<5;i++)// 좌표확인용
        {
            for(j=0;j<5;j++)
            {
                System.out.print(i+"/"+j+"\t");

            }
            System.out.println();
        }




    }
}
