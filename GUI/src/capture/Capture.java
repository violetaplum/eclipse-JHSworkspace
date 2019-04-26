package capture;

import java.awt.AWTException;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

class CaptureClass extends JFrame
{
	private Button b1 = new Button("��üȭ�� ĸ������");
	Robot robot1; //Robot() Ű���� ���콺 ���� --> ĸ�ĸ� ����
	Dimension totWin1;//� Component�� �ʺ�, ������� �˼�����       -->Toolkit�� �������
	Rectangle rect1;  //--> Component �� �����Ұ���
	BufferedImage bImage1; //--> �̹��� ���Ϸ� ���� ����!
	
	public CaptureClass() throws IOException,AWTException
	{
		add(b1);
		b1.setVisible(true);
		robot1 = new Robot(); 
		totWin1 = Toolkit.getDefaultToolkit().getScreenSize();
		//java �������� os�� ���� ������ �� �� ����
		//Toolkit.getDefaultToolkit().getScreenSize()  -->  os ȭ���� ���� ���θ� �� �� ����
		
		rect1 = new Rectangle((int)totWin1.getWidth(),(int)totWin1.getHeight());
		//Toolkit.getDefaultToolkit().getScreenSize()���� �޾ƿ� �ʺ�,���̸� �˾ƿͼ� Rectangle Component�� �����Ѵ�.
		
		bImage1 = robot1.createScreenCapture(rect1); //robot.createScreenCapture()�� ĸ�ĸ� �ع���
		//ĸ�ĸ� �ؼ� BufferedImage ������ ����
		ImageIO.write(bImage1,"jpg",new File("e:/capture.jpg"));
		//ImageIO.write(Robot.createScreenCapture(),Ȯ����,File��ġ���̸�����);
		//�� ĸ�ĵ� �̹����� Ư�� ��ġ�� Ư�� Ȯ���ڷ� ��������
		setSize(700,700);
		setVisible(true);
	}
}

public class Capture {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		CaptureClass cc1 = new CaptureClass();

	}

}
