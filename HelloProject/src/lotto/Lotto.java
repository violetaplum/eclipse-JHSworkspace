package lotto;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*System.out.print("�ڵ���� �ζ� ��ȣ >>  ");*/
/*		for(int j = 0;j<10;j++)
		{
			System.out.print("�ڵ���� �ζ� ��ȣ >>  ");
		for(int i=0;i<6;i++) //�ݺ��Ϸ� �ö���鼭 i�� �����Ѵ�. ����ġ�� Ȯ�� �ϰ� ���� 
		{
			//for(;;) �� ���ѷ����� ����� �ȴ�.
			int number = (int)Math.ceil(Math.random()*45);
			
			System.out.print(number+"   ");
		}
		System.out.println();
		} //��ø for���� ����ߴ�.
*/		
		 int j=0;
		 int n = 0;
		for(int i=9;i>0;i--) //���� �� for���� ����Ѵ�.(���� ��ȭ�Ѵ�.)
		{
			if(i>4)
			{
				for(j=0;j<4-j;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			else
			{
				for(j=0;j<i;j++) //���� ���� for������ ����.(���� ��ȭ�Ѵ�.)
				{
				System.out.print("*");
				}
				System.out.println();
			}
		}
		
		for(int i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(j<i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
				
				/*j<i ? System.out.print(" ") : System.out.print("*");*/
			}
			System.out.println();
		}
		
		

	}

}
