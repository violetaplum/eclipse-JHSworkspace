package enumerationTest;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationMain {
    public static void main(String[] args)
    {
        Vector v1 = new Vector(0,1);
        v1.add(new Integer(100));
        v1.add(new Double(110.5));
        v1.add(new String("Have a nice Day!"));
        for(int i=0;i<v1.size();i++)
        {
            System.out.println(v1.get(i)+"\t");
        }
        //addElement()  add()
        //elementAt()   get()
        //DB select문의 내부처리와 유사
        //앞으로 배울 JDBC의 처리와 유사함

        Enumeration e1 = v1.elements(); //Enumeration : 일반 종이박스에 비유할 수 있음
        while(e1.hasMoreElements())
        {
            System.out.println(e1.hasMoreElements());//next element가 있는가?

        }
    }
}
