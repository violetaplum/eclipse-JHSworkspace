package bakeryCopy1;
import java.util.*;

class BBang	//�������� ���ݿ� ���� Ŭ���� ����
{
	private String jong;//�������,�ʵ�,�Ӽ� ����� �̸����� �Ҹ���.
	//������ �Ӽ�
	//�ַ� �ʵ忡 access modifier�� ���δ�
	//private -> ĸ��ȭ�� ��
	private Integer ka;
	//�� ���� �Ӽ�
	//-----------------------------------------------------------------------

	public BBang()
	{
		this("No name",0);
	}

	public BBang(String jong)
	{
		this(jong,1000); // this() : �����ڰ� �ٸ� �����ڸ� ȣ���Ҷ��� ����
	}
	public BBang(String jong, Integer ka)  //public ���� ���� ���ϸ� main���� �ʱ�ȭ �Ұ�������
	{					//stack memory�� �ִ� ����
		this.jong = jong; //heap memory�� �ֱ�!
		this.ka = ka;
	}//�̰��� ������

	//------------------------------------------------------------------------
	public void setJong(String jong)// jong ������
	{
		this.jong = jong;
	}

	public String getJong()
	{
		return this.jong; 
	}
	
	public void get() //�� ���� public ����
	{
		System.out.print("It is  "+this.jong+"\t and the price is "+this.ka);
	}
	
	public void setKa(int ka) //ka ������
	{
		this.ka = ka;
	}
	public int getKa()
	{
		return this.ka;
	}
	
}

//--------------------------------------------------------------------------

public class Bakery{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		/*Scanner sc = new Scanner(System.in);
		System.out.print("Insert the jong! >>  ");
		String jong = sc.next();

		System.out.print("Insert the ka! >>  ");
		int ka = sc.nextInt();

		BBang b1 = new BBang(jong, ka);*/ //heap memory�� ���������.
		//b1�� ��ġ(Stack memory) -> ��ü ��������
		//new BBang() �� ��ü Ȥ�� Instance (Heap memory)
		/*b1.jong = new String("�Һ��� ��");
		b1.ka = new Integer(500);*/
		/*b1.get();*/
		/*System.out.print("It is  "+b1.jong+"\t and the price is "+b1.ka);*/
		BBang b1 = new BBang();
		BBang b2 = new BBang("Sweat Bread",700);
		BBang b3 = new BBang("Shue Cream Bread");

		System.out.println(b1.getJong()+"\t"+b1.getKa());
		System.out.println(b2.getJong()+"\t"+b2.getKa());
		System.out.println(b3.getJong()+"\t"+b3.getKa());

	}

}

