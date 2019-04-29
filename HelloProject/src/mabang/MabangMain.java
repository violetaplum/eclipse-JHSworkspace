package mabang;
import java.util.*;

public class MabangMain
{
    public static void main(String[] args)
    {
        // S(5,5) : 5행 5열로 된 마방진을 보관하는 2차원배열
        // R : 현재 처리할 배열 원소의 행
        // C : 현재 처리할 배열 원소의 열
        // NR : 다음에 처리할 배열 원소의 행
        // NC : 다음에 처리할 배열 원소의 열
        // N : 마방진의 각 원소에 할당될 1부터 25까지의 숫자를 보관
        int S[][] = new int[3][3];
        int R=0,C=1;
        for(int N=1;N<=9;N++)
        {
            S[R][C] = N;
            int NR = R-1;
            int NC = C+1;
            if(NR == -1)
            {
                NR = 2;
            }
            if(NC == 3)
            {
                NC = 0;
            }
            if(S[NR][NC]==0)
            {
                R = NR;
                C = NC;
            }
            else
            {
                R++;
            }
        }
        for(int NR = 0;NR<=2;NR++)
        {
            for(int NC=0;NC<=2;NC++)
            {
                System.out.print(S[NR][NC]+"\t");
            }
            System.out.println();
        }
    }
}
