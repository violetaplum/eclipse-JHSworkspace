package repeat;
import java.util.*;


public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sw = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		while(sw == 0) //while���� ����ġ�� �̿��� ���ѷ����� ���� ����.
		{
			
			if(count == 3)
			{
				continue; // �ٽ� ó������ ���ư��� �����Ѵ�. ������ 3�� ���� �ʰԵȴ�.
			}
			
			System.out.println(count);
			count++;
			if(count == 10) //'���� ���ٸ�' ���� ����
			{
				sw = 1; //while���� ���ǰ� ������ ���������� �ȴ�.
				/*break;*/   //���� ����� �ݺ����� while���� ���������� �ȴ�.
			}
			
		}
		
		sc.close();
	}

}
