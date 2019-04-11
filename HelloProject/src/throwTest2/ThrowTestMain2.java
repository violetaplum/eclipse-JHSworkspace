package throwTest2;
import java.util.Scanner;

public class ThrowTestMain2
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Variable : ");
        String one1 = sc.nextLine();
        int soo1 = Integer.parseInt(one1);

        System.out.print("Second Variable : ");
        String tow1 = sc.nextLine();
        int soo2 = Integer.parseInt(tow1);
        int bada = kaja(soo1,soo2);
        System.out.println(bada);

    }

    private static int kaja(int soo1, int soo2)
    {
        if(soo2==0)
        {
            System.out.println("You can't devied with Zero");
                throw new ArithmeticException(); //throw 임에 주의
                    //Throw : 콕 찝어서 에러처리를 해주는 것
                    //저쪽에서 에러가 나면 던져버리는것
                    //개발자가 아니까 콕집어서 에러처리
        }
        else {
            return soo1 / soo2;
        }
    }
}
