package collectionTest;
import java.util.*;
public class CollectionTest2 {
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
        //elementsAt()  get()
    }
}
