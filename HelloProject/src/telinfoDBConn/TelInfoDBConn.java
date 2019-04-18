package telinfoDBConn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TelInfoDBConn {
    private Connection con;
    public Connection getConnection()
    {
        return con;
    }
    public TelInfoDBConn() throws ClassNotFoundException, SQLException
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");

    }   //TelInfoDBConn생성자를 만들면 자동으로 접속연결됨!!!

}
