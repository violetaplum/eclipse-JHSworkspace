package combo;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Combo extends Frame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Combo cc1 = new Combo();
			cc1.setTitle("ComboBox Choice");
			Choice c1 = new Choice();
			c1.add("Seoul");
			c1.add("Kyungi");
			c1.add("Eanchun");
			
			/*c1.remove(0); //index 0���� ������ ����
			c1.insert("����", 0); //index 0���� ������ �߰�
			*/
			
			
			cc1.add(c1); //�����ӿ� ���õ� ��ư �ֱ�
			cc1.pack();
			cc1.setSize(300,350);
			cc1.setVisible(true);
			
			
			System.out.println("Item Number  "+c1.getItemCount());
			System.out.println("0th Item  " + c1.getItem(0));
			System.out.println("Current Selected Item   "+ c1.getSelectedItem());
			
			//Choice.getItemCount(index) : �������� ����
			//Choice.getItem(index) : index�� �ִ� ������
			//Choice.getSelectedItem() : ���� ���õ� ������
			
			
			cc1.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					
					System.exit(0);
				}
			});
	}

}
