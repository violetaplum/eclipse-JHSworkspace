package score;
import java.util.*;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert your Score >> ");
		int jum = Integer.parseInt(sc.next());
		int con = jum/10;   //점수를 10으로 나누어 몫으로 구분하는 방법!!
			/*if(con==9)
			{
				System.out.println("You've got A!"); //화면 출력명령
			}
			else if(con==8)
			{
				System.out.println("You've got B!");
			}
			else if(con==7)
			{
				System.out.println("You've got C!");
			}
			else if(con==6)
			{
				System.out.println("You've got D!");
			}
			else
			{
				System.out.println("You've got F..");
			}*/
			
			switch(con)
			{
			case 10:
				//System.out.println("You've got A!"); //break를 없애면 break를 만날때 까지 헤맨다. 몫이 10이면 A학점을 만난다.
													//하지만 그 뒤 break를 못만나면 계속 찾아 헤맨다.
													//하단의 break를 만나기전까지 조건확인도 안하고 수행의 연속..
				//break;
			case 9:
				System.out.println("You've got A!");
				break;  //이 break를 만나게 하기 위해 상단의 break를 지워버린다.
			case 8:
				System.out.println("You've got B!");
				break;
			case 7:
				System.out.println("You've got C!");
				break;
			case 6:
				System.out.println("You've got D!");
				break;
			default:
				System.out.println("You've got F...");
				break; //이 break는 생략 가능하다. default 자체도 생략 가능하다.
			}
			sc.close();
			
			//월을 입력받아 해당 월의 날짜수를 출력하는 프로그램...
			
			
	}

}
