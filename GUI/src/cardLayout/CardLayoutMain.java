package cardLayout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutMain extends Frame{

	Frame f1;
	Panel pan1;
	Panel pan2;
	Panel pan3;//프레임하나에 카드가 3장
	
	CardLayout clo1;
	
	public CardLayoutMain() {
		f1=new Frame(":D");
		clo1=new CardLayout();
		f1.setLayout(clo1);
		
		pan1=new Panel();
		pan1.setBackground(Color.red);
		f1.add(pan1, "pan1");
		
		pan2=new Panel();
		pan2.setBackground(Color.yellow);
		f1.add(pan2, "pan2");
		
		pan3=new Panel();
		pan3.setBackground(Color.blue);
		f1.add(pan3, "pan3");
		
		clo1.show(f1, "pan3");//3장의 카드 중 초기에 보이는 것은 pan3별명의 파란색 패널

		f1.setSize(700,700);
		f1.setVisible(true);
		addWindowListener(new WindowAdapter() //창문닫는애
				{
					public void windowClosing(WindowEvent e)
					{
						dispose();
						System.exit(0);
					}
				});

	
		class Selpan extends MouseAdapter{//이벤트 처리함수
			public void mouseCliked(MouseEvent e) {
				if(e.getModifiers() == e.BUTTON2_MASK) {
					clo1.previous(f1);
				}else {
					clo1.next(f1);
				}
			}
		}
		pan1.addMouseListener(new Selpan());//이벤트 가능
		pan2.addMouseListener(new Selpan());
		pan3.addMouseListener(new Selpan());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CardLayoutMain flc1=new CardLayoutMain();
	}

}
