package buttonClassClosing;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class ButtonClass3 extends Frame implements ActionListener
{
	private Button b1 = new Button("Press!");
	private Label la1 = new Label("Here you are.");
	
		public ButtonClass3()
		{
			this.setLayout(null);//위치 마음대로 배치하기
			b1.setSize(100,70);
			b1.setLocation(200,300);
			this.add(b1);
			b1.addActionListener(this);
			
			la1.setSize(100,70);
			la1.setLocation(200,150);
			this.add(la1);
			this.setSize(500,500);
			this.setVisible(true);
			addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e1)
				{
					dispose();
					System.exit(0);
					
				}
			}); 
		
	}
		
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			la1.setText("HEllo!!");
		}
	}
}

public class ButtonClassClosing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ButtonClass3 bee1 = new ButtonClass3();
	}

}
