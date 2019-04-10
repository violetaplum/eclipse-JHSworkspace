package objectTest;
import java.util.*;

class BBang	//빵종류와 가격에 대한 클래스 생성
{
	
	
	String jong;
	//빵종류 속성
	Integer ka;
	//빵 가격 속성

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
	public String toString() //오버라이딩 : 상속에서 method이름은 같고
							//자녀쪽은 부모쪽보다 UPGRADE 돼야 함
	{
		return "[Name of Bread] "+this.jong+", [Price] "+this.ka;//return은 하나만반환
	}
	
	
	
}

public class Bakery {

	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BBang b1 = new BBang("Soboro",500); //heap memory에 만들어진다.
		//b1은 위치(Stack memory) -> 객체 참조변수
		//new BBang() 은 객체 혹은 Instance (Heap memory)
		/*b1.chool();*/
		System.out.println(b1.toString()); //원래 toString()은 Object클래스에 속해 있는 것을
											//Overriding하여 변형한 것이다.

		Integer i = new Integer(10);

		System.out.println(i.toString());

		
		
	}

}
