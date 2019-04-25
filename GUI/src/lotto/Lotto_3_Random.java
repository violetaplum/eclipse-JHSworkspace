package lotto;

import java.util.Random;

public class Lotto_3_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
		int num1 = rd.nextInt(45)+1;
		int num2 = rd.nextInt(45)+1;
		int num3 = rd.nextInt(45)+1;
		int num4 = rd.nextInt(45)+1;
		int num5 = rd.nextInt(45)+1;
		int num6 = rd.nextInt(45)+1;
		
		System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num5);
		
	}

} 
