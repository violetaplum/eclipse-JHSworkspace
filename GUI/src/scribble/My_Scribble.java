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

	private int witchiX=0,witchiY=0; //���� ���콺�� Ŭ���� �� �����̴� ��� �ʿ��� ��ǥ : ���� ��ġ�� �����ϱ� ���� ������
	
	public My_Scribble() //������
	{
		/*MenuBar mb1 = new MenuBar();
		Menu m1 = new Menu("����");
		MenuItem mi1 = new MenuItem("Save");
		m1.add(mi1);
		setMenuBar(mb1);
		*/
		addMouseListener(this);//���콺 �̺�Ʈ ���
		addMouseMotionListener(this);
		this.setBackground(new Color(120,100,220));
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g = getGraphics();
		g.setColor(Color.magenta);//Graphics.setColor(Color.color) : ���� ������ ���� �� �ִ�.
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(30));//Graphics2D.setStroke(new BasicStroke(int)) : ���� ���⸦ ��Ÿ���ش�.
		
		int badaX = e.getX();
		int badaY = e.getY();
		
		g.drawLine(witchiX, witchiY, badaX, badaY);	//������~����
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
	public void mousePressed(MouseEvent e) { //mouseClicked�� �ʿ� ���������� ����.
		// TODO Auto-generated method stub
		witchiX = e.getX();//MouseEvent.getX() : ���� ���� X��ġ�� �˰�����
		witchiY = e.getY();//MouseEvent.getY() : ���� ���� Y��ġ�� �˰�����
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_Scribble sc = new My_Scribble(); //�����ڿ����� �̺�Ʈ�� ó���� �ָ� �ȴ�.
		sc.setSize(700,700);
		sc.setTitle("������� ������");
		sc.setVisible(true);
		
		sc.addWindowListener(new WindowAdapter() {	//â�� ���Ḧ ���� Ŭ���� �ϳ� ����...
			public void windowClosing(WindowEvent e1) {
				/*dispose();*/
				System.exit(0);

			}
		});
	}

	

}
