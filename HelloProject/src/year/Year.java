package year;
import java.util.*;

public class Year {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert the year >> ");
		int year = Integer.parseInt(sc.next());
		
		if((year%4 == 0)&&(year%100 != 0)||(year%400 == 0))
		{
			System.out.println("This year has 366days..");
		}
		else
		{
			System.out.println("This year has 365days..");
		}
		
		/*int month = Integer.parseInt(sc.next());
		
		switch(month)
		{
			case 1: case 3: case 5: 
			case 7: case 8: case 10: case 12:
				System.out.println("31");
			case 2:
				System.out.println("28");
				break;
			case 4: case 6: case 9: 
			case 11:
				System.out.println("30");
				break;
			default:
				System.out.println("1~12만 넣어주세요.");
				break;
		}*/
		
		
		sc.close();
	}
}
