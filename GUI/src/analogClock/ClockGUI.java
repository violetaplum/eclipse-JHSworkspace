package analogClock;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;


class ClockGUI2 extends Frame implements ActionListener{
	private Button b1=new Button("click!");
	static int r,cX,cY,sooX,sooY,secX,secY,minX,minY,hourX,hourY;//이 밑에서 다 사용하기 위해

	static int si,boon,cho;
	public ClockGUI2() {
		
		this.setLayout(null);
		b1.setSize(100,70);
		b1.setForeground(new Color(0,0,255));
		b1.setBackground(new Color(255,180,180));
		b1.setFont(new Font("돋움", Font.BOLD,20));
		b1.setLocation(50,50);
		this.add(b1);
		b1.addActionListener(this);
		this.setBackground(new Color(255,255,0));
		this.setTitle("Clock");
		this.setSize(1100, 1000);
		this.setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e1) {
				dispose();//개발자가 컴퓨터에 있는 메모리를 날려버리는것
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g) {
		Date d1=new Date();
		si=d1.getHours();
		boon=d1.getMinutes();
		cho=d1.getSeconds();
		g.setColor(Color.WHITE);
		g.fillOval(300, 300, 500, 500);
		
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
public class ClockGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClockGUI2 bb=new ClockGUI2();
	}

}
