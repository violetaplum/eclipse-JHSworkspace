package JDBCMain;

import java.sql.*;
import java.util.Scanner;

public class JDBCMain {
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        try {
            Connection con1 = null;//접속객체 con1선언
            Class.forName("oracle.jdbc.driver.OracleDriver");// Class는 static이기 때문에 따로 선언하지 않아도 됨
                            //드라이버 로딩
                            //Class.forName("DBname");
            con1 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");//붙여쓰기 주의한다!!
            //Connection conn = DriverManager.getConnection("jdbc name","user","password");

            System.out.println("Connected!!!!");    //확인 메세지

            //String sql2 = "select* from employees";
            String sql2 = "select first_name 이름,salay 봉급 from employees"
                    +" where salary >= ?"; //sql connection 창에서처럼 ";"를 붙이면 Error!!
                    // + 다음에 띄어쓰기 주의한다!!
            //String sql2 = "select* from employees where upper(first_name) like 'NANCY'"; 도 가능


            //나중에 명령어에 join이 들어가게 될 수도 있다.
            //하단에 나중에 형식을 정해주어 출력하기 위해 Statement, ResultSet 객체를 사용하여 JVM으로 볼 수 있다.

            Statement st2 = con1.createStatement(); // Statement.createStatement(); --> String이 단순한 글자가 아닌 명령어가 된다

            PreparedStatement ps2 = con1.prepareStatement(sql2);    //Connection.prepareStatemnet(String);
                                        //?가 들어가는 Statement를 이용할거라는 얘기
            Scanner sc = new Scanner(System.in);
            System.out.print("Salary over how much???");
            int salary_bada = sc.nextInt();// sql문의 ? 에 여기서 들어온 값이 들어가게 된다.
            ps2.setInt(1,salary_bada);  //앞의 index는 ?가 들어가는 위치 중 몇번째 위치에 넣을 것인지 고르는 것
            //PreparedStatement.setInt(index,String);
            //index는 1부터 시작한다.
            ResultSet rs2 = ps2.executeQuery(); //PreparedStatement.executeQuery()
            //ResultSet rs2 = st2.executeQuery(sql2); // ResultSet.executeQuery(String); --> 문장객체.조회(문장)
            //ResultSet : select문은 화면에 결과가 나오지만 종이박스를 사용

            while(rs2.next())
            {
                String fname = rs2.getString("name");
                int salary = rs2.getInt("salary");
                System.out.println(rs2.getRow()+"\t"+fname+"\t"+salary);
            }


            while(rs2.next())//rs2.next() 는 계속 다음으로 넘어가면서 값이 존재하면 true, 없으면 false를 반환한다
            {
                int id = rs2.getInt("employee_id"); //100 //int id = rs2/getINt(1); //정수일때 int
                //ResultSet.getInt("칼럼명"); 해줘도 된다.
                String fname = rs2.getString("first_name");//String fname=rs2.getString(1); //문자일때 String
                //ResultSet.getString("칼럼명");
                String h_date = rs2.getString("hire_date"); //String.getString() 해서 String이 들어가는데 밑에서 substring()으로 형식 정해준다
                //ResultSet.getString("칼럼명");
                String hire_date = h_date.substring(0,10);//2008-01-12  --> 연월일시분초 로 나오기 때문에 0~10번째 까지만 출력하겠다는 의미
               //ResultSet.getString("칼럼명");
                System.out.println(rs2.getRow()+"\t"+id+"\t"+fname+"\t"+hire_date); //값이 출력되는 형식을 정해줌!!
                //ResultSet.getRow() : 행번호를 출력해준다


            }//while-end


            con1.close();
            System.out.println("End of Connection!");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage()); //에러 메세지
        }

    }
}
