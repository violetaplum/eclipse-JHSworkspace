package duhe;

public class Duhe {
    public static void main(String[] args) //메소드 2형식 정의문과 비슷함
                                            //System 쪽에서 main호출문이 수행된다
                                            //static을 선언하면 객체를 만들지 않아도 된다
                                            //이 때문에 main객체 선언문이 필요가 없다
    {
        //명령행 인자를 사용하여 구현 30 + 80
        //String으로 들어온 30과 80을 parsing한다
        if(args.length!=2)
        {
            System.out.println("You've got Error~!!");
            System.out.println("In dos mode : commend number number");
            System.out.println("In IntelliJ : number number");
            return; //강제로 종료하기
            //C : exit(1)
            //C# : Environment.Exit(1)          ---> 강제종료 방식
            //Java : System.exit(0)

        }
        System.out.print(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));



    }
}
