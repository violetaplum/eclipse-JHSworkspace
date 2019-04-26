package alpha;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class AlphaClass extends Frame
{
	public AlphaClass()
	{
		setUndecorated(true);
		setBackground(new Color(0,0,0,255));
		//red,green,blue,alpha 순서 --> 0-255가 투명도를 보여준다. 255가 불투명
		
		setSize(300,300);
		setVisible(true);
		addWindowListener(new WindowAdapter() //창문닫는애
				{
					public void windowClosing(WindowEvent e)
					{
						dispose();
						System.exit(0);
					}
				});
	}
}

public class AlphaMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlphaClass bb = new AlphaClass();
	}

}
