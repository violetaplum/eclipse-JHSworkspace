package hashMapTest;
import java.util.*;
import ch.aplu.turtle.*;

public class HashmapMain {
    public static void main(String[] args)
    {
        HashMap<Integer,String> hm1 = new HashMap<>();
        //key,value 사용, 빠른검색
        //Generic Type

        System.out.println(hm1.size()); //이때는 잡힌 것이 없으므로 '0'이 출력된다. 어차피 늘었다 줄었다 하니 노상관.

        hm1.put(new Integer(100),"Cool guy");   // Integer, Integer 형태로 들어가야한다.
        hm1.put(new Integer(300),"Princess");
        hm1.put(new Integer(200),"Price");

        System.out.println(hm1.get(100));
        //String s = h1.get(100);
        //System.out.print(s);   --> 원래는 이렇게 된 것을 상단에 줄여 표현함

        hm1.remove(300);

        if(hm1.size()>0)
            System.out.println(hm1.size());



        Collection<String> v1 = hm1.values();   //Collection은 모든 Generic Type을 대표할 수 있기 때문에 변수선언 시 Object처럼 사용 가능.

        System.out.println(v1);

        Set<Integer> s1 = hm1.keySet();
        System.out.println(s1); //밑에서 반복문으로 돌릴 Key Set을 생성하여 s1에 넣어준다.

        for(Integer i : s1)
        {
            System.out.println(i+"\t"+hm1.get(i));  // key set이 i에 들어가 있으므로 .get(i)로 사용 가능해진다.
        }

        Iterator<Integer> itr2 = s1.iterator();
        while(itr2.hasNext())
        {
            Integer j = itr2.next();
            System.out.println(j+"\t"+hm1.get(j));
        }
        //key-value 출력~3

        Set<Map.Entry<Integer, String>> set3 = hm1.entrySet();  //얘는 처음부터 key,value를 같이 가져나온다.

        for(Map.Entry<Integer,String> k:set3)
        {
            System.out.println(k.getKey()+"\t"+k.getValue());
        }





    }
}
