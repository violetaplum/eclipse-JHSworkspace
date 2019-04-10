package sawon;
import java.util.*;

class Sawon
{
    public String name;
    public String tel;
    public String toString()
    {
        return "It's a great name ("+name+") and the number is ("+tel+")";
    }
    public Sawon(String name, String tel)
    {
        this.name = name;
        this.tel = tel;
    }
}

public class SawonMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            System.out.print("Insert name >> ");
            String name = sc.nextLine();
            System.out.print("Insert tel >> ");
            String tel = sc.nextLine();
            Sawon sw = new Sawon(name, tel);
            System.out.println(sw.toString());
        }
        sc.close();
    }
}
