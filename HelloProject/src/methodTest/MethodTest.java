package methodTest;

public class MethodTest {

	private static void joonbi() //1형식 method
	{
		// TODO Auto-generated method stub
		System.out.println("I'm preparing Ingredients..");
		
		
	}
	private static void haeva() //1형식 method
	{
		// TODO Auto-generated method stub
		System.out.println("I just started to cook!!");
		
	}
	private static void mamuri() //1형식 method
	{
		// TODO Auto-generated method stub
		System.out.println("Dinner served!!!!");
	}
	private static void haeva2(String joo, int price) //2형식 method
	{							//매개변수. parameter라고 말한다.
		// TODO Auto-generated method stub
		System.out.println("I'm cooking with "+joo+" in "+price+"$s ");
	}
	private static String mamoori() //3형식 method 
	{
		// TODO Auto-generated method stub
		System.out.println("I'm Recycling~~~");
		return "End of Recycling~";
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//모든 프로그램은 main으로 시작하여 main으로 끝난다
		joonbi();
		haeva();
		mamuri();
		haeva2("happy",3000); //2형식 : 인자(argument)를 받는 형태
		String receive = mamoori();
		System.out.println(receive);
		
	}
	//main안에 모든 내용을 넣는 대신 module별로 나눠서 만든다.
	//method 호출문 - method 정의문
	//사장		  - 비서
	//method 1형식은 main에서 method 만나면 갔다가 다시 main으로 돌아온다.
	//2형식 : argument를 줘야함 , 3형식 : return값이 있음
	//1,2형식은 main의 출발했던 다음문장으로 돌아오지만
	//3형식은 출발했던 문장으로 돌아와서 그곳을 지운다. 그것으로 무언가 하고싶다면 변수에 넣으면 됨.

	
	
	

	
	
}
