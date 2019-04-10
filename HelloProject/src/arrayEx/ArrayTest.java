package arrayEx;
import java.util.*;


public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기억창고를 먼저 선언하고 그 뒤에 객체를 붙인다
		
	/*	int[] aa;
		aa = new int[3];
		int aa2[] = new int[3];
		int i=3;
	*/
		
	/*	초기치 넣는 법 : aa[0] = 100;
					aa[1] = 200;
					aa[19] = 45;
					
					int[] aa = {초기치,초기치};
					int[] aa = {100,200,30,67,43,65,...,45}
					위같은 경우 알아서 초기치의 양만큼 배열 크기를 잡아준다.
					Buffer같은 느낌?
	*/
		/*Q) java, c,....,7과목의 시험을 본 후 총점과 평균을 구하시오
		*/
		
		int[] score = new int[7];
		int sum=0;
		Scanner sc = new Scanner(System.in);
		for(int j=0;j<score.length;j++)
		{
			score[j] = sc.nextInt();
		}
		
		for(int i=0;i<score.length;i++)
		{
			sum += score[i];
		}
		System.out.printf("총점: %d  평균 : %.2f",sum,sum/7.0); 
		//상위는 C언어 방식을 이용해 소숫점 2자리까지 표현하는법
		System.out.print("Total Score : "+sum+"  Average Score : "+(int)sum/score.length);
		sc.close();
		
		//행맨 미니프로젝트 하자.
		
		
		
		
		
		
					
	}

}
