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
		return "(��ǰ��) "+this.product+" (��ǰ����) "+this.price+" �̸� "+" (�԰��� �����) "+this.in+" �� �� "+this.out+"�� �Դϴ�.";
	}
}

public class MarketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Market> mr = new ArrayList<>();
			 
			mr.add(new Market("����",1200,100,300));
			mr.add(new Market("���û�",900,700,150));
			mr.add(new Market("���ڻ�",1700,200,50));
			mr.add(new Market("����",2000,400,150));
			mr.add(new Market("�ֽ�",1300,100,250));
			
			
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
			System.out.print("������ �Է��Ͻÿ� >> ");
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
