package bmi;
import java.util.*;

public class BMI {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //스캐너는 우리가 접근할 수 없는 어떤 방에 들어가 있다.
		System.out.print("Insert your Weight >> ");
		double weight = Double.parseDouble(sc.next());
		System.out.println();
		
		System.out.print("Insert your Hight >> ");
		
		double hight = (Double.parseDouble(sc.next())/100.0); //나눗셈을 할때 실수는 실수로 수행해야 한다는것 기억하자.
		
		/*double bmi = weight/(hight*hight);*/
		
		double bmi = weight/Math.pow(hight, 2);  //Math.pow(밑,지수);
		
		System.out.println();
		
		if(bmi>=25.0 && bmi <= 30.0)
		{
			System.out.println("그대는 비만 입니다.");
		}
		else if(bmi>=23.0) //사실 앞에서 25~30은 제외했기 때문에 25보다 작은 조건은 없어도 된다.
		{
			System.out.println("그대는 과체중 입니다.");
		}
		else if(bmi>=20.0)
		{
			System.out.println("그대는 보통 입니다.");
		}
		else
		{
			System.out.println("그대는 저체중 입니다.");
		}
		
		sc.close();
	}
}
