package baeSou;

import java.util.Scanner;

class BaeClass
{
	private int num;
	private String answer;
	public BaeClass(int num)
	{
		this.num = num;
	}
	public void baeSou()
	{
		if(num%3==0 && num%5!=0)
		{
			this.answer="방가방가";
		}
		else if(num%5==0 && num%3!=0)
		{
			this.answer="나도방가";
		}
		else if(num%3==0&&num%5==0)
		{
			this.answer="웬열";
		}
		else
		{
			this.answer = "3,5 어느 수의 배수도 아닙니다.";
		}
	}
	public String toString()
	{
		return this.answer;
	}
}

public class BaeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("숫자를 입력하시오 >> ");
		BaeClass ba = new BaeClass(sc.nextInt());
		ba.baeSou();
		System.out.println(ba.toString());
	}

}
