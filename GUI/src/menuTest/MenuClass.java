package menuTest;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MenuClass2 extends Frame
{
	public MenuClass2()
	{
		//C#			WPF (Window Presentation Foundation) : UI
		//xml <> 
		MenuBar mb1 = new MenuBar();
		Menu m1 = new Menu("����"); //���� ������ �ֱ� ����
		MenuItem it1 = new MenuItem("����");
		MenuItem it2 = new MenuItem("����");
		MenuItem it3 = new MenuItem("�μ�");
		MenuItem it4 = new MenuItem("����"); //���� �������� ó���ϱ� ���ؼ� ����
		
		m1.add(it1);//�޴� �������� �޴��� �ְ�
		m1.add(it2);
		m1.addSeparator();//������(��)�� ���̰� �ȴ�. �� ��ġ�� ���Ʒ� ���� ������ �°� ����.
		m1.add(it3);
		m1.addSeparator();
		m1.add(it4);
		
		mb1.add(m1);//�޴��� �޴� �����ۿ� �ְ�
		
		setMenuBar(mb1);
		add(new TextArea());
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e1) {
				dispose();
				System.exit(0);

			}
		});
	}//������ ��

}//class-end

public class MenuClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuClass2 mc1 = new MenuClass2();
		mc1.setSize(500,500);
		mc1.setTitle("�޴�");
		mc1.pack();
		mc1.setVisible(true);
		//mc1.addWindowListener(new WindowDada()); : â�����Ḧ ���� Ŭ���� �ϳ� ����
	}

}
