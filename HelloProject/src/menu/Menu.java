package menu;
import java.util.*;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("1��  -> ¥��  // 2��  -> «��  // �ֹ� ����  -> 3��");
			System.out.print("�ֹ���ȣ�� �Է� ���ּ��� >> ");
			number = Integer.parseInt(sc.next());
			
			/*if(number == 1)
			{
				System.out.println("¥���� �ֹ� �ϼ̱���. ");
			}
			else if(number == 2)
			{
				System.out.println("«���� �ֹ� �ϼ̱���. ");
			}*/
			
			switch(number)
			{
			case 1:
				System.out.println("¥�带 �ֹ� �ϼ̱���. ");
				break;
			case 2:
				System.out.println("«���� �ֹ� �ϼ̱���. ");
			}
			
		}while(number!=3); // number != 1 && number != 2  ��� ������ �־ �ȴ�.
		
		
		
		
		sc.close();

	}

}
