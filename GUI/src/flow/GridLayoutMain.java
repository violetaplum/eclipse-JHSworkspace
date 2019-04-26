package flow;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class GridLayoutMainClass extends Frame implements ActionListener
{
	public GridLayoutMainClass()
	{
		this.setLayout(new GridLayout(2,3));//내용물들이 유동적이 된다.
		//행과 열로 나타나게 되는 레이아웃
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

public class GridLayoutMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridLayoutMainClass flc1 = new GridLayoutMainClass();
	}

}
