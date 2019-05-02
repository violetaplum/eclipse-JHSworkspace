package imageClass;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ImageClass extends Frame {

	static Image img1;  // aa.jpg를 받을 객체
	static String krim = "src/imageClass/aa.jpg"; // "d:aa.jpg"   ----> "src/패키지경로/파일명"
	// 만약 나 혼자 쓰는 거라면 상관없지만.. 여러사람과 함께 쓰는 코드라면
	// 이런 형식으로 패키지 안에 내가 가지고 다녀야 한다.
	public void paint(Graphics g) //그림 그려주는거
	{
		g.drawImage(img1,0,0,500,500,this);
		
	}
	
	public static void main(String[] args) { //static method (정적 메소드)
		// TODO Auto-generated method stub
			ImageClass pc1 = new ImageClass(); // Frame은 늘렷다 줄였다가 가능하다
			//하지만 그림은 움직이지 않는다.
			//나중에 그림도 Frame따라 같이 줄이게 만들 수도 있다.
			img1 = Toolkit.getDefaultToolkit().getImage(krim);
							//static 		//static method
			pc1.setTitle("이미지 넣기");//메일프레임 제목
			pc1.setSize(500,500);//메인 프레임 크기
			pc1.setResizable(true);
			pc1.setLayout(null);//레이아웃 메니져 초기화
			pc1.setVisible(true);
			pc1.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e1) {
					/*dispose();*/
					System.exit(0);

				}
			});
	}

}
