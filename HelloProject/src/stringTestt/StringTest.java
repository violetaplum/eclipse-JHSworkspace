package stringTestt;

public class StringTest {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String aa = "ondal";
			String bb = "ondal";
			//String.equals(compair string) test
			if(aa.equals(bb))
			{
				System.out.println("==����");
			}
			//�̰��� ��� '=='�� �ᵵ ���� ��µȴ�. 

			String cc = new String("ondal");
			String dd = new String("ondal");
			//������ new ������ ����ϰ� �Ǹ� ��ü ��ġ�� ���ε��� ��� �ȴ�.
			
			if(cc==dd)
			{
				System.out.println("cc==dd the same!");
			}
			if(cc.equals(dd))
			{
				System.out.println("cc.equals(dd) the same!!");
			}
			
		}
		//String �� heap�޸𸮿� ������.
		//���� ��ġ�� stack�޸𸮿� �����Ѵ�.
		//���� aa==bb��� ���ٸ� �� stack�޸��� ��ġ�� ���ϰ� �ȴ�.
		//�� String.equals()�� ����Ͽ� ���ؾ� ���񱳰� �����ϴ�.
		//'=='�� ĸ��ȭ ���� ���� ���� ���ϴ� �����ڴ�. 
		
		
		//C#������ '=='��� ����񱳷� ��� �ϰ� �ȴ�.
		
		
		

}
