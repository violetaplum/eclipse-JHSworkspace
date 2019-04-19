package telinfoDAO;
import telinfoDBConn.TelInfoDBConn;
import telinfoVO.TelInfoVO;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;


public class TelInfoDAO
{
        private Connection con; //java.sql.Connection
        PreparedStatement pstmt = null;
        ResultSet rs = null;    //�쟾�뿭
    //PreaparedStatement ps1 = null; 濡� 癒쇱� �꽑�뼵�빐�넃怨�
    //諛묒뿉�꽌 ps1 = new con.prepareStatement(String)

    //Connection.prepareStatement(String);
    //Connection.createStatement();
        //----------------------------------------------------------
        public TelInfoDAO() throws ClassNotFoundException,SQLException
        {
            con = new TelInfoDBConn().getConnection();  //�꽑�뼵�� �긽�떒�뿉�꽌 �븯怨�
            //媛앹껜 �깮�꽦�� TelInfoDAO�쓽 �깮�꽦�옄 �븞�뿉�꽌 �븳�떎.
            //�젒�냽媛앹껜 get --> con
        }
        //----------------------------------------------------------
        public void pstmtClose() throws SQLException
        {
            if(pstmt != null)
            {
                pstmt.close();  //諛뺤뒪 �떕湲� 硫붿냼�뱶
            }
        }
        public void getAllInfoClose() throws SQLException
        {
            if(rs!=null)            //�뿰寃곕뱾 �걡湲� 硫붿냼�뱶
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

        //�쟾泥댁텧�젰�쓣 �쐞�빐 硫붿냼�뱶 �젙�쓽臾� �옉�꽦
        public ArrayList<TelInfoVO> getAllInfo() throws SQLException
        {
            ArrayList<TelInfoVO> tiarray = new ArrayList<>();
            String sql = "select* from TelTable5 order by id";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();//寃��깋 紐낅졊�뼱
            //寃곌뎅 醫낆씠諛뺤뒪 �븞�뿉 �꽔湲�

            while(rs.next())
            {
                //醫낆씠諛뺤뒪�뿉�꽌 爰쇰궡湲�
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String tel = rs.getString("tel");
                Date d = rs.getDate("d");
                //table --> 蹂��닔�뿉 �꽔湲�

                TelInfoVO tv = new TelInfoVO(id,name,tel,d);
                //VO 媛앹껜�뿉 �꽔湲�
                tiarray.add(tv); //VO 媛앹껜 瑜� ArrayList<TelInfoVO> �뿉 �꽔湲�

            }
            return tiarray;
        }
}
