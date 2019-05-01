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
		//배열 내부값 확인코드
		
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
		//Arrays.binarySearch(arrary,key) : index값을 반환
		//값을 찾지 못하면 음수가 출력된다. 따라서 양수임을 확인 후 수행해야 한다.
		//찾으면 index값을 반환한다.
		
	}

}
