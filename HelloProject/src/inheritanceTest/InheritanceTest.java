package inheritanceTest;

class Boomo //상속은 메소드, 필드 상관없이 이루어진다.
{
    protected String juso;  //protected : 상속간의 관계에서만 사용가능
    public void don()
    {
        System.out.println("I have some fortune~~");
    }

}

class Janyu extends Boomo//Janyu(class) 'is kind of' Boomo(class)
{   //보이지 않지만 부모의 juso, don()을 상속받음

    protected int na2; //default필드이기 때문에 막 쓸 수 있다. --> 같은 package내에서 접근가능.

    public Janyu()
    {

    }

    public Janyu(String juso, int na2)
    {
        this.juso = juso; //이또한 Boomo에게 상속 받았기 때문에 this로 사용 가능
        this.na2 = na2;
    }

    public void car()
    {
        System.out.println("I have Sedan~~");

    }
    public void into()
    {
        System.out.println("I'm "+this.na2+"years old and I live in "+this.juso);
    }
}

//---------------------------------------------------------------

public class InheritanceTest {
    public static void main(String[] args)
    {
        Janyu j1 = new Janyu();
        Boomo inhe1 = new Boomo();
        inhe1.don();
        j1.don();
        j1.car();
        Janyu j2 = new Janyu("Jongro",30);
        j2.into();

        Boomo b1 = new Janyu(); //객체의 형변환!!!!!!!!!1

    }
}
