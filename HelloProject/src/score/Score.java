package score;
import java.util.*;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert your Score >> ");
		int jum = Integer.parseInt(sc.next());
		int con = jum/10;   //������ 10���� ������ ������ �����ϴ� ���!!
			/*if(con==9)
			{
				System.out.println("You've got A!"); //ȭ�� ��¸��
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
				//System.out.println("You've got A!"); //break�� ���ָ� break�� ������ ���� ��Ǵ�. ���� 10�̸� A������ ������.
													//������ �� �� break�� �������� ��� ã�� ��Ǵ�.
													//�ϴ��� break�� ������������ ����Ȯ�ε� ���ϰ� ������ ����..
				//break;
			case 9:
				System.out.println("You've got A!");
				break;  //�� break�� ������ �ϱ� ���� ����� break�� ����������.
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
				break; //�� break�� ���� �����ϴ�. default ��ü�� ���� �����ϴ�.
			}
			sc.close();
			
			//���� �Է¹޾� �ش� ���� ��¥���� ����ϴ� ���α׷�...
			
			
	}

}
