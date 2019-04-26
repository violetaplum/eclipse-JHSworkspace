package GuiThread;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class GuiThreadTest extends Frame implements ActionListener,Runnable{
	
	private Label lbl;
	private Boolean b = false;
	private Thread thread;
	public GuiThreadTest()
	{
		lbl = new Label("display time", Label.CENTER);
		add("Center",lbl);
		Button button = new Button("click");
		add("South",button);
		button.addActionListener(this);;
		
		setTitle("A Clock Using Thread");
		setBounds(200,150,300,300);
		setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
