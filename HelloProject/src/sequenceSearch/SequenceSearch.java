package sequenceSearch;
import java.util.*;

public class SequenceSearch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] bae = {500,102,207,15,300};
		for(int i=0;i<bae.length;i++)
		{
			System.out.println(bae[i]+"\t");
		}
		System.out.println();
		
		//정렬시 중복된 데이터는 어떻게 처리 할 것인가?
		
		int flage = 0;
		for(int i=0;i<bae.length;i++)
		{
			if(bae[i]==15)
			{
				System.out.println("0번째 부터 시작하여"+i+" 번째에 있다는~~");
				flage=1;
			}
				//만약 중복으로 데이터가 존재한다면 상위 문구가 중복 출력된다.
		}
		if(flage==0)
		{
			System.out.println("뭐야 없네.");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
