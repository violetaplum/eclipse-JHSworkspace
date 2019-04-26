package GuiThread;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;

class EDisplay extends Frame implements ActionListener//ActionEvent를 알아듣는 이유
{
	static int sw=0;
	static String s1 = "                  I LOVE YOU";
	Timer t1 = new Timer();
	
	private Button b1 = new Button("Starts");
	private Button b2 = new Button("Ends");
	private TextField tf1 = new TextField();//이거는 빈칸. 이자리에 저 s1을 출력해야함
	public EDisplay()
	{
		this.setLayout(null);
		b1.setSize(200,70);
		b1.setForeground(new Color(0,0,255));
		b1.setBackground(new Color(255,180,100));
		b1.setFont(new Font("돋음",Font.BOLD,20));
		b1.setLocation(150,200);
		this.add(b1);
		b1.addActionListener(this);
		
		b2.setSize(200,70);
		b2.setForeground(new Color(0,0,255));
		b2.setBackground(new Color(255,180,100));
		b2.setFont(new Font("돋음",Font.BOLD,20));
		b2.setLocation(150,300);
		this.add(b2);
		b2.addActionListener(this);
		
		tf1.setSize(400,50);
		tf1.setForeground(new Color(0,0,255));
		tf1.setBackground(new Color(255,255,0));
		tf1.setFont(new Font("돋음",Font.BOLD,20));
		tf1.setLocation(30,70);//텍스트 내부 위치
		this.add(tf1);
		
		this.setBackground(new Color(0,200,0));
		this.setTitle("자바는 정말재밌어");
		this.setSize(460, 400);//프레임 크기
		this.setVisible(true);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e1)
			{
				dispose();
				System.exit(0);
				
			}
		}); // 프레임 닫아주는친구
		
	}//생성자 End

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==b1&&sw==0)
		{
			b1.setEnabled(false);
			t1.scheduleAtFixedRate(	//t1.schedule(){} 을 해도 된다.
					new TimerTask() //TimerTask() : 수행되야할 내용을 run을 이용해 수행해준다.
			{
				public void run()
				{
					try
					{
						s1 = s1.substring(1,s1.length())+s1.substring(0,1);//s1을 변경해줘서 계속 돌아가는 메소드가 형성된다.
						tf1.setText(s1);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}//run() ends
				
			},0,20);//schedule ends
			//new TimerTask(처리할내용,delay,period(간격)); --> 간격을 작게 잡으면 글자가 빠르게 지나간다.
			//delay는 최초 시작 딜레이
		}//if ends
		
		sw=1;
		
		if(e.getSource()==b2)
		{
			t1.cancel();
		}
		
		
	}//ActionListener을 받았으니 이거는 그냥 자동으로 생성하게끔 한다.
}

public class ElectronicDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EDisplay ed1 = new EDisplay();
	}

}
