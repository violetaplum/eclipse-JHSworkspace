package search2;
import java.awt.*; 
import java.awt.event.*;
import java.sql.*;///////////////////
import java.util.*;

class Search2 extends Frame implements ActionListener{/////////////
    private Label la1=new Label("�˻����̸��� :");
	private TextField tf1 =new TextField();
	private Button b1=new Button("�˻�");
    private TextArea ta1=new TextArea();///////////////
    private TextField tf2 =new TextField();
    
    public Search2(){
    	
    	this.setLayout(null);
    	
        la1.setSize(100,30);// ũ��
        la1.setForeground(new Color(0,0,255));
        la1.setBackground(new Color(255,180,100));
        la1.setFont(new Font("����",Font.BOLD,15));
        la1.setLocation(30,40); //������ġ 
	    this.add(la1);
      
	    tf1.setSize(200,30);
	    tf1.setForeground(new Color(0,0,255));
	    tf1.setBackground(new Color(255,255,0));
        tf1.setFont(new Font("����",Font.BOLD,15));
	    tf1.setLocation(130, 40);// ������ġ 
	    this.add(tf1); 
	
	    b1.setSize(100,30);//��ư ũ��
        b1.setForeground(new Color(0,0,255));
        b1.setBackground(new Color(130,255,100));
        b1.setFont(new Font("����",Font.BOLD,15));
        b1.setLocation(400,40); //������ġ 
	    this.add(b1);//��ư ��� 
        b1.addActionListener(this); /////////////////
    
	    ta1.setSize(500,400);
	    ta1.setForeground(new Color(0,0,255));
	    ta1.setBackground(new Color(200,255,0));
        ta1.setFont(new Font("����",Font.BOLD,15));
        ta1.setEditable(false);////////////////////////
	    ta1.setLocation(30, 100);// ������ġ 
	    this.add(ta1);
	    
	    tf2.setSize(500,30);
	    tf2.setForeground(new Color(0,0,255));
	    tf2.setBackground(new Color(255,255,0));
        tf2.setFont(new Font("����",Font.BOLD,15));
	    tf2.setLocation(30, 580);//������ġ 
	    this.add(tf2); 
	    
	    this.setBackground(new Color(0,200,0)); 
	    this.setTitle("[������]  �ڹٴ� FUN FUN FUN !!!!!!");
	    this.setSize(560, 650); //������ ũ��
	    this.setVisible(true);
	  
	    addWindowListener(new WindowAdapter(){ //////////////////
	    	 public void windowClosing(WindowEvent e1){
	    		 dispose();
	    		 System.exit(0);
	    	 }
	    });
    }
    
    public void actionPerformed(ActionEvent e1){//
    	if(e1.getSource() == b1){ //��ư�� ����������(�̺�Ʈ) 
    		ta1.setText(""); 	tf2.setText("");
    		Connection con = null;
    	 	try{
    	 		Class.forName("oracle.jdbc.driver.OracleDriver");
    	 		con = DriverManager.getConnection
    	 		        ("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
    	        tf2.setText("db�� ���ӵǾ����ϴ�");
    	 		String sql = 
    	  "select first_name, last_name,phone_number from employees"
    	      + " where first_name = ?";

    	        PreparedStatement st =  con.prepareStatement(sql);
    	        st.setString(1, tf1.getText());///////////
    	        ResultSet rs = st.executeQuery();
    	       // String str1="";

  String str1=String.format("%20s\t%25s\n\n","[��   ��]","[�� ȭ �� ȣ]");                
         if(rs.next()){/////////////////
    	    do{ String fname= rs.getString(1);//firstname
    	   	    String lname = rs.getString(2);//lastname
    	  	    String phone = rs.getString(3);//phone
    	       str1 += String.format("%-20s%-20s%-20s\n",fname,lname,phone);
     	    }while(rs.next()); //str1 += fname+ " " + lname + "\t" +phone+"\n";  	  	       
    	      ta1.setText(str1);
    	  } else 
    	      ta1.setText("�׷� �̸��� �����ϴ�");
       con.close();   //tf2.setText("db��������");
   	}catch(ClassNotFoundException e){
    	 		tf2.setText("Ŭ������� �Ǵ� ����̹� error"); 	 	
   	}catch(SQLException e){
    	 		tf2.setText("���� error");
    }finally{
    	   try{ con.close();  }catch(SQLException e){}
    	  } 
    	}
    }
 }







public class Search {
	public static void main(String[] args) {
		Search2 s2=new Search2();
	}

}






