package overLoad;

public class OverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�޼ҵ� �����ε� = �Լ��ߺ�
		//1)�޼ҵ��� �̸��� ���ƾ� �Ѵ�
		//2)������ type�� �ٸ��ų� ������ �޶�� �Ѵ�.
		//3)
		//atoi() : alphabet to Integer 
		//atof(), atol()...   symbolic word
		int aa = 100;
		double bb = 23.5;
		kaja();
		kaja(aa);
		kaja(bb);
	}

	private static void kaja() {
		// TODO Auto-generated method stub
		System.out.println("What the~~");
	}
	private static void kaja(int aa)
	{
		System.out.println(aa);
	}
	private static void kaja(double  aa)
	{
		System.out.println(aa);
	}

}