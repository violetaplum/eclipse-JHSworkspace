package arrayEx;
import java.util.*;


public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���â���� ���� �����ϰ� �� �ڿ� ��ü�� ���δ�
		
	/*	int[] aa;
		aa = new int[3];
		int aa2[] = new int[3];
		int i=3;
	*/
		
	/*	�ʱ�ġ �ִ� �� : aa[0] = 100;
					aa[1] = 200;
					aa[19] = 45;
					
					int[] aa = {�ʱ�ġ,�ʱ�ġ};
					int[] aa = {100,200,30,67,43,65,...,45}
					������ ��� �˾Ƽ� �ʱ�ġ�� �縸ŭ �迭 ũ�⸦ ����ش�.
					Buffer���� ����?
	*/
		/*Q) java, c,....,7������ ������ �� �� ������ ����� ���Ͻÿ�
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
		System.out.printf("����: %d  ��� : %.2f",sum,sum/7.0); 
		//������ C��� ����� �̿��� �Ҽ��� 2�ڸ����� ǥ���ϴ¹�
		System.out.print("Total Score : "+sum+"  Average Score : "+(int)sum/score.length);
		sc.close();
		
		//��� �̴�������Ʈ ����.
		
		
		
		
		
		
					
	}

}