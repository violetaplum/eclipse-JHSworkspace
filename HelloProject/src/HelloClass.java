import java.util.*;

public class HelloClass {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("println�� �ٹٲ��� �ȴ�.");  //ȭ�鿡 ����϶�
		System.out.print("print�� �ٹٲ��� �ȵȴ�.");  
		int aa = 100;
		System.out.println(aa);
		short ss = 200;
		System.out.println(ss);
		int ab = 60;
		byte dd = 127;
		long ll = 1234567; //long�� 8byte�̱� ������ ū ���� ǥ���� ����
		
		
		double bb = 3.14; //������ �Ǽ�
		float cc = 3.141592432346f; //�������Ǽ� , f�� ���⼭ ���ڸ� ����
		
		boolean ff = false;
		
		String g = "good";
		
		/*System.out.println(); //line skip�� �ǹ��Ѵ�.
		System.out.println(bb);
		System.out.println("bb");
		System.out.println("\t");
		
		System.out.println(g);*/
		
		//�޿����� ������ -> ���������� 18%..!
		
		int earth = 100;
		Scanner sc = new Scanner(System.in);
		
		double moon = earth*0.18;
		
		
		System.out.println("My weight on the moon is : "+moon+"Kg");
		
		System.out.println("�ﰢ���� ���� ���ϱ�");
		
		double width = 3;
		double height = 5;
		double scale = (width*height)/2;
		
		System.out.println("The scale of   Trianlge is : "+scale);
		
		double C = 30;
		double F = 70;
		
		
		System.out.println("The Celcius 30 in Fahrenheit is : "+((C*1.8)+32));
		System.out.println("The Fahrenheit 70 in Celcius is : "+((F-32)/1.8));
		
		char AA = 65;
		
		System.out.println(AA+31);
		System.out.println((char)(AA+32));
		//�ڷ��� ����ȯ
		short s1 = 100;
		int aa3 = (int)s1; //�� ���� ���� ���� ū �Ϳ� �ִ� ��� (�Ͻ��� ����ȯ;implicit conversion)
		
		char c1 = (char)aa3; //�� ���� ū ���� ���� �Ϳ� �ִ� ��� (����� ����ȯ;explicit conversion)
		System.out.println(c1);
		
		int aa4 = 2147483647+1;
		System.out.println(aa4);
		
		
		System.out.println(Long.MAX_VALUE+"\t"+Long.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE+"\t"+Integer.MIN_VALUE);
		System.out.println(Float.MAX_VALUE+"\t"+Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE+"\t"+Double.MIN_VALUE);
		System.out.println(Short.MAX_VALUE+"\t"+Short.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE+"\t"+Byte.MIN_VALUE);
		
		//Short.MAX_VALUE
		//Short.MIN_VALUE
		
		String r = null; //�ּҵ� ���� ���� ������������ ����
		String R = ""; //�ּҴ� ������ �ִ� ����. ������ ã�ư��� ���� �� ���� ���� �������
		int soo = 30;
		soo = soo++; //'���� ����' �̶�� �Ѵ� ��ġ ������
		soo = ++soo; //��ġ ������
		
		//��ġ�����ڿ� ��ġ �����ڴ� �Բ� ���� ������ �����.
		
		int count = 100;
		System.out.println(count++);
		System.out.println(++count);
		
		if(soo>count)
		{
			System.out.println("�׷��� �ؾ���?");
		}
		else
		{
			System.out.println("�ƴϸ� ��������");
			System.out.println("bye bye~~");
			
		}
		
		String bada = (soo>count) ? "�ų��� ������" : "��·�� ������"; //������ ��� ������� yes�̸� yes���� ���� ���ϰ� �׷��� ������ no���� ���� ���ϴ� ���̴�.
		System.out.println(bada);
		
		int grade = sc.nextInt();
		
		if(grade>=90 && grade<=100)
		{
			
		}
		
		sc.close();
	}

}
