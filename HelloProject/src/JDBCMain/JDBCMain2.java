package JDBCMain;
import java.sql.*;
import java.util.*;

public class JDBCMain2 {
    public static void main(String[] args) throws ClassNotFoundException,SQLException
    {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
        System.out.println("Connected!!");

        Scanner sc = new Scanner(System.in);

        System.out.print("Insert what you wanna find >> ");
        String find = "%"+sc.next()+"%";
        String sql = "select* from employees where upper(first_name) like ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,find.toUpperCase()); //PreparedStatement.setString(,)
                                                        // 두번째 파라미터는 통째로 ?에 ''가 붙어서 들어간다
        //String.toUpperCase(); : 모두 대문자로 바꾸기
        //String.toLowerCase(); : 모두 소문자로 바꾸기
        ResultSet rs = ps.executeQuery();

        while(rs.next())
        {
            String fname = rs.getString("first_name");
            String lname = rs.getString("last_name");
            System.out.println(rs.getRow()+"\t"+fname+"\t"+lname);
        }
        conn.close();
    }
}
