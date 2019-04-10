package bakeryCopy1;
import java.util.*;

class BBang	//빵종류와 가격에 대한 클래스 생성
{
	private String jong;//멤버변수,필드,속성 등등의 이름으로 불린다.
	//빵종류 속성
	//주로 필드에 access modifier를 붙인다
	//private -> 캡슐화가 됨
	private Integer ka;
	//빵 가격 속성
	//-----------------------------------------------------------------------

	public BBang()
	{
		this("No name",0);
	}

	public BBang(String jong)
	{
		this(jong,1000); // this() : 생성자가 다른 생성자를 호출할때의 형식
	}
	public BBang(String jong, Integer ka)  //public 으로 하지 못하면 main에서 초기화 불가능해짐
	{					//stack memory에 있는 변수
		this.jong = jong; //heap memory에 넣기!
		this.ka = ka;
	}//이것은 생성자

	//------------------------------------------------------------------------
	public void setJong(String jong)// jong 생성자
	{
		this.jong = jong;
	}

	public String getJong()
	{
		return this.jong; 
	}
	
	public void get() //이 또한 public 선언
	{
		System.out.print("It is  "+this.jong+"\t and the price is "+this.ka);
	}
	
	public void setKa(int ka) //ka 생성자
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

		BBang b1 = new BBang(jong, ka);*/ //heap memory에 만들어진다.
		//b1은 위치(Stack memory) -> 객체 참조변수
		//new BBang() 은 객체 혹은 Instance (Heap memory)
		/*b1.jong = new String("소보루 빵");
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

