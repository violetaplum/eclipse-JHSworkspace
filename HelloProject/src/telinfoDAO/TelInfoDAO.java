package telinfoDAO;
import telinfoDBConn.TelInfoDBConn;
import telinfoVO.TelInfoVO;
import java.sql.*;
import java.util.*;
import java.util.Date;



public class TelInfoDAO
{
        private Connection con; //java.sql.Connection
        PreparedStatement pstmt = null;
        ResultSet rs = null;    //전역
    //PreaparedStatement ps1 = null; 로 먼저 선언해놓고
    //밑에서 ps1 = new con.prepareStatement(String)

    //Connection.prepareStatement(String);
    //Connection.createStatement();
        //----------------------------------------------------------
        public TelInfoDAO() throws ClassNotFoundException,SQLException
        {
            con = new TelInfoDBConn().getConnection();

            //선언은 상단에서 하고
            //객체 생성은 TelInfoDAO의 생성자 안에서 한다.
            //접속객체 get --> con
        }
        //----------------------------------------------------------
        public void pstmtClose() throws SQLException
        {
            if(pstmt != null)
            {
                pstmt.close();  //박스 닫기 메소드
            }
        }
        public void getAllInfoClose() throws SQLException
        {
            if(rs!=null)            //연결들 끊기 메소드
            {
                rs.close();
            }
            if(pstmt!=null)
            {
                pstmt.close();
            }
            if(con!=null)
            {
                con.close();
            }
        }

        //전체출력을 위해 메소드 정의문 작성
        public ArrayList<TelInfoVO> getAllInfo() throws SQLException
        {
            ArrayList<TelInfoVO> tiarray = new ArrayList<>();
            String sql = "select* from TelTable5 order by id";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();//검색 명령어
            //결국 종이박스 안에 넣기

            while(rs.next())
            {
                //종이박스에서 꺼내기
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String tel = rs.getString("tel");
                Date d = rs.getDate("d");
                //table --> 변수에 넣기

                TelInfoVO tv = new TelInfoVO(id,name,tel,d);
                //VO 객체에 넣기
                tiarray.add(tv); //VO 객체 를 ArrayList<TelInfoVO> 에 넣기

            }
            return tiarray;
        }

    public boolean update_nametel(String name,String tel)
    {
        String sql = "update TelTable5 set tel=? where name=?";
        try{
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,tel);
            pstmt.setString(2,name);
            pstmt.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println("update Exception");
            return false;
        }
        return true;
    }
    public boolean delete_nametel(int id)
    {
        String sql = "delete from TelTable5 where id=?";
        try{
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,id);
            pstmt.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println("delete Exception");
            return false;
        }
        return true;
    }
    public boolean insert_person(int id,String name, String tel, String d)
    {
        String sql = "insert into TelTable5 values (?,?,?,?)";
        try{
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,id);
            pstmt.setString(2,name);
            pstmt.setString(3,tel);
            //pstmt.setDate(4,java.sql.Date.valueOf(d));
            //main에서 전달되는 인자의 형식은 "20161206"임

            int year = Integer.parseInt(d.substring(0,4))-1900;
            int month = Integer.parseInt(d.substring(4,6))-1;
            int day = Integer.parseInt(d.substring(6,8));
            Date dd = new Date(year,month,day);

            pstmt.setDate(4,java.sql.Date.valueOf(dd.toString()));
            //java.util.Date는 Java의 Date 데이터 유형임
            //java.sql.Date는 SQL날짜에 대한 JDBC Wrapper Class이다!!!!!!



            //PreparedStatement에는 sql.Date -> setDate(), sql.Timestamp -> setTime() 에 대한 설정자를 가진다.
            //java.sql.Date 는 sql date에 해당된다.
            //분,초,밀리초는 무시됨. 또한 시간대와 관련이 없다.
            //java.sql.Time은 sql time에 해당하며 시간, 분, 초 및 밀리초 정보만 포함함
            //java.sql.Timestamp는 사용자 정의할 수 있는 정밀도. 나노초에대한 정확한 날짜인 SQL TIMESTAMP에 해당
            //util.Date는 밀리초만 지원함

            //sql.Date는 시간대에 따라 다르며, sql.Time에는 현재 년,월,일 등이 포함된다.

            //PreparedStatement에는 sql.Date -> setDate(), sql.Timestamp -> setTime() 에 대한 설정자를 가진다.


            pstmt.executeUpdate();



        }
        catch(Exception e)
        {
            System.out.println("insert Exception");
            return false;
        }
        return true;
    }
}
