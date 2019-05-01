package scoreHashMapTest;
import java.util.*;


class Score
{
    private String name;
    private Integer korean;
    private Integer english;
    private Integer math;
    public Score(){}
    public Score(String name,Integer korean,Integer english,Integer math)
    {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
    public String getName()
    {
        return this.name;
    }
    public Integer getKorean()
    {
        return this.korean;
    }
    public Integer getEnglish()
    {
        return this.english;
    }
    public Integer getMath()
    {
        return this.math;
    }
    public String toString()
    {
        return "Name : "+this.name+" Korean : "+this.korean+" English : "+this.english+" Math : "+this.math+"\n";
    }

}

public class ScoreMain extends Score
{
    public static void main(String[] args)
    {
        Map<Integer,Score> hm = new HashMap<>();

        hm.put(1,new Score("1",1,1,1));
        hm.put(2,new Score("2",2,2,2));
        hm.put(3,new Score("3",3,3,3));
        hm.put(4,new Score("4",4,4,4));

        System.out.println(hm.values().toString());
        Set<Integer> ck2 = hm.keySet();

        for(Integer key:ck2)
        {
            System.out.println(hm.get(key).toString());
        }
        Iterator itr2 = ck2.iterator();
        while(itr2.hasNext())
        {
            System.out.println(hm.get(itr2.next()));
        }
        Set<Map.Entry<Integer,Score>> ent2 = hm.entrySet();
        for(Map.Entry<Integer,Score> k:ent2)
        {
            System.out.println(k.getValue());
            System.out.println(k.getKey());
        }

        System.out.println(hm.values().toString());


        Set<Integer> ck = hm.keySet();
        for(Integer key:ck)
        {
            System.out.println(hm.get(key).toString());
        }

        Iterator itr = ck.iterator();
        while(itr.hasNext())
        {
            System.out.println(hm.get(itr.next()));
        }

        Set<Map.Entry<Integer,Score>> ent = hm.entrySet();
        for(Map.Entry<Integer,Score> k:ent)
        {
            System.out.println(k.getValue());
            System.out.println(k.getKey());
        }

    }
}
