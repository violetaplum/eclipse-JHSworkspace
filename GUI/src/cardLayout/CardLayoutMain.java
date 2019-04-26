package cardLayout;
import java.awt.*;
import java.awt.event.*;

 

 class CardLayoutMain extends Frame  { ////////////////////

 

Frame f1;

Panel pan1;

Panel pan2;   

Panel pan3;

CardLayout clo1;

 

public CardLayoutMain() //생성자먼저가동 

	{

	  f1=new Frame("나~~~프레임이라는");//////////

	  clo1=new CardLayout(); ////////////

	  f1.setLayout(clo1); //카드식으로  배치

       

	  pan1=new Panel();

	  pan1.setBackground(Color.red);

	  f1.add(pan1,"pan1"); //pan1의 별명은 "pan1"

	  

	  pan2=new Panel();

	  pan2.setBackground(Color.yellow);

	  f1.add(pan2,"pan2");

		

	  pan3=new Panel();

	  pan3.setBackground(Color.blue);

	  f1.add(pan3,"pan3"); 

		

	  clo1.show(f1, "pan3"); //3장의 카드중 초기에 보이는 것은 pan3 별명의 파란색 패널 

		

		f1.setSize(700,700);

		f1.setVisible(true);

		f1.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e1)
			{
				dispose();
				System.exit(0);
				
			}
		}); 
		//세개의 판넬이 한꺼번에 닫히는 것이기 때문에 frame을 닫으라고 명령 해주어야 한다.
		//다른 경우는 판넬인지 Frame인지 표기하지 않아도 되지만 이같은 경우에는 세개 중 무엇을 닫아야할 지 모르므로 Frame에 부여한다.
		//판넬을 닫는 것이 아닌 Frame을 닫아야 한다는 것에 주의!!
		//위치가 중요함

		//일단 여기서 run 해보자는 ~~~~~~~

		

		class Selpan extends MouseAdapter{ 

			//이벤트 처리함수 //event handler 

			
			public void mouseClicked(MouseEvent e1) { //mouse event 

				if(e1.getModifiers()==e1.BUTTON3_MASK)  //1:left  2:middle

					clo1.previous(f1);

				else

					clo1.next(f1);

			}
			

		}

		pan1.addMouseListener(new Selpan()); //이벤트가능 

		pan2.addMouseListener(new Selpan());

		pan3.addMouseListener(new Selpan()); //다시 여기서 run한후 마오, 마왼 눌러~~~
		//이같은 경우 판에 세개를 넣은 것이다.
		//이 다음에 윈도우를 닫는 메소드를 넣어야 한다.
		//세개의 패널이 한꺼번에 닫히는 것이기 때문에 frame을 닫으라고 명령 해주어야 한다.
		
	}

	

	public static void main(String args[]) 

	{

		//CardLayoutMainClass.java

		CardLayoutMain flc1=new CardLayoutMain();

		

	}

}

