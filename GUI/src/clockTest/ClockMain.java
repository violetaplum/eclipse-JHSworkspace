package clockTest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

class ClockClass extends Frame implements ActionListener
{
	private Button b1 = new Button(" Press");
	private TextField tf1 = new TextField();
	private TextField tf2 = new TextField();
	private TextField tf3 = new TextField();
	private TextField tf4 = new TextField();
	private TextField tf5 = new TextField();
	private TextField tf6 = new TextField();
	
	public ClockClass()
	{
		this.setLayout(null);
		
		b1.setSize(100,70);
		b1.setForeground(new Color(0,0,255));//blue
		b1.setBackground(new Color(255,180,200)); //R,G,B 의 색상정도
		b1.setFont(new Font("Fira Code",Font.BOLD,20));
		b1.setLocation(170,250);
		this.add(b1);
		b1.addActionListener(this);
		
		tf1.setSize(50,50);
		tf1.setForeground(new Color(0,0,255));
		tf1.setBackground(new Color(255,255,0));
		tf1.setFont(new Font("Fira Code",Font.BOLD,35));
		tf1.setLocation(30,70);
		this.add(tf1);
		
		tf2.setSize(50,50);
		tf2.setForeground(new Color(0,0,255));
		tf2.setBackground(new Color(255,255,0));
		tf2.setFont(new Font("Fira Code",Font.BOLD,35));
		tf2.setLocation(100,70);
		this.add(tf2);
		
		tf3.setSize(50,50);
		tf3.setForeground(new Color(0,0,255));
		tf3.setBackground(new Color(255,255,0));
		tf3.setFont(new Font("Fira Code",Font.BOLD,35));
		tf3.setLocation(170,70);
		this.add(tf3);
		
		tf4.setSize(50,50);
		tf4.setForeground(new Color(0,0,255));
		tf4.setBackground(new Color(255,255,0));
		tf4.setFont(new Font("Fira Code",Font.BOLD,35));
		tf4.setLocation(240,70);
		this.add(tf4);
		
		tf5.setSize(50,50);
		tf5.setForeground(new Color(0,0,255));
		tf5.setBackground(new Color(255,255,0));
		tf5.setFont(new Font("Fira Code",Font.BOLD,35));
		tf5.setLocation(310,70);
		this.add(tf5);
		
		tf6.setSize(50,50);
		tf6.setForeground(new Color(0,0,255));
		tf6.setBackground(new Color(255,255,0));
		tf6.setFont(new Font("Fira Code",Font.BOLD,35));
		tf6.setLocation(380,70);
		this.add(tf6);
		
		this.setBackground(new Color(0,200,0));
		this.setTitle("My Clock");
		this.setSize(460,400);
		this.setVisible(true);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
				System.exit(0);
			}
		});
}
	
		public void actionPerformed(ActionEvent e1)
		{
			if(e1.getSource()==b1)
			{	
				Timer t = new Timer();
				
				t.scheduleAtFixedRate(new TimerTask() {
					public void run()
					{
						Calendar cal = Calendar.getInstance();
						int hour = cal.get(cal.HOUR_OF_DAY);
						int min = cal.get(cal.MINUTE);
						int sec = cal.get(cal.SECOND);
						tf1.setText(String.valueOf(hour));
						tf3.setText(String.valueOf(min));
						tf5.setText(String.valueOf(sec));
					}
				},0,1000); //시간이 맞아야하므로 1초간 잠깐 기다린다.
				b1.setEnabled(false);
				tf2.setText("time");
				tf4.setText("minute");
				tf6.setText("second");
			}
		}
}

public class ClockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ClockClass c1 = new ClockClass();
	}

}
