package ondalTest;
import java.util.*;

public class OndalTestMain2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = "ondal";
        String pw = "1234";
        System.out.println("You've got 3 Opportunity!");
        for(int i=3;i>0;i--)
        {
            System.out.print("Insert ID : >>");
            String in = sc.nextLine();

            if(name.equals(in)) //name.compaireTo(in)==0 을 넣어도 가능하다.
            {
                System.out.print("Insert PW : >>");
                String ip = sc.nextLine();
                if(pw.equals(ip))
                {
                    System.out.println("Welcome!!!!!");
                    break;
                }
                else
                {
                    if((i-1)==0)
                    {
                        break;
                    }
                    System.out.print("Try again...");
                    System.out.println("You've got "+(i-1)+" time left..");
                    continue;
                }
            }
            else
            {
                if((i-1)==0)
                {
                    break;
                }
                System.out.print("Try again...");
                System.out.println("You've got "+(i-1)+" time left..");
                continue;
            }
        }

            sc.close();


    }
}
