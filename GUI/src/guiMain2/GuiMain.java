package guiMain2;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Hello2 extends Frame
{
	public Hello2(String me)//생성자
	{
		super(me);//부모쪽으로 호출
	}
	public static void main(String args[])
	{
		Hello2 h2 = new Hello2("It's me!");
		h2.setSize(300,300);
		h2.setVisible(true);
	}
}
class Hello3 extends Frame
{
	public static void main(String args[])
	{
		Hello3 h3 = new Hello3();
		h3.setSize(300,300);
		h3.setTitle("It's me");
		h3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		h3.setVisible(true);
	}
}
class WindowDada extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
	
		System.exit(0);
	}
}
class Hello4 extends Frame
{
	public static void main(String[] args)
	{
		Hello4 h4 = new Hello4();
		h4.setSize(300,300);
		h4.setTitle("It's me!!");
		h4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		h4.setVisible(true);
		h4.addWindowListener(new WindowDada());
	}
}
class LabelClass extends Frame
{
	public static void main(String[] args)	//출력 전문용 컴포넌트임
	{
		LabelClass lc1 = new LabelClass();
		lc1.setSize(500,500);
		lc1.setTitle("Label is..? ");
		System.out.println("I'm the Label..");
		
		Label l1 = new Label("I'm the Label~ ", Label.CENTER);
		l1.setFont(new Font("굴림",Font.BOLD,24));
		lc1.add("North",l1);//Label.add(location,Label) : Frame에 붙이는 메소드
		l1.setSize(200,100);
		l1.setVisible(true);
		lc1.setVisible(true);//.setVisible(true or false) : 전체 프레임을 보여줌
		lc1.addWindowListener(new WindowDada());
		
	}
}

public class GuiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Hello2 h2 = new Hello2("It's me!");
			h2.setSize(300,300);
			h2.setVisible(true);
	}

}
