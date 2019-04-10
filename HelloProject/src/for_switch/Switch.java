package for_switch;
import java.util.*;

public class Switch {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Wanna order some Baverage? ");
		String temp = sc.next();
		switch(temp)
		{
		case "1":
			System.out.println(" Ordered Coffee ");
			break;
			
		case "2":
			System.out.println(" Ordered Coke ");
			break;
			
		case "3":
			System.out.println(" Ordered Juice ");
			break;
			
		default:
			System.out.println("Try it again....");
			break;
		
		}
	}
}
