package menu;
import java.util.*;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("1번  -> 짜장  // 2번  -> 짬뽕  // 주문 중지  -> 3번");
			System.out.print("주문번호를 입력 해주세요 >> ");
			number = Integer.parseInt(sc.next());
			
			/*if(number == 1)
			{
				System.out.println("짜장을 주문 하셨군요. ");
			}
			else if(number == 2)
			{
				System.out.println("짬뽕을 주문 하셨군요. ");
			}*/
			
			switch(number)
			{
			case 1:
				System.out.println("짜장를 주문 하셨군요. ");
				break;
			case 2:
				System.out.println("짬뽕을 주문 하셨군요. ");
			}
			
		}while(number!=3); // number != 1 && number != 2  라는 조건을 넣어도 된다.
		
		
		
		
		sc.close();

	}

}
