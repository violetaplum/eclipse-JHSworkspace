package stringTokenizerTest;

import java.util.StringTokenizer;

public class StringTokenizerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StringTokenizer st1 = new StringTokenizer("�ٺ� �´� ����");
			StringTokenizer ss = new StringTokenizer("ss aa");
			while(ss.hasMoreTokens())
			{
				System.out.println(ss.nextToken());
				System.out.println(ss.countTokens());

			}
			//�⺻������ " "���� ��ūȭ�ȴ�.
			while(st1.hasMoreTokens())
			{
				System.out.println(st1.nextToken());
			}
			//StringTokenizer.countTokens() : ���������� ��ū�� �о���� �� �����ִ� ��ū ��
			//StringTokenizer.hasMoreTokens() : ��ū�� ���������� true,�ƴϸ� false
			//StringTokenizer.nextToken() : ��ū �о����
			
			String tel = "010-1111-2222";
			StringTokenizer st2 = new StringTokenizer(tel,"-");
			//StringTokenizer(String,������ String);
			while(st2.hasMoreTokens())
			{
				System.out.println(st2.nextToken());
			}
	}

}
