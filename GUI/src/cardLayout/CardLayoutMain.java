package cardLayout;
import java.awt.*;
import java.awt.event.*;

 

 class CardLayoutMain extends Frame  { ////////////////////

 

Frame f1;

Panel pan1;

Panel pan2;   

Panel pan3;

CardLayout clo1;

 

public CardLayoutMain() //�����ڸ������� 

	{

	  f1=new Frame("��~~~�������̶��");//////////

	  clo1=new CardLayout(); ////////////

	  f1.setLayout(clo1); //ī�������  ��ġ

       

	  pan1=new Panel();

	  pan1.setBackground(Color.red);

	  f1.add(pan1,"pan1"); //pan1�� ������ "pan1"

	  

	  pan2=new Panel();

	  pan2.setBackground(Color.yellow);

	  f1.add(pan2,"pan2");

		

	  pan3=new Panel();

	  pan3.setBackground(Color.blue);

	  f1.add(pan3,"pan3"); 

		

	  clo1.show(f1, "pan3"); //3���� ī���� �ʱ⿡ ���̴� ���� pan3 ������ �Ķ��� �г� 

		

		f1.setSize(700,700);

		f1.setVisible(true);

		f1.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e1)
			{
				dispose();
				System.exit(0);
				
			}
		}); 
		//������ �ǳ��� �Ѳ����� ������ ���̱� ������ frame�� ������� ��� ���־�� �Ѵ�.
		//�ٸ� ���� �ǳ����� Frame���� ǥ������ �ʾƵ� ������ �̰��� ��쿡�� ���� �� ������ �ݾƾ��� �� �𸣹Ƿ� Frame�� �ο��Ѵ�.
		//�ǳ��� �ݴ� ���� �ƴ� Frame�� �ݾƾ� �Ѵٴ� �Ϳ� ����!!
		//��ġ�� �߿���

		//�ϴ� ���⼭ run �غ��ڴ� ~~~~~~~

		

		class Selpan extends MouseAdapter{ 

			//�̺�Ʈ ó���Լ� //event handler 

			
			public void mouseClicked(MouseEvent e1) { //mouse event 

				if(e1.getModifiers()==e1.BUTTON3_MASK)  //1:left  2:middle

					clo1.previous(f1);

				else

					clo1.next(f1);

			}
			

		}

		pan1.addMouseListener(new Selpan()); //�̺�Ʈ���� 

		pan2.addMouseListener(new Selpan());

		pan3.addMouseListener(new Selpan()); //�ٽ� ���⼭ run���� ����, ���� ����~~~
		//�̰��� ��� �ǿ� ������ ���� ���̴�.
		//�� ������ �����츦 �ݴ� �޼ҵ带 �־�� �Ѵ�.
		//������ �г��� �Ѳ����� ������ ���̱� ������ frame�� ������� ��� ���־�� �Ѵ�.
		
	}

	

	public static void main(String args[]) 

	{

		//CardLayoutMainClass.java

		CardLayoutMain flc1=new CardLayoutMain();

		

	}

}

