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
		//Arrays.binarySearch(arrary,key)
		//���� ã�� ���ϸ� ������ ��µȴ�. ���� ������� Ȯ�� �� �����ؾ� �Ѵ�.
		//ã���� index���� ��ȯ�Ѵ�.
		
	}

}