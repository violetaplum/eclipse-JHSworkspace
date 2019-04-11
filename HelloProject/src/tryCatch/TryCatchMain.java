package tryCatch;
import java.util.*;

public class TryCatchMain {
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
            System.out.println(soo1/soo2);
            System.out.println("gooooooooooooooooooooooooooooooood");

            //고객이 혹시 0으로 나누거나 하는 오류를 범할 수 있기 때문에 에러처리를 함...
        }
        catch(NumberFormatException e) //밑으로 내려와 있더라도 해당되면 실행된다
        {
            System.out.println("Be sure you're inserting Two Numbers..");
        }
        catch(ArrayIndexOutOfBoundsException e) //이또한 Exception의 자식
                                                //하위의 클래스들은 다 똑같은 항렬을 가짐
        //명령행 인자로 값 하나만 넣을때 사용할 수 있겠다
                //ArrayIndexOutOfBoundsException : 입력값 갯수 확인 예외처리
        {
            System.out.println("Please Insert Two Numbers..");
        }
        catch(ArithmeticException e)  //ArithmeticException : 산술예외. Exception의 자손중 하나
        {
            System.out.println("Devide with not Zero");
        }
        //Error가 발생하면 System이 catch에게 던져준다.
        //catch가 2개일 경우 이 Error를 먼저 선언된 것이 먼저 받는다.
        //따라서 먼저의 ArithmeticException 만 수행되고 밑의 Exception 은 수행되지 않음
        catch (Exception e) //Exception : 예외처리 조상. 모든 경우를 커버한다.
        {
            System.out.println("Do not Devide with ZERO");
            System.out.println(e); //.toString()
            System.out.println(e.getMessage()); //Error메세지를 받아서 출력해줌
        }
        finally
        {
            System.out.println("goooooooooooooooooooooooooooooood");
            System.out.println("Lets go HOME!!!!");
        }
    }
}
