package month;
import java.util.*;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int month = Integer.parseInt(sc.next());
		
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
		}
		
		sc.close();

	}

}
