package charToString;

public class CharToString {
	public static String s;
	
	
	
	private static char[] test1(String str)
	{
		return str.toCharArray();
	}
	private static String test2(char[] ch)
	{
		return ch.toString();
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		s = "kongjoo";
		
		 //String.toCharArray() -> String을 char형 배열로!
		char[] ch1 = test1(s);
		String ch2 = test2(ch1);
		
		for(int i=0;i<ch2.length();i++)
		{
			System.out.print(ch2.charAt(i));
			
		}
		
		
		//new String(char Array) -> char 배열을 다시 String으로!
		//char[].toString()을 사용해도 된다.
		
	}

}
