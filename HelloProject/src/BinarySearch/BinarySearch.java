package BinarySearch;
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bae = {500,102,207,15,300};
		Arrays.sort(bae);
		for(int i=0;i<bae.length;i++)
		{
			System.out.println(bae[i]+"\t");
		}
		System.out.println();
		//�迭 ���ΰ� Ȯ���ڵ�
		
		int[] arr = {14,769,2,5446,554,234};
		Arrays.sort(bae);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t");
		}
		System.out.println();
		if(Arrays.binarySearch(bae, 300)>=0)
		{
			System.out.println("I found it!!!!");
			System.out.println("Start from the index 0 , it's in "
					+Arrays.binarySearch(bae, 300)+"th index.");
		}
		else
		{
			System.out.println("I couldn't found it....lol");
			
			
		}
		//Arrays.binarySearch(arrary,key) : index���� ��ȯ
		//���� ã�� ���ϸ� ������ ��µȴ�. ���� ������� Ȯ�� �� �����ؾ� �Ѵ�.
		//ã���� index���� ��ȯ�Ѵ�.
		
	}

}
