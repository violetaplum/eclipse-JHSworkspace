package genericTest;
import java.util.*;

public class ArrayListMain {
    public static void main(String[] args)
    {
        ArrayList<String> arr1 = new ArrayList<>(); //Generic Type
        //ArrayList arr1 = new ArrayList(); //collection
        //List arr2 = new ArrayList();\

        arr1.add("Bread");
        arr1.add("Noodle");
        arr1.add("Milk");
        arr1.add("KimBap");


        arr1.set(1,"Cookies");  //.set(index,WrapperClass value);
        arr1.remove(2); //사라지면 그 기억장소도 사라지고 인덱스가 앞으로 당겨짐.
        //array는 방은 남아있다.
        arr1.remove("Bread");   //그냥 값을 찾아 없앨 수도 있다.


        for(int i=0;i<arr1.size();i++)
        {
            System.out.print(arr1.get(i)+"\t");
        }

        for(Object imsi:arr1)   //for( : )  -->  arr1에서 하나 뽑아서imsi에 넣고 imsi를 찍고
                                //더이상 없을때까지 찍어내기
            {
            System.out.println(imsi);
        }
    }

}
