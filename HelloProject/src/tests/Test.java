package tests;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int j=0;
		 int n = 0;
		for(int i=9;i>0;i--) //열이 밖 for문을 담당한다.(행이 변화한다.)
		{
			n++;
			if(i>4)
			{
				for(j=0;j<n;j++)
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
