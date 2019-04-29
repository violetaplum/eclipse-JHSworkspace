package marketReview;

import java.util.ArrayList;
import java.util.Scanner;

class Market
{
	private String product;
	private int price;
	private int in=0;
	private int out=0;
	
	public Market(String product,int price,int in,int out)
	{
		this.product = product;
		this.price = price;
		this.in = in;
		this.out = out;
	}
	
	public void setProduct(String product)
	{
		this.product=product;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setIn(int in)
	{
		this.in=in;
	}
	public void setOut(int out)
	{
		this.out=out;
	}
	
	public String getProduct()
	{
		return this.product;
	}
	public int getPrice()
	{
		return this.price;
	}
	public int getIn()
	{
		return this.in;
	}
	public int getOut()
	{
		return this.out;
	}
	
	@Override
	public String toString()
	{
		return "(상품명) "+this.product+" (상품가격) "+this.price+" 이며 "+" (입고량과 출고량은) "+this.in+" 개 및 "+this.out+"개 입니다.";
	}
}

public class MarketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Market> mr = new ArrayList<>();
			 
			mr.add(new Market("우유",1200,100,300));
			mr.add(new Market("마늘빵",900,700,150));
			mr.add(new Market("피자빵",1700,200,50));
			mr.add(new Market("우유",2000,400,150));
			mr.add(new Market("주스",1300,100,250));
			
			
			for(int i=0;i<mr.size();i++)
			{
				System.out.println(mr.get(i).toString());
			}
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			for(int i=0;i<mr.size();i++)
			{
				if((mr.get(i).getIn()-mr.get(i).getOut())>mr.get(i).getOut())
				{
					System.out.println(mr.get(i).toString());
					
				}
			}
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			System.out.print("가격을 입력하시오 >> ");
			int search = sc.nextInt();
			System.out.println();
			for(int i=0;i<mr.size();i++)
			{
				if(mr.get(i).getPrice()>=search)
				{
					System.out.println(mr.get(i).toString());
				}
			}
	}

}
