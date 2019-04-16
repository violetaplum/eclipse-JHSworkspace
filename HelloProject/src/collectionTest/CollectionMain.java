package collectionTest;
import java.util.*;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v7 = new Vector(3);


		v7.add(new Integer(100));
		v7.add(new Integer(20));
		v7.add(new Integer(300));
		v7.add(new Integer(700));	//Collection.add(new WrapperClassValue);

		Object[] ob1 = v7.toArray();
		Arrays.sort(ob1);

		for(int i=0;i<ob1.length;i++)	//Collection.size() : Collection 에서 길이 반환
		{
			System.out.println(ob1[i]+"\t");	//Collection.get() : Collection에서 값 반환
		}

		System.out.println();


	}

}
