package bubbleSort;

public class BubbleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bae = {10,90,100,60,70};
		int temp = 0;
		//출력은 내림차순
		//배열길이-1만큼의 정렬표가 만들어진다.
		//(0,1)(1,2)(2,3)(3,4) 이 순서의 비교를 계속 한다.
		//처음 시도에서 가장 크기가 작거나 큰 하나를 정렬하게 된다.
		//그 다음에는 두번째 가장 작거나 큰 하나를 정렬하게 된다.
		//저것을 반복하여4번하면 4x4의 2차배열이 만들어진다.
		//따라서 for문이 2개 필요하다. 계속 자신의 위치보다 하나 큰 자리와 비교하므로 열의 위치는 그대로 넣으면 된다.
		for(int i=0;i<bae.length-1;i++)
		{
			for(int j=0;j<bae.length-1-i;j++)
			{			//i를 또 빼준다면 4x4에서 역삼각형모양의 표가 생긴다. 반복할 과정이 줄어든다.
				if (bae[j]<bae[j+1])
				{
					temp = bae[j];
					bae[j] = bae[j+1];
					bae[j+1] = temp;
				}
			}
		}
		
		//생각해보면 처음엔 가장 작거나 큰 값이 정해지므로 정렬 값으로 포함시킬 것이 줄어든다.
		
		
		//우연히 몇번만에 정렬이 된다면 
		
		for(int i=0;i<bae.length;i++)
		{
			System.out.print(bae[i]+"\t");
		}
	}
	
		
	

}
