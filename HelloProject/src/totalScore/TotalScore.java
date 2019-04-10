package totalScore;
import java.util.*;

public class TotalScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//국어 영어 수학 점수를 입력받아 총합 빛 평균을 계산하여 출력해라
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert Korean >> ");
		String korean = sc.next();
		
		System.out.print("Insert English >> ");
		String english = sc.next();
		
		System.out.print("Insert Math >> ");
		String math = sc.next();
		
		
		int total = Integer.parseInt(korean)+Integer.parseInt(english)+Integer.parseInt(math);
		int ave = total/3;
		
		System.out.println("Total Score is : "+total+"  Average is : "+ave);
		
		
		
		
		int[] scores = new int[3];
		String[] ask = {"Korean","English","Math"};
		int secondTotal = 0;
		System.out.println();System.out.println();
		
		
		for(int i=0;i<scores.length;i++)
		{
			System.out.print("Insert "+ask[i]+" >> ");
			scores[i] = Integer.parseInt(sc.next());
			secondTotal += scores[i];
					
		}
		
		int secondAve = secondTotal/3;
		
		System.out.println("The Second Total is :::  "+secondTotal);
		System.out.println("The Second Average is :::  "+secondAve);
		
		
		
		sc.close();
		

	}

}
