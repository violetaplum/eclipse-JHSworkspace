package telinfoVO;
import java.util.Date;

public class TelInfoVO {
    private int id;
    private String name;
    private String tel;
    private Date d;
    public TelInfoVO(){}
    public TelInfoVO(int id, String name, String tel, Date d)
    {
        //super(,,,)
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.d = d;
    }
    //-------------------------------------------------------------------
    public int getID()
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
    public Date getDate()
    {
        return d;
    }
}
