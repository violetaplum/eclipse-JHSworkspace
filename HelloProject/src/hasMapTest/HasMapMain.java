package hasMapTest;
import java.util.*;

public class HasMapMain {
    public static void main(String[] args)
    {
        //Map map1 = new HashMap();
        HashMap hmap1 = new HashMap();
        //key,value 사용, 빠른 검색
        //System.out.println(map.size());
        hmap1.put("id","111");
        hmap1.put("irum","choi");
        hmap1.put("ipsail",new Date());
        hmap1.remove("ipsail");

        System.out.println(hmap1.get("ipsail"));


        //숫자는 stack메모리에, 문자는 heap메모리에 들어가기 때문에 pc가 다운될 수 있다.
        //






        Map<Integer,String> callCodes = new HashMap<Integer,String>();
        //HashMap<key,value>();
        callCodes.put(81,"Japan");
        callCodes.put(1,"USA");
        callCodes.put(82,"Korea");
        for(Map.Entry<Integer,String> entry : callCodes.entrySet())
        {
            Integer code = entry.getKey();
            if(code.toString().charAt(0)=='8')
            {
                String country = entry.getValue();
                System.out.printf("%s:%s\n",code,country);
            }
        }

    }
}
