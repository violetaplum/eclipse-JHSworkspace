package borderMain;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class BorderLayoutMainClass extends Frame implements ActionListener
{
	public BorderLayoutMainClass()
	{
		this.setLayout(new BorderLayout(2,3));//기본이 BORDER LAYOUT이다 
		this.add(BorderLayout.EAST,new Button("눌러봐"));
		this.add(BorderLayout.WEST,new Button("골라봐"));
		this.add(BorderLayout.SOUTH,new Button("웬열?드립실드치지마"));
		this.add(BorderLayout.NORTH,new Button("뭥미?"));
		this.add(BorderLayout.CENTER,new Button("뭘 눌러?"));
		/*this.add(BorderLayout.EAST,new Button("아무거나"));*/
		this.setSize(700,700);
		this.setVisible(true);
		
		addWindowListener(new WindowAdapter() //창문닫는애
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
				System.exit(0);
			}
		});
	} 

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

public class BorderLayoutMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BorderLayoutMainClass blc = new BorderLayoutMainClass();
	}

}
