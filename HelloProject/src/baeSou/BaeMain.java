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
			this.answer="�氡�氡";
		}
		else if(num%5==0 && num%3!=0)
		{
			this.answer="�����氡";
		}
		else if(num%3==0&&num%5==0)
		{
			this.answer="����";
		}
		else
		{
			this.answer = "3,5 ��� ���� ����� �ƴմϴ�.";
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
		System.out.print("���ڸ� �Է��Ͻÿ� >> ");
		BaeClass ba = new BaeClass(sc.nextInt());
		ba.baeSou();
		System.out.println(ba.toString());
	}

}
