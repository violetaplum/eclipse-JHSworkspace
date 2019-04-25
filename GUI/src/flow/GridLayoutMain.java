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
		this.setLayout(new GridLayout(2,3));//���빰���� �������� �ȴ�.
		//��� ���� ��Ÿ���� �Ǵ� ���̾ƿ�
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

public class GridLayoutMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridLayoutMainClass flc1 = new GridLayoutMainClass();
	}

}
