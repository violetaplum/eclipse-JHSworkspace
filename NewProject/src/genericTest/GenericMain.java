package genericTest;
import java.util.*;

class Market2
{
    private String sangpum;
    private int price;

    public Market2() {}

    public Market2(String sangpum,int price)
    {
        this.sangpum = sangpum;
        this.price = price;
    }
    public String getSangpum()
    {
        return this.sangpum;
    }
    public int getPrice()
    {
        return this.price;
    }

    public static void compairPrint(ArrayList<Market2> market,int price)
    {
        for(int i=0;i<market.size();i++)
        {
            if(market.get(i).getPrice()>=price)
            {
                System.out.println(market.get(i).toString());
            }
        }
    }
    @Override
    public String toString()
    {
        return "Name of Product : "+this.sangpum+ "  ##  Price of Product : "+String.valueOf(this.price);
        //Integer.toString();
        //String.valueOf(int); 둘다 가능함.
    }

}

public class GenericMain extends Market2 {
    public static void main(String[] args)
    {
        ArrayList<Market2> market = new ArrayList<>();
        market.add(new Market2("one",1));
        market.add(new Market2("two",2));
        market.add(new Market2("three",3));
        market.add(new Market2("four",4));
        market.add(new Market2("five",5));
        market.add(new Market2("six",6));
        market.add(new Market2("seven",7));
        market.add(new Market2("eight",8));
        market.add(new Market2("nine",9));
        market.add(new Market2("ten",10));

        Scanner sc = new Scanner(System.in);
        System.out.print("Compair Price? >> ");
        int price = sc.nextInt();
        Market2.compairPrint(market,price);





    }
}
