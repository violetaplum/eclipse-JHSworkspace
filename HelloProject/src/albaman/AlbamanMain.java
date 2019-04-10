package albaman;

interface Quickman
{
    default void palli()
    {
        System.out.println("Fast badal  Quickman interface");
    }

}

class Albaman
{
    public void jalhanda()
    {
        System.out.println("Works well. Albaman");
    }
}

class Na extends Albaman implements Quickman
{
    void doolda()
    {
        System.out.println("Both good job!!  Na");
    }
}

public class AlbamanMain {
    public static void main(String[] args)
    {
        Na na1 = new Na();
        na1.doolda();
        na1.jalhanda();
        na1.palli();
    }
}


