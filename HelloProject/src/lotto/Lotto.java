package lotto;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*System.out.print("자동기계 로또 번호 >>  ");*/
/*		for(int j = 0;j<10;j++)
		{
			System.out.print("자동기계 로또 번호 >>  ");
		for(int i=0;i<6;i++) //반복하러 올라오면서 i가 증가한다. 목적치를 확인 하고 수행 
		{
			//for(;;) 은 무한루프를 만들게 된다.
			int number = (int)Math.ceil(Math.random()*45);
			
			System.out.print(number+"   ");
		}
		System.out.println();
		} //중첩 for문을 사용했다.
*/		
		 int j=0;
		 int n = 0;
		for(int i=9;i>0;i--) //열이 밖 for문을 담당한다.(행이 변화한다.)
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
				for(j=0;j<i;j++) //행이 안쪽 for문으로 들어간다.(열이 변화한다.)
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
