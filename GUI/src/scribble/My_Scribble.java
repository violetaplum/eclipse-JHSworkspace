package scribble;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
												//mouseClicked()	//mouseDragged(),mouseMoved()
public class My_Scribble extends Frame implements MouseListener,MouseMotionListener{ 

	private int witchiX=0,witchiY=0; //내가 마우스를 클릭한 후 움직이는 경우 필요한 좌표 : 현재 위치를 저장하기 위한 변수들
	
	public My_Scribble() //생성자
	{
		/*MenuBar mb1 = new MenuBar();
		Menu m1 = new Menu("파일");
		MenuItem mi1 = new MenuItem("Save");
		m1.add(mi1);
		setMenuBar(mb1);
		*/
		addMouseListener(this);//마우스 이벤트 등록
		addMouseMotionListener(this);
		this.setBackground(new Color(120,100,220));
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g = getGraphics();
		g.setColor(Color.magenta);//Graphics.setColor(Color.color) : 선의 색상을 정할 수 있다.
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(30));//Graphics2D.setStroke(new BasicStroke(int)) : 선의 굵기를 나타내준다.
		
		int badaX = e.getX();
		int badaY = e.getY();
		
		g.drawLine(witchiX, witchiY, badaX, badaY);	//시작점~끝점
		witchiX=badaX;
		witchiY=badaY;
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) { //mouseClicked가 필요 없어질수도 있음.
		// TODO Auto-generated method stub
		witchiX = e.getX();//MouseEvent.getX() : 현재 나의 X위치를 알고있음
		witchiY = e.getY();//MouseEvent.getY() : 현재 나의 Y위치를 알고있음
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_Scribble sc = new My_Scribble(); //생성자에서는 이벤트만 처리해 주면 된다.
		sc.setSize(700,700);
		sc.setTitle("마음대로 낙서장");
		sc.setVisible(true);
		
		sc.addWindowListener(new WindowAdapter() {	//창문 종료를 위해 클래스 하나 만듦...
			public void windowClosing(WindowEvent e1) {
				/*dispose();*/
				System.exit(0);

			}
		});
	}

	

}
