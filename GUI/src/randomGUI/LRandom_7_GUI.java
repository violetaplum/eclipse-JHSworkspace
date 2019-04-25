package randomGUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

class LRandomGUI2 extends Frame implements ActionListener
{
	private Button b1 = new Button(" Press");
	
	private TextField tf1 = new TextField();
	private TextField tf2 = new TextField();
	private TextField tf3 = new TextField();
	private TextField tf4 = new TextField();
	private TextField tf5 = new TextField();
	private TextField tf6 = new TextField();
	public LRandomGUI2()
	{
		this.setLayout(null);
		
		b1.setSize(100,70);
		b1.setForeground(new Color(0,0,255));//blue
		b1.setBackground(new Color(255,180,200)); //R,G,B ÀÇ »ö»óÁ¤µµ
		b1.setFont(new Font("µ¸¿ò",Font.BOLD,20));
		b1.setLocation(170,250);
		this.add(b1);
		b1.addActionListener(this);
		tf1.setSize(50,50);
		tf1.setForeground(new Color(0,0,255));
		tf1.setBackground(new Color(255,255,0));
		tf1.setFont(new Font("µ¸¿ò",Font.BOLD,35));
		tf1.setLocation(30,70);
		this.add(tf1);
		tf2.setSize(50,50);
		tf2.setForeground(new Color(0,0,255));
		tf2.setBackground(new Color(255,255,0));
		tf2.setFont(new Font("µ¸¿ò",Font.BOLD,35));
		tf2.setLocation(30,70);
		this.add(tf2);
		tf3.setSize(50,50);
		tf3.setForeground(new Color(0,0,255));
		tf3.setBackground(new Color(255,255,0));
		tf3.setFont(new Font("µ¸¿ò",Font.BOLD,35));
		tf3.setLocation(100,70);
		this.add(tf3);
		tf4.setSize(50,50);
		tf4.setForeground(new Color(0,0,255));
		tf4.setBackground(new Color(255,255,0));
		tf4.setFont(new Font("µ¸¿ò",Font.BOLD,35));
		tf4.setLocation(170,70);
		this.add(tf4);
		tf5.setSize(50,50);
		tf5.setForeground(new Color(0,0,255));
		tf5.setBackground(new Color(255,255,0));
		tf5.setFont(new Font("µ¸¿ò",Font.BOLD,35));
		tf5.setLocation(240,70);
		this.add(tf5);
		tf6.setSize(50,50);
		tf6.setForeground(new Color(0,0,255));
		tf6.setBackground(new Color(255,255,0));
		tf6.setFont(new Font("µ¸¿ò",Font.BOLD,35));
		tf6.setLocation(310,70);
		this.add(tf6);
		
		this.setBackground(new Color(0,200,0));
		this.setTitle("Java is fun.");
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
				int[] Bae = new int[6];
				for(int i=0;i<6;i++)
				{
					Bae[i]=(int)(Math.ceil(Math.random()*45));
					for(int j=0;j<i;j++)
					{
						if(Bae[i]==Bae[j])
						{
							i--;
						}
					}
				}
				Arrays.sort(Bae);
				tf1.setText(String.valueOf(Bae[0]));//String.valueOf() ¹®ÀÚ·Î ¹Ù²ãÁØ´Ù
				tf2.setText(String.valueOf(Bae[1]));
				tf3.setText(String.valueOf(Bae[2]));
				tf4.setText(String.valueOf(Bae[3]));
				tf5.setText(String.valueOf(Bae[4]));
				tf6.setText(String.valueOf(Bae[5]));
				
			}
		
	}

}

	

public class LRandom_7_GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LRandomGUI2 b = new LRandomGUI2();
			
	}

}
