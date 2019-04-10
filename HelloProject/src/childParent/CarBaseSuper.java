package childParent;

//### 상속에서의 생성자.


class Parent7
{
    int don;
    public Parent7(int don)
    {
        this.don = don;
    }
    public Parent7()
    {
        System.out.println("I don't have any money!!");
    }
}

class Child7 extends Parent7 {


    public Child7()  //생성자.
    {
        System.out.println("I'm every where! "); //객체를 부를때 마다 가동된다.
    }
    public Child7(int don)
    {
        super(don); //상위 클래스의 생성자를 부른다.
        System.out.println("I have a lot of Fortune.. : "+don+" $s");
        System.out.println("I have a lot of Fortune.. : "+super.don+" $s");
    }

}

public class CarBaseSuper
{
    public static void main(String[] args)
    {
        Child7 c7 = new Child7(30); //여기서 new하게되면 Parent7으로 먼저 가고 Child7을 방문한다.
                                    //생성자를 찾아갈때 부모쪽을 먼저 찾아가고 그다음 자식생성자 처리됨.

    }
}