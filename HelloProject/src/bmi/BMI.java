package bmi;
import java.util.*;

public class BMI {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //��ĳ�ʴ� �츮�� ������ �� ���� � �濡 �� �ִ�.
		System.out.print("Insert your Weight >> ");
		double weight = Double.parseDouble(sc.next());
		System.out.println();
		
		System.out.print("Insert your Hight >> ");
		
		double hight = (Double.parseDouble(sc.next())/100.0); //�������� �Ҷ� �Ǽ��� �Ǽ��� �����ؾ� �Ѵٴ°� �������.
		
		/*double bmi = weight/(hight*hight);*/
		
		double bmi = weight/Math.pow(hight, 2);  //Math.pow(��,����);
		
		System.out.println();
		
		if(bmi>=25.0 && bmi <= 30.0)
		{
			System.out.println("�״�� �� �Դϴ�.");
		}
		else if(bmi>=23.0) //��� �տ��� 25~30�� �����߱� ������ 25���� ���� ������ ��� �ȴ�.
		{
			System.out.println("�״�� ��ü�� �Դϴ�.");
		}
		else if(bmi>=20.0)
		{
			System.out.println("�״�� ���� �Դϴ�.");
		}
		else
		{
			System.out.println("�״�� ��ü�� �Դϴ�.");
		}
		
		sc.close();
	}
}
