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
		this.setLayout(new FlowLayout());//���빰���� �������� �ȴ�.
		this.add(new Button("������"));
		this.add(new Button("����"));
		this.add(new Button("����?�帳�ǵ�ġ����"));
		this.add(new Button("�o��?"));
		this.add(new Button("�� ����?"));
		this.add(new Button("�ƹ��ų�"));
		this.setSize(300,300);
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

public class FlowLayoutMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FlowLayoutMainClass flc1 = new FlowLayoutMainClass();
	}

}
