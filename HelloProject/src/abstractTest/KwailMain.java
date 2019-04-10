package abstractTest;


abstract class Kwail //하단의 mukja()에 의해 class도 추상으로 바꿔줌
                        //추상클래스 내부에 추상메소드가 아닌 메소드도 있어도 됨
                        //추상클래스에서 속성을 제외하고 모든 함수를 추상으로 정의하면 interface와 동일하다고 할 수 있음
                        //같은 상속이어도 나중에 클래스마다 구현이 달라진다면 abstract로 선언해야 함
{
    public int number = 0;  //interface와는 다르게 속성을 가질 수 있다
    public void good()
    {
        System.out.println("It's good to your health! ");
    }
    public abstract void mukja(); //추상메소드의 선언
                                    //이렇게 추상메소드가 선언되면 Kwail도 추상class로 된다
}

class Apple extends Kwail
{
    public void mukja()
    {
               System.out.println( "Let's eat Apple!");
    }
}

class Pear extends Kwail
{
    public void mukja()
    {
        System.out.println("Let's eat Pear!!");
    }
}

class Persimmon extends Kwail
{
    public void mukja()
    {
        System.out.println("Let's eat Persimmon!!");
    }
}



public class KwailMain {
    public static void main(String[] args)
    {
        Kwail apple = new Apple();
        Kwail pear = new Pear();
        Kwail persimmon = new Persimmon();
        apple.mukja();
        pear.mukja();
        persimmon.mukja();
        System.out.println(apple.number);

    }
}
