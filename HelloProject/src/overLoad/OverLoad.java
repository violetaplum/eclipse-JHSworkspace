package overLoad;

public class OverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메소드 오버로딩 = 함수중복
		//1)메소드의 이름은 같아야 한다
		//2)인자의 type이 다르거나 갯수가 달라야 한다.
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
