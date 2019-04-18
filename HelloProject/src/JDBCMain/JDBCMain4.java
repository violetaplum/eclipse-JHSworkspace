package JDBCMain;
import java.util.*;
import java.sql.*;

public class JDBCMain4 {
    public static void main(String[] args) throws ClassNotFoundException,SQLException
    {
        Scanner sc = new Scanner(System.in);
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
        System.out.println("Connected!!");
        String sql = "update jdbc_tab3 set sawon_jik=? where sawon_id=1";
        //update table_name
        //set
        //where
        PreparedStatement ps = conn.prepareStatement(sql);

        System.out.print("Insert jik to change >> ");
        String jik = sc.next();
        ps.setString(1,jik);  //sawon_id

        int rs = ps.executeUpdate();
        System.out.println("I Updated "+rs+"!!");
        conn.close();
    }

}
