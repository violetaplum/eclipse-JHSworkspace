package car;
import java.util.*;

class MyCar
{
	
	
	private int door;
	private String color;
	private int engine;
	
	public MyCar(int door, String color, int engine)
	{
		this.door = door;
		this.color = color;
		this.engine = engine;
		
	}
	//값들을 초기화하는 생성자. **생성자는 class 이름과 동일
	
	public void setDoor(int door)
	{
		this.door = door;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setEngine(int engine)
	{
		this.engine = engine;
	}
	//속성을 초기화 하는 메소드들
	
	
	public int getDoor()
	{
		return this.door;
	}
	public String getColor()
	{
		return this.color;
	}
	public int getEngine()
	{
		return this.engine;
	}
	//값들을 반환하는 메소드
}



public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCar newCar = new MyCar(2,"Blue",6);
		
		
		/*newCar.door = 2;
		newCar.color = new String("Blue");
		newCar.engine = 6;*/
		
		System.out.println("My new car has "+newCar.getDoor()+
				" doors and it's "+newCar.getColor()+
				".\nIt also has "+newCar.getEngine()+" engines!!");
		
		
	}

}
