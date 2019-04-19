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
            con = new TelInfoDBConn().getConnection();  //선언은 상단에서 하고
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
}
