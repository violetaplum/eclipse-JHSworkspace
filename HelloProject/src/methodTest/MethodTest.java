package methodTest;

public class MethodTest {

	private static void joonbi() //1���� method
	{
		// TODO Auto-generated method stub
		System.out.println("I'm preparing Ingredients..");
		
		
	}
	private static void haeva() //1���� method
	{
		// TODO Auto-generated method stub
		System.out.println("I just started to cook!!");
		
	}
	private static void mamuri() //1���� method
	{
		// TODO Auto-generated method stub
		System.out.println("Dinner served!!!!");
	}
	private static void haeva2(String joo, int price) //2���� method
	{							//�Ű�����. parameter��� ���Ѵ�.
		// TODO Auto-generated method stub
		System.out.println("I'm cooking with "+joo+" in "+price+"$s ");
	}
	private static String mamoori() //3���� method 
	{
		// TODO Auto-generated method stub
		System.out.println("I'm Recycling~~~");
		return "End of Recycling~";
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//��� ���α׷��� main���� �����Ͽ� main���� ������
		joonbi();
		haeva();
		mamuri();
		haeva2("happy",3000); //2���� : ����(argument)�� �޴� ����
		String receive = mamoori();
		System.out.println(receive);
		
	}
	//main�ȿ� ��� ������ �ִ� ��� module���� ������ �����.
	//method ȣ�⹮ - method ���ǹ�
	//����		  - ��
	//method 1������ main���� method ������ ���ٰ� �ٽ� main���� ���ƿ´�.
	//2���� : argument�� ����� , 3���� : return���� ����
	//1,2������ main�� ����ߴ� ������������ ���ƿ�����
	//3������ ����ߴ� �������� ���ƿͼ� �װ��� �����. �װ����� ���� �ϰ�ʹٸ� ������ ������ ��.

	
	
	

	
	
}
