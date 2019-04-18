package JDBCMain;
import java.sql.*;
import java.util.*;

public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        Scanner sc = new Scanner(System.in);

        Connection conn = null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
        System.out.println("Connected!");


        String name=sc.next();
        String sql = "select * from  employees"
                +" where upper(first_name) = '"+name+"'";


        //Statement st = conn.createStatement();
        ResultSet rs = conn.createStatement().executeQuery(sql);
        while(rs.next())
        {
            String fname = rs.getString("first_name");
            String lname = rs.getString("last_name");
            System.out.println(rs.getRow()+"\t"+fname+"\t"+lname);
        }



        String sql2 = "select * from  employees"
                +" where upper(first_name) = ?";    //여기서 ? 에 ''를 붙이면 안되는것 주의한다!!

        PreparedStatement ps = conn.prepareStatement(sql2);
        ps.setString(1,name);
        ResultSet rs2 = ps.executeQuery();
        while(rs2.next())
        {
            String fname2 = rs2.getString("first_name");
            String lname2 = rs2.getString("last_name");
            System.out.println(rs2.getRow()+"\t"+fname2+"\t"+lname2);
        }





    }
}
