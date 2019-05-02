package menuTest;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MenuClass2 extends Frame
{
	public MenuClass2()
	{
		//C#			WPF (Window Presentation Foundation) : UI
		//xml <> 
		MenuBar mb1 = new MenuBar();
		Menu m1 = new Menu("파일"); //파일 도구를 넣기 위해
		MenuItem it1 = new MenuItem("열기");
		MenuItem it2 = new MenuItem("저장");
		MenuItem it3 = new MenuItem("인쇄");
		MenuItem it4 = new MenuItem("종료"); //파일 아이템을 처리하기 위해서 넣음
		
		m1.add(it1);//메뉴 아이템을 메뉴에 넣고
		m1.add(it2);
		m1.addSeparator();//구분자(선)이 보이게 된다. 이 위치는 위아래 선언 순서에 맞게 들어간다.
		m1.add(it3);
		m1.addSeparator();
		m1.add(it4);
		
		mb1.add(m1);//메뉴를 메뉴 아이템에 넣고
		
		setMenuBar(mb1);
		add(new TextArea());
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e1) {
				dispose();
				System.exit(0);

			}
		});
	}//생성자 끝

}//class-end

public class MenuClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuClass2 mc1 = new MenuClass2();
		mc1.setSize(500,500);
		mc1.setTitle("메뉴");
		mc1.pack();
		mc1.setVisible(true);
		//mc1.addWindowListener(new WindowDada()); : 창문종료를 위에 클래스 하나 만듦
	}

}
