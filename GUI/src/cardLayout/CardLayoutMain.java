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

	  f1=new Frame("��~~~�������̶���");//////////

	  clo1=new CardLayout(); ////////////

	  f1.setLayout(clo1); //ī��������  ��ġ



	  pan1=new Panel();

	  pan1.setBackground(Color.red);

	  f1.add(pan1,"pan1"); //pan1�� ������ "pan1"



	  pan2=new Panel();

	  pan2.setBackground(Color.yellow);

	  f1.add(pan2,"pan2");

<<<<<<< HEAD
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
	Panel pan3;

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

		clo1.show(f1, "pan3");
=======


	  pan3=new Panel();

	  pan3.setBackground(Color.blue);

	  f1.add(pan3,"pan3");



	  clo1.show(f1, "pan3"); //3���� ī���� �ʱ⿡ ���̴� ���� pan3 ������ �Ķ��� �г�


>>>>>>> ac270a17bafd1375eaaad435f837e9662afb1f24

		f1.setSize(700,700);

		f1.setVisible(true);
<<<<<<< HEAD
		addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e)
					{
						dispose();
						System.exit(0);
					}
				});


		class Selpan extends MouseAdapter{
			public void mouseCliked(MouseEvent e) {
				if(e.getModifiers() == e.BUTTON2_MASK) {
=======

		f1.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e1)
			{
				dispose();
				System.exit(0);

			}
		});
		//������ �ǳ��� �Ѳ����� ������ ���̱� ������ frame�� �������� ���� ���־��� �Ѵ�.
		//�ٸ� ������ �ǳ����� Frame���� ǥ������ �ʾƵ� ������ �̰��� ���쿡�� ���� �� ������ �ݾƾ��� �� �𸣹Ƿ� Frame�� �ο��Ѵ�.
		//�ǳ��� �ݴ� ���� �ƴ� Frame�� �ݾƾ� �Ѵٴ� �Ϳ� ����!!
		//��ġ�� �߿���

		//�ϴ� ���⼭ run �غ��ڴ� ~~~~~~~



		class Selpan extends MouseAdapter{

			//�̺�Ʈ ó���Լ� //event handler


			public void mouseClicked(MouseEvent e1) { //mouse event

				if(e1.getModifiers()==e1.BUTTON3_MASK)  //1:left  2:middle

>>>>>>> ac270a17bafd1375eaaad435f837e9662afb1f24
					clo1.previous(f1);

				else

					clo1.next(f1);

			}


		}
<<<<<<< HEAD
		pan1.addMouseListener(new Selpan());
		pan2.addMouseListener(new Selpan());
		pan3.addMouseListener(new Selpan());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
=======

		pan1.addMouseListener(new Selpan()); //�̺�Ʈ����

		pan2.addMouseListener(new Selpan());

		pan3.addMouseListener(new Selpan()); //�ٽ� ���⼭ run���� ����, ���� ����~~~
		//�̰��� ���� �ǿ� ������ ���� ���̴�.
		//�� ������ �����츦 �ݴ� �޼ҵ带 �־��� �Ѵ�.
		//������ �г��� �Ѳ����� ������ ���̱� ������ frame�� �������� ���� ���־��� �Ѵ�.

	}



	public static void main(String args[])

	{

		//CardLayoutMainClass.java
>>>>>>> ac270a17bafd1375eaaad435f837e9662afb1f24

		CardLayoutMain flc1=new CardLayoutMain();



	}

}
