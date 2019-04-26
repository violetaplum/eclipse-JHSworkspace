package starSandClock;

public class StarSandClockMain {
    //7-5-3-1-3-5-7 : 총 7층 4층까지 감소/5층부터증가
    //총 9층 4층까지 감소
    public static void main(String[] args)
    {
        for(int i=0,j=0;i<7;i++)
        {
                for (int k = 0; k < (7 - j); k++)
                {

                    System.out.print((k < j) ? " " : "*");
                }
                if (i < 3)
                {
                    j=j+1;
                } else {
                    j=j-1;
                }
                System.out.println();

        }

        //남의코드
        /*for(int i=0;i<4;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<7-2*i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+3;j++)
            {
                System.out.print("*");
            }
        }*/

    }
}
