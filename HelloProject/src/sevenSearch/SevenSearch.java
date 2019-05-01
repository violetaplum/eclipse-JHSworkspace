package sevenSearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SevenSearch {
    public static void main(String[] args)
    {
        int[] arr = {10,43,1355,74,1,6,345,6543,343,654};
        int temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert one of the Array Elements >> ");
        int find = sc.nextInt();
        System.out.println("When it's not sorted..");
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+"\t");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==find)
            {
                i++;
                System.out.println("The index is : "+i);
                break;
            }
        }
       /* for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {			//i를 또 빼준다면 4x4에서 역삼각형모양의 표가 생긴다. 반복할 과정이 줄어든다.
                if (arr[j]<arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }   bubble sort..!
        */

        Arrays.sort(arr);
        int mid=arr.length/2;
        int s=0;
        int l=arr.length;
        System.out.println();
        System.out.println("When it's sorted..");
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+"\t");
        }

        System.out.println();
            while(true)
            {
                mid=(l-s)/2;

                if(l<s)
                {
                    System.out.println("No Element..");
                    break;
                }
                if (arr[mid] == find)
                {
                    mid++;
                    System.out.println("In the BinarySearch..");
                    System.out.println("The Index is : "+mid);
                    break;
                } else if (arr[mid] > find) {
                    l=mid-1;
                    continue;
                }
                else if(arr[mid]<find)
                {
                    s=mid+1;
                    continue;
                }
                else
                {
                    mid++;
                    System.out.println("In the BinarySearch..");
                    System.out.println("The Index is : "+mid);
                    break;
                }
            }



    }
}
