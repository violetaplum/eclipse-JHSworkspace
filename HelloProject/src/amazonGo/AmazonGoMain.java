package amazonGo;


class Mart
{
    private String customer;//고객명
    private String moolpoom;//물품이름
    private int price;//물품가격
    private int tot;//총구매금액
    public Mart(){}
    public Mart(String customer, String moolpoom, int price, int tot)
    {
        this.customer = customer;
        this.moolpoom = moolpoom;
        this.price = price;
        this.tot = tot;

    }
    public Mart(String customer)
    {
        setCustomer(customer);
    }
    //-----------------------------------------------------------------------
    public void setCustomer(String customer)
    {
        this.customer = customer;
    }
    public void setMoolpoom(String moolpoom)
    {
        this.moolpoom = moolpoom;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public void setTot(int tot)
    {
        this.tot = tot;
    }
    public String getCustomer()
    {
        return this.customer;
    }
    public String getMoolpoom()
    {
        return this.moolpoom;
    }
    public int getPrice()
    {
        return this.price;
    }
    public int getTot()
    {
        return this.tot;
    }
    public void buy(String moolpoom, int buy)
    {

        setTot(getTot()+buy);
        System.out.println(getCustomer()+"님이 "+moolpoom+"를 "+buy+"에 구입");
    }
    public void cancel(String moolpoom,int cancel)
    {

        setTot(getTot()-cancel);
        System.out.println(getCustomer()+"님이 "+moolpoom+" "+cancel+"을 취소함");
    }
    @Override
    public String toString()
    {
        return customer+"님의 총구입금액 "+tot+"원 입니다.";
    }
    /*public void run()
    {
        while (true)
        {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            setCustomer(sc.nextLine());
            System.out.println("1 : buy , 2 : cancel ");
            if(str.equals("out"))
            {
                break;

            }
            else if(str.equals("1"))
            {

                System.out.println("구매하실 물품,가격 : ");
                buy(sc.nextLine(),sc.nextInt());
                setMoolpoom(sc.nextLine());
                System.out.println("구매물품가격 : ");
                setPrice(sc.nextInt());
                buy(getMoolpoom(), getPrice());
                System.out.println(getTot());
            }
            else if(str.equals("2"))
            {
                System.out.println("취소하실 물품 : ");
                setMoolpoom(sc.nextLine());
                System.out.println("취소물품 가격 : ");
                setPrice(sc.nextInt());
                cancel(getMoolpoom(),getPrice());
                System.out.println(getTot());
            }

            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.getStackTrace();
            }
        }

        System.out.println("1st 고객Gate통과");

    }*/

}
class Mart1 extends Thread
{

    public void run()
    {
        System.out.println("1st 통과");
        Mart mart1 = new Mart("박비와이");
        mart1.buy("카메라",500000);
        mart1.buy("청바지",32000);
        mart1.buy("과자",1500);
        mart1.cancel("카메라",500000);
        System.out.println(mart1);
        System.out.println("1st 고객 Gate 나가면서 결제 완료");
    }

}
class Mart2 extends Thread
{
    public void run()
    {
        System.out.println("2nd 통과");
        Mart mart2 = new Mart("이소향");
        mart2.buy("청바지",32000);
        mart2.buy("과자",1500);
        mart2.buy("카메라",500000);
        mart2.cancel("카메라",500000);
        System.out.println(mart2);
        System.out.println("2nd 고객 Gate 나가면서 결제 완료");
    }
}

//구입메소드, 취소메소드 때에따라 생성자 필요


public class AmazonGoMain {
    public static void main(String[] args)
    {
        System.out.println("우리도 아마존고~~~");
        /*ArrayList<Mart> mart = new ArrayList<>();*/
        Mart1 m1 = new Mart1();
        Mart2 m2 = new Mart2();

        m1.start();
        m2.start();


    }
}
