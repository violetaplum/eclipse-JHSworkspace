package inheritanceTest;

class Animal
{
    protected int eye;
    public void breath()
    {
        System.out.println("I can Breath~~");
    }
}

class Fish extends Animal
{
    protected String kkori;

    public Fish()
    {

    }
    public Fish(int eye, String kkori)
    {
        this.eye = eye;
        this.kkori = kkori;
    }

    public void swim()
    {
        System.out.println("I can also Swim~~~");
    }

    public void info()
    {
        System.out.println("I have "+this.eye+"eye's and "+this.kkori+" colored tail!!");
    }
}

class Bird extends Animal
{
    protected int feather;
    public void fly()
    {
        System.out.println("I believe I can Fly~~");
    }
}



public class World {
public static void main(String[] args)//main이 없으면 jvm을 이용한 실행이 불가함.
{

    Animal animal = new Animal();
    Fish fish = new Fish();
    Bird bird = new Bird();
    Fish f2 = new Fish(2,"red");


    fish.breath();
    bird.fly();

    f2.info();
}

}
