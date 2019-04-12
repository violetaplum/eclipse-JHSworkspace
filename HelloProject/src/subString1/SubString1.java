package subString1;

public class SubString1 {
    public static void kajaDisplay(String s1)
    {
        char[] ch1 = s1.toCharArray();

        for(int b=0;b<20;b++)
        {
           char imsi = ch1[0];
           for(int i=0;i<ch1.length-1;i++)
           {
               ch1[i] = ch1[i+1];   //한칸씩 앞으로 당긴다
                                    //ch1.length-1 까지


           }
           ch1[ch1.length-1]=imsi;
           String s2 = new String(ch1);
           System.out.println(s2);
        }
    }
    public static void main(String[] args)
    {
        String s1 = "          I LOVE YOU";//복잡하게 보이지 않게 공간을 줌
        kajaDisplay(s1);        //subString('love',2); --> love라는 글자에서 두글자까지 가져오라는 의미.
                                //subStirng('love',1,2); --> 두번째 인자는 0부터세고 세번째 인자는 1부터센다
                                //따라서 'o'밖에 나오지 않는다.
    }
}
