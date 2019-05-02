package radioButton;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RadioButton extends Frame implements ActionListener{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton rb1 = new RadioButton();
		rb1.setTitle("라디오 버튼");
		CheckboxGroup ck1 = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("사과",ck1,false);
		Checkbox cb2 = new Checkbox("배",ck1,true);
		Checkbox cb3 = new Checkbox("감",ck1,false);
		
		rb1.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e1)
			{
				System.exit(0);
			}
		});
		
		rb1.setLayout(new FlowLayout()); //Flow,Grid,Alpha,...
		rb1.add(cb1);
		rb1.add(cb2);
		rb1.add(cb3);
		rb1.pack();
		rb1.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
