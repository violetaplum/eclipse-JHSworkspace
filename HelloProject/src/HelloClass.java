import java.util.*;

public class HelloClass {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("println은 줄바꿈이 된다.");  //화면에 출력하라
		System.out.print("print는 줄바꿈이 안된다.");  
		int aa = 100;
		System.out.println(aa);
		short ss = 200;
		System.out.println(ss);
		int ab = 60;
		byte dd = 127;
		long ll = 1234567; //long은 8byte이기 때문에 큰 숫자 표현이 가능
		
		
		double bb = 3.14; //배정도 실수
		float cc = 3.141592432346f; //단정도실수 , f는 여기서 숫자를 뜻함
		
		boolean ff = false;
		
		String g = "good";
		
		/*System.out.println(); //line skip을 의미한다.
		System.out.println(bb);
		System.out.println("bb");
		System.out.println("\t");
		
		System.out.println(g);*/
		
		//달에서의 몸무게 -> 지구에서의 18%..!
		
		int earth = 100;
		Scanner sc = new Scanner(System.in);
		
		double moon = earth*0.18;
		
		
		System.out.println("My weight on the moon is : "+moon+"Kg");
		
		System.out.println("삼각형의 넓이 구하기");
		
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
		//자료의 형변환
		short s1 = 100;
		int aa3 = (int)s1; //이 경우는 작은 것을 큰 것에 넣는 경우 (암시적 형변환;implicit conversion)
		
		char c1 = (char)aa3; //이 경우는 큰 것을 작은 것에 넣는 경우 (명시적 형변환;explicit conversion)
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
		
		String r = null; //주소도 없고 값이 정해지지않은 상태
		String R = ""; //주소는 가지고 있는 상태. 하지만 찾아가면 정할 수 없는 것이 들어있음
		int soo = 30;
		soo = soo++; //'누적 스택' 이라고 한다 후치 연산자
		soo = ++soo; //전치 연산자
		
		//후치연산자와 전치 연산자는 함께 쓸때 문제가 생긴다.
		
		int count = 100;
		System.out.println(count++);
		System.out.println(++count);
		
		if(soo>count)
		{
			System.out.println("그래도 해야지?");
		}
		else
		{
			System.out.println("아니면 집에가라");
			System.out.println("bye bye~~");
			
		}
		
		String bada = (soo>count) ? "신나게 집으로" : "어쨌든 집으로"; //조건이 어떤지 물어봐서 yes이면 yes쪽의 답을 취하고 그렇지 않으면 no쪽의 답을 취하는 것이다.
		System.out.println(bada);
		
		int grade = sc.nextInt();
		
		if(grade>=90 && grade<=100)
		{
			
		}
		
		sc.close();
	}

}
