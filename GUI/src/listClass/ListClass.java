package listClass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListClass extends Frame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ListClass lc1 = new ListClass();
			
			lc1.setTitle("����Ʈ Ŭ����");
			lc1.setLayout(new FlowLayout());
			//�̰� ���� ������ List�� ���������� ��µ��� �ʴ´�.
			List list1 = new List(3,false);
			//�������� ���� 3��,false�� ���� ��������, true�̸� ���� ����
			list1.add("����");
			list1.add("���");
			list1.add("��ȭ");
			list1.add("�Ҽ�");
			list1.add("����");
			
			list1.select(1); //�⺻������ �ι�° ����������
			lc1.add(list1);	//List�� Frame�� �ֱ�
			lc1.setBounds(100,100,300,400);
			// setSize() + setLocation(); : (x,y,width,height)
			
			
			
			lc1.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e1)
				{
					
					System.exit(0);
					
				}
			});
			lc1.setVisible(true);
			
	}

}
