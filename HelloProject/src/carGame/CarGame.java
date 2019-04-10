package carGame;
import java.util.Scanner;

class Parent
{
    public void car()
    {
        System.out.println("Let's go drive with parents car!!");
    }

}

class Child extends Parent
{
    public void car()
    {
        System.out.println("Let's go drive with your car in 4days!"); //오버라이딩!
    }
}


public class CarGame {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Whitch car would you ride? >> (parent:1,child:2)");
        int sel = sc.nextInt();
        Parent p77 = null;
        switch(sel)
        {
            case 1:
                p77 = new Parent(); //버전1 일 경우
                p77.car();
                break;

                case 2:
                    p77 = new Child(); //버전2일 경우 Cast해버리면 됨
                    p77.car();
                    break;

                    default:
                        System.out.println(" Insert 1 or 2 ");
                        break;
        }


    }
}
