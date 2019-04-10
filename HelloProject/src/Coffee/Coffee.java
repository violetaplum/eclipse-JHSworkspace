package Coffee;
import java.util.*;

class CoffeeBeans
{
    String species = "Coffe";
    void print()
    {
        System.out.println(species);
    }
    void setSpecies(String s)
    {
        species = s;
    }
}
class Arabica extends CoffeeBeans
{

}

class Robusta extends CoffeeBeans
{
    String species = "Robusta";
}


public class Coffee {
    public static void main(String[] args)
    {
        CoffeeBeans c = new CoffeeBeans();
        Arabica a = new Arabica();
        Robusta r = new Robusta();

        System.out.println("c's Class is : "+ c.getClass());



    }

}
