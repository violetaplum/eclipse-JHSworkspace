package checkBox;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxMain extends Frame implements ActionListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxMain cbc1 = new CheckBoxMain();
		cbc1.setTitle("üũ�ڽ�");
		Checkbox cb1 = new Checkbox("���",true);
		Checkbox cb2 = new Checkbox("��",false);
		Checkbox cb3 = new Checkbox("��",false);
		cbc1.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e1)
			{
				
				System.exit(0);
				
			}
		});
		
		
		cbc1.setLayout(new FlowLayout());
		cbc1.add(cb1);
		cbc1.add(cb2);
		cbc1.add(cb3);
		cbc1.pack();
		cbc1.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
