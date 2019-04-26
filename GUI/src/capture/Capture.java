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
	private Button b1 = new Button("전체화면 캡쳐하자");
	Robot robot1; //Robot() 키보드 마우스 제어 --> 캡쳐를 해줌
	Dimension totWin1;//어떤 Component의 너비, 구성요소 알수있음       -->Toolkit이 들어있음
	Rectangle rect1;  //--> Component 에 저장할거임
	BufferedImage bImage1; //--> 이미지 파일로 만들어서 저장!
	
	public CaptureClass() throws IOException,AWTException
	{
		add(b1);
		b1.setVisible(true);
		robot1 = new Robot(); 
		totWin1 = Toolkit.getDefaultToolkit().getScreenSize();
		//java 차원에서 os에 대한 정보를 알 수 있음
		//Toolkit.getDefaultToolkit().getScreenSize()  -->  os 화면의 세로 가로를 알 수 있음
		
		rect1 = new Rectangle((int)totWin1.getWidth(),(int)totWin1.getHeight());
		//Toolkit.getDefaultToolkit().getScreenSize()에서 받아온 너비,높이를 알아와서 Rectangle Component에 저장한다.
		
		bImage1 = robot1.createScreenCapture(rect1); //robot.createScreenCapture()가 캡쳐를 해버림
		//캡쳐를 해서 BufferedImage 변수에 저장
		ImageIO.write(bImage1,"jpg",new File("e:/capture.jpg"));
		//ImageIO.write(Robot.createScreenCapture(),확장자,File위치와이름생성);
		//이 캡쳐된 이미지를 특정 위치에 특정 확장자로 저장해줌
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
