package subString1;

public class SubString2 {
    public static void main(String[] args)
    {
        /*String s1 = "LOVE";
        System.out.println(s1.substring(1,2)); //첫번째 인자는 0부터 시작, 두번째 인자는 1부터시작
        */
        String str = "      I LOVE YOU!!";
        System.out.println(str.length());
        String ns = str.substring(1,18)+str.substring(0,1);

        for(int i=0;i<30;i++)
        {
            ns = ns.substring(1,18)+ns.substring(0,1);
            /*System.out.println(str.substring(1,18));
            System.out.println(str.substring(0,1));*/
            System.out.println(ns);
        }
    }
}
