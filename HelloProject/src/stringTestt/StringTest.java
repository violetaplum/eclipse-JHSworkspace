package stringTestt;

public class StringTest {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String aa = "ondal";
			String bb = "ondal";
			//String.equals(compair string) test
			if(aa.equals(bb))
			{
				System.out.println("==같네");
			}
			//이같은 경우 '=='을 써도 답이 출력된다. 

			String cc = new String("ondal");
			String dd = new String("ondal");
			//하지만 new 형식을 사용하게 되면 객체 위치를 따로따로 잡게 된다.
			
			if(cc==dd)
			{
				System.out.println("cc==dd the same!");
			}
			if(cc.equals(dd))
			{
				System.out.println("cc.equals(dd) the same!!");
			}
			
		}
		//String 은 heap메모리에 잡힌다.
		//따라서 위치는 stack메모리에 존재한다.
		//만약 aa==bb라고 쓴다면 저 stack메모리의 위치를 비교하게 된다.
		//즉 String.equals()를 사용하여 비교해야 값비교가 가능하다.
		//'=='는 캡슐화 되지 않은 값을 비교하는 연산자다. 
		
		
		//C#에서는 '=='모두 내용비교로 사용 하게 된다.
		
		
		

}
