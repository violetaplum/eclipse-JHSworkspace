package mabang;
import java.util.*;

public class MabangTeacher {
    public static void main(String[] args)
    {
        //int num=1;
        //int n=3; 3차수 배열
        int num=0;
        int n;
        System.out.print("n*n 마방진의 n을 입력하시오(홀수만) >>");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[][] arr = new int[n][n]; //3 x 3 배열
        int h=0,y=n/2; //처음 '1'은 0행 가운데 열에 들어간다
        arr[h][y] = 1; //'1'이 최초로 들어가는 부분
        for(num=2;num<=n*n;num++)
        {//n행n열이므로 숫자는 n의 제곱의 숫자까지 들어가게 된다.
            if(num%n==1) //규칙이 다른 이것부터 물어봐야한다
            {//2행 0열에 '4'가 들어가는데 이를 3으로 나눴을때 1이 나왔을 경우 행이 증가한다.
                h++;
            }
            else if(h==0)//각각의 if, else if에는 각 좌표를 정해주는 작업이 들어가고 정해지면 하단의 arr[h][y] = num;으로 값을 할당해준다.
            {
                h=n-1;
                y++;
            }
            else if(y==(n-1))
            {
                h--;
                y=0;
            }
            else
            {
                h--;
                y++;
            }
            arr[h][y] = num;
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
