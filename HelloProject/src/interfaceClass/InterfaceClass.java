package interfaceClass;

interface Samchon /*extends Joboomo*///안에 method선언은 가능하지만 구현은 불가하다.
                    //구현은 자녀에서 한다.
                    //하지만 8버전부터는 default는 구현 가능해짐
                    //interface는 항상 맨 상위에 구현해 두어야 함
                    //interface의 필드는 모두 final static 임. 표기는 생략가능.
                    //interface의 extends 인정.
                    //class는 여러 interface를 구현 가능
                    //interface 구현되는 class 의 메소드는 항상 public 이어야 함. 단, 생략가능
{
    /*default void hasBoat()
    {
        System.out.println("I also have a Boat!!!!");
    }*/
    abstract void hasBoat();

}

interface Joboomo
{
    abstract void hasBoseck();
}
//-----------------------------------------------------------------------------------------------------------

class Booja
{
    public void manaDon()
    {
        System.out.println("I earned a lot of Fortune!!!!");
    }
}

class Na extends Booja implements Samchon,Joboomo //interface구현은 다중으로 할 수 있다.
{
    public void useDon()
    {
        System.out.println("Let's use the Fortune!!!!");
    }
    @Override
    public void hasBoat() //interface 에서 default로 선언되지 않은 경우 구현해주어야함
    {
        System.out.println("I also have a Boat!!!!");
    }
    @Override
    public void hasBoseck()
    {
        System.out.println("I have Boseck!!!");
    }


}

class You implements Samchon
{
    @Override
    public void hasBoat()
    {
        System.out.println("I'm in Boat Business");
    }
}

//---------------------------------------------------------------------------------------------------------

public class InterfaceClass {
    public static void main(String[] args)
    {
        Na na = new Na();
        na.manaDon();
        na.hasBoat();
        na.useDon();
        na.hasBoseck();
        You you = new You();
        you.hasBoat();
    }
}
