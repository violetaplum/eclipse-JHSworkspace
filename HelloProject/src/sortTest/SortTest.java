package sortTest;

import java.util.*;

public class SortTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] bae = {10,90,100,60,70};
		Arrays.sort(bae); 
		
		//알아서 자동으로 정렬해준다.
		//오름차순 자동정렬된다.
		for(int i=0;i<bae.length;i++)
		{
			System.out.println(bae[i]);
	
		}
		
	
		//Collections.sort()
		int[] arr = {2,4,9,7,5,2};
		List<int[]> list = Arrays.asList(arr);
		Collections.reverse(list);
	
		
		//sequence search(순차검색)
		//binary search(이진검색)
		//phibonacci search(피보나치검색)
		
	
		
		
		
		
		
	}
}
