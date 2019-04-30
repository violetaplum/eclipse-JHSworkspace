package productMain;

class Product
{
	String product;
	String made;
	int price;
	public Product(String str)
	{
		String[] arr = str.split(",");
		setProduct(arr[0]);
		setMade(arr[1]);
		setPrice(Integer.valueOf(arr[2]));
	}
	public void setProduct(String product)
	{
		this.product = product;
	}
	public void setMade(String made)
	{
		this.made=made;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public String getProduct()
	{
		return this.product;
	}
	public String getMade()
	{
		return this.made;
	}
	public int getPrice()
	{
		return this.price;
	}
	public String toString()
	{
		return "Product name : "+this.product+" Made by : "+this.made+" Price is : "+String.valueOf(this.price);
	}
	public void Sp(String str)
	{
		String[] arr = str.split(",");
	}
}

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Camera,Samsung,1200000";
		Product p = new Product(str);
		System.out.println(p.toString());
	}

}
