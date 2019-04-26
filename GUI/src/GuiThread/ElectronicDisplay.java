package GuiThread;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;

class EDisplay extends Frame implements ActionListener//ActionEvent�� �˾Ƶ�� ����
{
	static int sw=0;
	static String s1 = "                  I LOVE YOU";
	Timer t1 = new Timer();
	
	private Button b1 = new Button("Starts");
	private Button b2 = new Button("Ends");
	private TextField tf1 = new TextField();//�̰Ŵ� ��ĭ. ���ڸ��� �� s1�� ����ؾ���
	public EDisplay()
	{
		this.setLayout(null);
		b1.setSize(200,70);
		b1.setForeground(new Color(0,0,255));
		b1.setBackground(new Color(255,180,100));
		b1.setFont(new Font("����",Font.BOLD,20));
		b1.setLocation(150,200);
		this.add(b1);
		b1.addActionListener(this);
		
		b2.setSize(200,70);
		b2.setForeground(new Color(0,0,255));
		b2.setBackground(new Color(255,180,100));
		b2.setFont(new Font("����",Font.BOLD,20));
		b2.setLocation(150,300);
		this.add(b2);
		b2.addActionListener(this);
		
		tf1.setSize(400,50);
		tf1.setForeground(new Color(0,0,255));
		tf1.setBackground(new Color(255,255,0));
		tf1.setFont(new Font("����",Font.BOLD,20));
		tf1.setLocation(30,70);//�ؽ�Ʈ ���� ��ġ
		this.add(tf1);
		
		this.setBackground(new Color(0,200,0));
		this.setTitle("�ڹٴ� ������վ�");
		this.setSize(460, 400);//������ ũ��
		this.setVisible(true);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e1)
			{
				dispose();
				System.exit(0);
				
			}
		}); // ������ �ݾ��ִ�ģ��
		
	}//������ End

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==b1&&sw==0)
		{
			b1.setEnabled(false);
			t1.scheduleAtFixedRate(	//t1.schedule(){} �� �ص� �ȴ�.
					new TimerTask() //TimerTask() : ����Ǿ��� ������ run�� �̿��� �������ش�.
			{
				public void run()
				{
					try
					{
						s1 = s1.substring(1,s1.length())+s1.substring(0,1);//s1�� �������༭ ��� ���ư��� �޼ҵ尡 �����ȴ�.
						tf1.setText(s1);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}//run() ends
				
			},0,20);//schedule ends
			//new TimerTask(ó���ҳ���,delay,period(����)); --> ������ �۰� ������ ���ڰ� ������ ��������.
			//delay�� ���� ���� ������
		}//if ends
		
		sw=1;
		
		if(e.getSource()==b2)
		{
			t1.cancel();
		}
		
		
	}//ActionListener�� �޾����� �̰Ŵ� �׳� �ڵ����� �����ϰԲ� �Ѵ�.
}

public class ElectronicDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EDisplay ed1 = new EDisplay();
	}

}
