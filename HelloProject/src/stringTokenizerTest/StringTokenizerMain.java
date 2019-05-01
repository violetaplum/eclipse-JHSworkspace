package stringTokenizerTest;

import java.util.StringTokenizer;

public class StringTokenizerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StringTokenizer st1 = new StringTokenizer("바보 온달 공주");
			StringTokenizer ss = new StringTokenizer("ss aa");
			while(ss.hasMoreTokens())
			{
				System.out.println(ss.nextToken());
				System.out.println(ss.countTokens());

			}
			//기본적으로 " "으로 토큰화된다.
			while(st1.hasMoreTokens())
			{
				System.out.println(st1.nextToken());
			}
			//StringTokenizer.countTokens() : 마지막으로 토큰을 읽어오기 전 남아있는 토큰 수
			//StringTokenizer.hasMoreTokens() : 토큰이 남아있으면 true,아니면 false
			//StringTokenizer.nextToken() : 토큰 읽어오기
			
			String tel = "010-1111-2222";
			StringTokenizer st2 = new StringTokenizer(tel,"-");
			//StringTokenizer(String,구분자 String);
			while(st2.hasMoreTokens())
			{
				System.out.println(st2.nextToken());
			}
	}

}
