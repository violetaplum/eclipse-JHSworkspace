package methodTest3;

public class MethodTest {
	public static void kaja(int[] bae2 )
	{
		bae2[0] = 0;
		bae2[1] = 0;
		System.out.println("This is the 'kaja' function!! >> "+bae2[2]);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bae = {10,20,30,40,50,100};
		
		kaja(bae);
		
		//���� ���ڸ� �޼ҵ� ���ǹ��� ���� �ϴ� ��
		//sysout("ondal")
		//sysout(aa+"ondal")
		//sysprintf("%d",100);
		//sysprintf("%s","babo");
		
		//�迭�� ��ǥ���� �� �迭�� ���۹����̴�.
		//call by value -> ������ ���� �ִ°��
		//call by reference -> ��ġ���� �ִ� ���
		
		for(int i=0;i<bae.length;i++) 
		{
			System.out.println(bae[i]);
		}
	}

}