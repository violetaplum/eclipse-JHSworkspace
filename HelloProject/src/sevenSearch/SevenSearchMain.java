package sevenSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SevenSearchMain {
    public static void main(String[] args)
    {
        int[] arr = {11,84,45,78,34,9,2};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("찾고싶은 숫자 입력: ");
        int soo = Integer.parseInt(sc.next());
        int f=0;
        int l=arr.length-1;
        int m;
        int sw=0;

        while(f<=l)
        {
            m=(f+l)/2;
            if(soo==arr[m])
            {
                System.out.println(soo+"는 배열"+m+" 번째에 있는!");
                sw =1;
                break;
            }
            else if(soo<arr[m])
            {
                l=m-1;
            }
            else if(soo>arr[m])
            {
                f=m+1;
            }
        }
        if(sw==0)//f,l이 교차되었는지를 물어도 되고 이런 식으로 switch를 추가해도 된다.
        {
            System.out.println("그 값이 없어!!");
        }
    }

}
