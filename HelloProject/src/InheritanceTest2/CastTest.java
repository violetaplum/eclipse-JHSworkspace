package InheritanceTest2;



//Parent p3 = new Child();  (o)  Parent p1 = c1;
//Child c3 = new Parent();  (x)  Child c1 = p1;

//Casting할때 부모가 앞에 있으면 no error!!!

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


public class CastTest {
    public static void main(String[] args)
    {
        Parent p1 = new Parent();
        p1.car();

        Child c2 = new Child();
        c2.car();

        //--------------------Parent-Child Conversion------------------------------

        Parent p3 = c2; //new Child();  ---> 객체형변환 + Overriding
        p3.car(); //객체의 형변환에 의해 Child의 car()가 실행된다. 객체형변환덕에 각각의 car()사용가능
            //업무상 버전이 올라갈때 이런 과정이 필요할 수 있다.



        Child c3 = (Child)p3; //앞에서 new Child(); 였기 때문에 또한 Child의 car() 실행됨
        c3.car();

        /*Child c7 = (Child)p1;*/ //p1이 원래 Parent class이어서 실행 불가하다.
                              //빨간줄이 나지 않는 이유는 compile은 no error였기때문
                              //Object.getClass() : 객체의 클래스를 반환함


    }
}
