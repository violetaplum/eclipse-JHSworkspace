package sequenceSearch;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] bae = {500,102,207,15,300};
			for(int i=0;i<bae.length;i++)
			{
				System.out.println(bae[i]+"\t");
			}
			System.out.println();
			
			int flage = 0;
			for(int i=0;i<bae.length;i++)
			{
				if(bae[i]==15)
				{
					System.out.println("0��°���� �����Ͽ� "+i+" ��°�� �ִ�.");
					flage=1;
				}
			}
			if(flage==0)
			{
				System.out.println("���� ����..");
			}
	}

}
