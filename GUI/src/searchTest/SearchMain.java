package searchTest;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class SearchClass extends Frame implements ActionListener
{
	private Button b2 = new Button("검색 ");
	private Label la1 = new Label("검색할 이름");
	private TextField tf1 = new TextField();
	private TextArea ta1 = new TextArea();
	private TextField tf2 = new TextField();
	//윈도우 빌더에서는 JText라고 뜰 것임
	//TextField는 한줄씩밖에 안들어갔엇음
	//TextArea는 여러 line이 들어간다. 행, 열이 여러개 일 수  있다. 화면크기가 작으면 스크롤바로 넘어간다. 처리가능
	
	public SearchClass()
	{
		
		this.setLayout(null);
		
		la1.setSize(100, 30);
		la1.setForeground(new Color(0,0,255));
		la1.setBackground(new Color(255,100,100));
		la1.setFont(new Font("돋음",Font.BOLD,15));
		la1.setLocation(30,40);
		this.add(la1);
		
		tf1.setSize(200,30);
		tf1.setBackground(new Color(255,255,255));
		tf1.setForeground(new Color(0,0,255));
		tf1.setLocation(130,40);
		tf1.setFont(new Font("돋음",Font.BOLD,15));
		this.add(tf1);
		tf1.addActionListener(this);
		
		
		b2.setSize(100,30);
		b2.setForeground(new Color(0,0,255));
		b2.setBackground(new Color(130,255,100));
		b2.setFont(new Font("돋음",Font.BOLD,15));
		b2.setLocation(400,40);
		this.add(b2);
		b2.addActionListener(this);
		
		ta1.setSize(500,400);// 크기
        ta1.setForeground(new Color(0,0,255));
        ta1.setBackground(new Color(200,255,0));
        ta1.setFont(new Font("돋움",Font.BOLD,15));
        ta1.setEditable(false);
        //TextArea.setEditable() : 같은 TextArea이지만 편집은 불가하고 보여주기만 한다.
        ta1.setLocation(30,100); // 내부위치 
	    this.add(ta1);// 추가 
        
	    this.setBackground(new Color(0,200,0)); 
	    this.setTitle("Search the Name ");
	    this.setSize(700, 700); //프레임 크기 
	    this.setVisible(true);
	    
	    addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e1)
			{
				dispose();
				System.exit(0);

			}
		});
	    
		
	    
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b2) //너가 누른 버튼이 어떤버튼이니? : b2는 읽기버튼
	{
		ta1.setText("");
		tf1.setText("");
		try
		{
		Connection con1 = null;//접속객체 con1선언
        Class.forName("oracle.jdbc.driver.OracleDriver");// Class는 static이기 때문에 따로 선언하지 않아도 됨
                        //드라이버 로딩
                        //Class.forName("DBname");
        con1 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");//붙여쓰기 주의한다!!
       

        System.out.println("Connected!!!!");
        
        
        String sql="select first_name||' '||last_name,phone_number from employees where first_name like ?";
        PreparedStatement ps = con1.prepareStatement(sql);
        ps.setString(1, tf1.getText());
        ResultSet rs = ps.executeQuery();
        
        while(rs.next())
        {
        	/*String name = rs.getString("name");
            String tel = rs.getString("number");*/
            ta1.setText(tf1.getText()+"'s tel number is : "+rs.getString("phone_number"));
        }
        
        /*ta1.setText(rs.toString());*/
        
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
		
	
		//FileDialog.getDirectory():파일의 위치, FileDialog.getFile():파일의 이름
		
	}

		
}


public class SearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SearchClass sc = new SearchClass();
			sc.setLocation(100, 0);
			
	}

}



