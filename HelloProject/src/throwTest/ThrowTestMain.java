package throwTest;
import java.util.*;

public class ThrowTestMain {
    public static void main(String[] args)
    {
        try
        {    //예외처리 : 개발자 입장에서 예외를 핸들링 하고 싶을때 사용
            //try{} : 예외처리 가능성이 있는 block
            //catch{} : error발생시 처리
            //finally{} : error상관없이 무조건 처리
            //              db접속 끊기같은 경우 finally 로 처리함
            Scanner sc = new Scanner(System.in);

            System.out.print("First Variable : ");
            String one1 = sc.nextLine();
            int soo1 = Integer.parseInt(one1);

            System.out.print("Second Variable : ");
            String tow1 = sc.nextLine();
            int soo2 = Integer.parseInt(tow1);
            int bada = kaja(soo1,soo2);
            System.out.println(soo1/soo2);
            System.out.println("gooooooooooooooooooooooooooooooood");

            //고객이 혹시 0으로 나누거나 하는 오류를 범할 수 있기 때문에 에러처리를 함...
        }
        catch (Exception e) //Exception : 예외처리 조상. 모든 경우를 커버한다.
        {
            System.out.println("Error Controller");

        }
        finally
        {
            System.out.println("goooooooooooooooooooooooooooooood");
            System.out.println("Lets go HOME!!!!");
        }
    }

    private static int kaja(int soo1, int soo2)
            throws ArithmeticException //'throws'임에 주의
        {   //throws : 에러 발생시 여기서 처리 안하고 호출당한 곳으로 다시 던져버림
            //여기서 처리 안하고 그냥 호출시점으로 보내버림
            //file에 해당
            return soo1/soo2; //넘어올때는 문제가 없지만 나눗셈 할때 에러가 발생
        }


}
