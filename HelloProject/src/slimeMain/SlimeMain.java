package slimeMain;

public class SlimeMain {
    public static void main(String[] args)
    {
        //가로세로 5-5
        //양끝점 만날때마다 방향이 바뀜

        //00 01 02 03 04 (열이변화)
        //14 24 34 44 (행이변화)

        //43 42 41 40 (열이변화)
        //30 20 10 (행이변화)

        //11 12 13 (열이변화)
        //23 33 (행이변화)

        //32 31 (열이변화)
        //21 (행이변화)

        //22 (열이변화)



        //P는 반복용 변수
        //k : 배열에 숫자를 배정하는 수행 횟수에 대한 변수
        //S : 행,열의 증감용 변수
        //i,j : 행열용 변수
        //N : 배열에 채울 값(한번 채울때마다 1씩 증가)


        //S가 1이면 증가, -1이면 감소한다.
        //행이나 열이 증가하는 단계에서 감소하는단계, 감소하는 단계에서 증가하는 단계로 변화하는 과정은 모두 5번 일어난다.(변수 k의 초기값)
        // 이것을 토대로
        // 외부 반복구조를 형성한다.

        //동일한 행이나 동일한 열 안에서 배열 원소에 번호를 배정해 주는 작업은 최초 5회에서 4,3,2,1회의 형태로 점차 줄어든다.
        //이를위해 동일한 행이나 열에 대해 내부 반복구조를 사용하여 반복용 변수는 1~k까지 변한다.
        //배열원소 A(i,j) 에 베정되는 번호는 1부터 시작하여 25까지 꾸준히 1씩 증가하게 된다. 변수 N이 이 번호를 보관한다.


        //column : 열
        //row : 행


     /*
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(i+","+j+"\t ");

            }
            System.out.println();
            System.out.println();
        }
*/
        /*int A[][] = new int[5][5];
        int N=0,S=1,i=0,j=-1,k=5;*/

        /*while(true)
        {
            for(int P=0;P<k;P++)
            {
                N++;
                j=j+S;
                A[i][j] = N;
            }
            k--;
            if(k<=0)
            {
                break;
            }
            for(int P=0;P<k;P++)
            {
                N++;
                i=i+S;
                A[i][j]=N;
            }
            S=S*(-1);
        }*/



       /* for(int a=0;a<5;a++)
        {
            for(int b=0;b<5;b++)
            {
                System.out.print(A[a][b]+"\t");
            }
            System.out.println();
        }*/

       int table[][] = new int[5][5];
       int number=0,column=-1,row=0,flag=1,count=5;

       while(true)
       {
           for(int p=0;p<count;p++)
           {
               number++;
               column=column+flag;
               table[row][column] = number;
           }
           count--;
           if(count<=0)
           {
               break;
           }
           for(int p=0;p<count;p++)
           {
               number++;
               row=row+flag;
               table[row][column] = number;
           }
           flag=flag*(-1);
       }

       for(int i=0;i<5;i++)
       {
           for(int j=0;j<5;j++)
           {
               System.out.print(table[i][j]+"\t ");
           }
           System.out.println();
       }




    }
}
