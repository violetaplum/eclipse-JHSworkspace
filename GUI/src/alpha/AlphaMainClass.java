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
		//red,green,blue,alpha ���� --> 0-255�� ������ �����ش�. 255�� ������
		
		setSize(300,300);
		setVisible(true);
		addWindowListener(new WindowAdapter() //â���ݴ¾�
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
