package objectTest;
import java.util.*;

class BBang	//�������� ���ݿ� ���� Ŭ���� ����
{
	
	
	String jong;
	//������ �Ӽ�
	Integer ka;
	//�� ���� �Ӽ�

	public BBang()
	{

	}

	public BBang(String jong, Integer ka)
	{
		this.jong = jong;
		this.ka = ka;
	}

	/*public void chool()
	{
		System.out.println("It is  "+this.jong+"\t and the price is "+this.ka);
	}*/
	@Override
	public String toString() //�������̵� : ��ӿ��� method�̸��� ����
							//�ڳ����� �θ��ʺ��� UPGRADE �ž� ��
	{
		return "[Name of Bread] "+this.jong+", [Price] "+this.ka;//return�� �ϳ�����ȯ
	}
	
	
	
}

public class Bakery {

	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BBang b1 = new BBang("Soboro",500); //heap memory�� ���������.
		//b1�� ��ġ(Stack memory) -> ��ü ��������
		//new BBang() �� ��ü Ȥ�� Instance (Heap memory)
		/*b1.chool();*/
		System.out.println(b1.toString()); //���� toString()�� ObjectŬ������ ���� �ִ� ����
											//Overriding�Ͽ� ������ ���̴�.

		Integer i = new Integer(10);

		System.out.println(i.toString());

		
		
	}

}
