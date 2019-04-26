package telinfoVO;
import java.util.Date;

public class TelInfoVO {
    private int id;//number(5)
    private String name;//varchar2(20)
    private String tel;//varchar2(20)
    private Date d;//date
    //-------------------------------------------------------------------
    public TelInfoVO(){}    //기본 생성자

    public TelInfoVO(int id, String name, String tel, Date d)
    {   //각 field 초기화 생성자
        //super(,,,)
        //생성자 오버로딩
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.d = d;
    }
    //-------------------------------------------------------------------
    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setTel(String tel)
    {
        this.tel= tel;
    }
    public void setDate(Date d)
    {
        this.d = d;
    }

    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getTel()
    {
        return tel;
    }
    public Date getD()
    {
        return d;
    }
}
