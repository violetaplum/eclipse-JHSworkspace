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
	//������ �ʱ�ȭ�ϴ� ������. **�����ڴ� class �̸��� ����
	
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
	//�Ӽ��� �ʱ�ȭ �ϴ� �޼ҵ��
	
	
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
	//������ ��ȯ�ϴ� �޼ҵ�
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
