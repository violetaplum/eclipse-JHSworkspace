package randomTest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

class JooSaClass extends Frame implements ActionListener
{
	private Button b1 = new Button("ÁÖ»çÀ§ ´øÁ®ºÁ");
	private TextField tf1 = new TextField();
	public JooSaClass () 
	{
		this.setLayout(null);
		
		
		b1.setSize(200,50);
		b1.setForeground(new Color(0,0,255));//blue
		b1.setBackground(new Color(255,180,200)); //R,G,B ÀÇ »ö»óÁ¤µµ
		b1.setFont(new Font("µ¸¿ò",Font.BOLD,20));
		b1.setLocation(120,250);
		this.add(b1);
		b1.addActionListener(this);
		
		tf1.setSize(100,40);
		tf1.setForeground(new Color(0,0,255));
		tf1.setBackground(new Color(255,255,0));
		tf1.setFont(new Font("µ¸¿ò",Font.BOLD,35));
		tf1.setLocation(170,70);
		this.add(tf1);
		
		this.setBackground(new Color(120,100,220));
		this.setTitle("My Random Game");
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
	@Override
	public void actionPerformed(ActionEvent e1) {
		// TODO Auto-generated method stub
		if(e1.getSource()==b1)
		{	
			
			tf1.setText(String.valueOf((int)(Math.random()*6+1)));
				
		}
	}	
}

public class JooSa {
	public static void main(String[] args) {
	
			JooSaClass js = new JooSaClass();
	}

}
