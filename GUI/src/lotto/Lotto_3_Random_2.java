package lotto;

import java.util.Arrays;

class Lotto_5_dualNo_out extends Lotto_3_Random
{
	public static void lottokaja()
	{
		int[] arr = new int[0];
		for(int i=0;i<6;i++)
		{
			arr[i]=(int)(Math.ceil(Math.random()*45));
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])//���ſ� ������ i�� �ϳ� ������ ������. �׷��� �ٽ� ���ϳ� �����
					i--;
			}
		}
		Arrays.sort(arr);
		for(int i=0;i<6;i++)
		{
			System.out.println(arr[i]+"\t");
		}
		System.out.println();
	}
}

public class Lotto_3_Random_2 extends Lotto_5_dualNo_out{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			lottokaja();
	}

}
