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
		
		//많은 인자를 메소드 정의문에 전달 하는 법
		//sysout("ondal")
		//sysout(aa+"ondal")
		//sysprintf("%d",100);
		//sysprintf("%s","babo");
		
		//배열의 대표명은 그 배열의 시작번지이다.
		//call by value -> 내용을 직접 주는경우
		//call by reference -> 위치값을 주는 경우
		
		for(int i=0;i<bae.length;i++) 
		{
			System.out.println(bae[i]);
		}
	}

}
