package arrayEx;

public class ArrayTwoDimention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [][] aa = new int[2][3];
//		aa[0][0] = 100;
//		aa[1][2] = 200;
//		//지하아파트 라고 생각해야함.
		int i=0;
		int j=0;
//		int[][] bb = {{10,20,30},
//						{40,50,60}};
//		
//		for(i=0;i<bb.length;i++)
//		{
//			for(j=0;j<bb[i].length;j++)
//			{
//				System.out.print(bb[i][j]+"\t");
//			}
//			System.out.println(); 
//			//이렇게 하지 않으면 행바뀜을 볼 수 없다.
//		}//여기서 만약 bb.length를 사용한다면 2가 출력됨.
//		//bb.length방식을 사용하기 위해 bb[i].length 이런식으로 표기 주의
//		
		int num=0;
		int[][] tByt = new int[3][3];
		for(i=0;i<tByt.length;i++)
		{
			for(j=0;j<i+1;i++)
			{
				num++;
				tByt[i][j] = num; 
			}
		}
		
		for(i=0;i<tByt.length;i++)
		{
			for(j=0;j<i+1;j++)
			{	//i+1을 해야 i값과 j값이 같을때 출력 가능함.
				
				System.out.print(tByt[i][j]+"\t");
				
			}
			System.out.println();
		}
		
	}

}
