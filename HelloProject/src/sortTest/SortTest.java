package sortTest;

import java.util.*;

public class SortTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] bae = {10,90,100,60,70};
		Arrays.sort(bae); 
		
		//�˾Ƽ� �ڵ����� �������ش�.
		//�������� �ڵ����ĵȴ�.
		for(int i=0;i<bae.length;i++)
		{
			System.out.println(bae[i]);
	
		}
		
	
		//Collections.sort()
		int[] arr = {2,4,9,7,5,2};
		List<int[]> list = Arrays.asList(arr);
		Collections.reverse(list);
	
		
		//sequence search(�����˻�)
		//binary search(�����˻�)
		//phibonacci search(�Ǻ���ġ�˻�)
		
	
		
		
		
		
		
	}
}