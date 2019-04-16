package marketTest;
import java.util.*;

class Market
{
	private String sangpum;
	private int price;
	
	public Market() {}
	
	public Market(String sangpum,int price)
	{
		this.sangpum = sangpum;
		this.price = price;
	}
	public String getSangpum()
	{
		return this.sangpum;
	}
	public String getPrice()
	{
		return String.valueOf(this.price);
	}
	@Override
	public String toString()
	{
		return "Name of Product : "+this.sangpum+ " Price of Product : "+String.valueOf(this.price);
		//Integer.toString();
		//String.valueOf(int); 둘다 가능함.
	}
	
}

public class MarketMain extends Market 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Market> market = new ArrayList<>();
		market.add(new Market("one",1));
		market.add(new Market("two",2));
		market.add(new Market("three",3));
		market.add(new Market("four",4));
		
		for(Market imsi:market)
		{
			System.out.println(imsi.toString());
		}
		for(int i=0;i<market.size();i++)
		{
			System.out.println(market.get(i).toString());
		}
		

	}

}
