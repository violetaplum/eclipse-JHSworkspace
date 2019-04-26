package flow;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FlowLayoutMainClass extends Frame implements ActionListener
{
	public FlowLayoutMainClass()
	{
		this.setLayout(new FlowLayout());//내용물들이 유동적이 된다.
		this.add(new Button("눌러봐"));
		this.add(new Button("골라봐"));
		this.add(new Button("웬열?드립실드치지마"));
		this.add(new Button("뭥미?"));
		this.add(new Button("뭘 눌러?"));
		this.add(new Button("아무거나"));
		this.setSize(300,300);
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

public class FlowLayoutMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FlowLayoutMainClass flc1 = new FlowLayoutMainClass();
	}

}
