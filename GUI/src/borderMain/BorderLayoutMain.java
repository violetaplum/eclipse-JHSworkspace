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
		this.setLayout(new BorderLayout(2,3));//�⺻�� BORDER LAYOUT�̴� 
		this.add(BorderLayout.EAST,new Button("������"));
		this.add(BorderLayout.WEST,new Button("����"));
		this.add(BorderLayout.SOUTH,new Button("����?�帳�ǵ�ġ����"));
		this.add(BorderLayout.NORTH,new Button("�o��?"));
		this.add(BorderLayout.CENTER,new Button("�� ����?"));
		/*this.add(BorderLayout.EAST,new Button("�ƹ��ų�"));*/
		this.setSize(700,700);
		this.setVisible(true);
		
		addWindowListener(new WindowAdapter() //â���ݴ¾�
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
