package JDBCMain;
import java.util.*;
import java.sql.*;

public class JDBCMain3 {
    public static void main(String[] args) throws ClassNotFoundException,SQLException
    {
        Scanner sc = new Scanner(System.in);
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
        System.out.println("Connected!!");
        String sql = "insert into jdbc_tab3 values(?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);

        System.out.print("ID >> ");
        int id = sc.nextInt();
        System.out.print("NAME >> ");
        String name = sc.next();
        System.out.print("SALARY >> ");
        int sal = sc.nextInt();
        System.out.print("GRADE >> ");
        String jik = sc.next();

        ps.setInt(1,id);  //sawon_id
        ps.setString(2,name);  //sawon_name
        ps.setInt(3,sal);  //sawon_sal
        ps.setString(4,jik);  //sawon_jik

        int rs = ps.executeUpdate();
        System.out.println("I Inserted "+rs+"!!");
        conn.close();
    }

}
