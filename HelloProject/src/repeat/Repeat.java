package repeat;
import java.util.*;


public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sw = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		while(sw == 0) //while문은 스위치를 이용한 무한루프때 많이 쓴다.
		{
			
			if(count == 3)
			{
				continue; // 다시 처음으로 돌아가서 시작한다. 때문에 3은 찍지 않게된다.
			}
			
			System.out.println(count);
			count++;
			if(count == 10) //'컵이 없다면' 으로 간주
			{
				sw = 1; //while안의 조건과 만나서 빠져나가게 된다.
				/*break;*/   //가장 가까운 반복문인 while문을 빠져나가게 된다.
			}
			
		}
		
		sc.close();
	}

}
