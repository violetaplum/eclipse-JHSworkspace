package arrayEx;

public class ArrayTwoDimention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [][] aa = new int[2][3];
//		aa[0][0] = 100;
//		aa[1][2] = 200;
//		//���Ͼ���Ʈ ��� �����ؾ���.
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
//			//�̷��� ���� ������ ��ٲ��� �� �� ����.
//		}//���⼭ ���� bb.length�� ����Ѵٸ� 2�� ��µ�.
//		//bb.length����� ����ϱ� ���� bb[i].length �̷������� ǥ�� ����
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
			{	//i+1�� �ؾ� i���� j���� ������ ��� ������.
				
				System.out.print(tByt[i][j]+"\t");
				
			}
			System.out.println();
		}
		
	}

}
