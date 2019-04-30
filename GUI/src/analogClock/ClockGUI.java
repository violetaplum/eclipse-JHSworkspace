package analogClock;

import java.awt.BasicStroke;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//������ PI : ���� �ѷ��� �������� ���� ��
//�������� 1�̸� �ݿ��� �ѷ��� PI�� ��
//��,PI�� 180����
//�׷��Ƿ� Math.PI/180 = 1���� ��  

//�����̴� ������ �߿��ϴ�
//��ħ�� 1�ʿ� ��� ���°�? -> 6��

class ClockGUI2 extends Frame implements ActionListener{
	private Button b1=new Button("click!");
	static int r1,cX,cY,sooX,sooY,secX,secY,minX,minY,hourX,hourY;//�� �ؿ��� �� ����ϱ� ����

	static int si,boon,cho;
	public ClockGUI2() {
		
		this.setLayout(null);
		b1.setSize(100,70);
		b1.setForeground(new Color(0,0,255));
		b1.setBackground(new Color(255,180,180));
		b1.setFont(new Font("����", Font.BOLD,20));
		b1.setLocation(50,50);
		this.add(b1);
		b1.addActionListener(this);
		this.setBackground(new Color(255,255,0));
		this.setTitle("Clock");
		this.setSize(1100, 1000);
		this.setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e1) {
				dispose();//�����ڰ� ��ǻ�Ϳ� �ִ� �޸𸮸� ���������°�
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g) //�׸��׸��� ���°�
	{
		Date d1=new Date();
		si=d1.getHours();
		boon=d1.getMinutes();
		cho=d1.getSeconds();
		g.setColor(Color.ORANGE); //Graphics.setColor(Color.color);
		g.fillOval(300, 300, 500, 500);
		//Graphics.fillOval( x, y, w, h) : ���� �׷��� ���� ä���ش�. ���� ���ڸ��� �߽���ǥ (x,y), ������ �ΰ��� �ʺ�,���� ��� �� x,y�� ���� ���� ����� ���� ���̱� ������ ���߿� ���� �߽��� ���ؾ� �Ѵ�.
		//����� �߾ӿ� �Ͼ�� ǥ�ø� �ϱ� ���� ��ġ
		
		r1=200; //�������� 200���� ����
		cX=300+500/2;//���� ������ 500�̹Ƿ� ���ʻ���� x��ǥ�� �������� �����ָ� ���� �߽��� ���´�.
		cY = 300+500/2;	
		
		g.setFont(new Font("����",Font.BOLD,42)); //Graphics.setFont(new Font("font",Font.BOLD,42);
		g.setColor(Color.blue); //Graphics.setColor(Color.color);
		
		for(int i=1;i<=12;i++)
		{					//���������� ���� ª�� 180�� ��				//Math.PI/180 �� �ϸ� 1���� ���´�.
			sooX = cX+(int)(180*Math.sin(i*30*Math.PI/180)); //������ ��ħ�̵� ��ħ�̵��� ���� �����κ����� ��ġ�� ���ϱ� ����
															//sin,cos�� �ʿ��ϰ� �ȴ�.
			sooY = cY-(int)(180*Math.cos(i*30*Math.PI/180));//�ϳ��� ���ڸ��� 30���� ������ ���̹Ƿ� 30*i�� �ȴ�.
			//��ǥ������ �ٲٱ� ������ �Ϲ����� cos,sin�� �ݴ�� ���� �����
			
			
			
			
			g.drawString(/*""+i*/String.valueOf(i),sooX-13,sooY+10); //Graphics.drawString(����,x,y) : i�� x,y��ǥ�� �׸��� �׷���
		}						//���ȿ� �׸��� �׸��µ� �������� �� ���� �����Ƿ� �߰����� ����.
								//""+���� --> ���ڿ��� �Ľ̵ȴ�.
		
		
		secX = cX+(int)(180*Math.sin(cho*6*Math.PI/180));//��ħ�� ���� ������� �����̴����� �߿�
		secY = cY-(int)(180*Math.cos(cho*6*Math.PI/180));//1�� ������ 6���� ���������Ѵ�.
		//��ǥ������ �ٲٱ� ������ �Ϲ����� cos,sin�� �ݴ�� ���� �����
		
		
		Graphics2D g2d = (Graphics2D)g; //Graphics2D gg = (Graphics2D)Graphics : Graphics2D�� Graphics�� �Ľ��Ͽ� ������ �� �ִ�.
		g2d.setStroke(new BasicStroke(3));
		//Graphics2D.setStroke(new BasicStroke(int));
		//���� ���⸦ 3���� ������
		g.setColor(Color.black);
		g.drawLine(cX,cY,secX,secY); //���� �׷��ֱ� ���ؼ��� Graphics2D Ŭ������ �ʿ�������.
		//Graphics.drawLine(����X,����Y,��X,��Y);
		//Graphics,Graphics2D�� ȥ������ ����.
		
		minX = cX+(int)(140*Math.sin((boon*6+cho/2)*Math.PI/180));//��ħ���̴� ��ħ���� ª���Ϸ� 150����
		minY = cY-(int)(140*Math.cos((boon*6+cho/2)*Math.PI/180));
		g.setColor(Color.cyan);
		g.drawLine(cX, cY, minX, minY);
		//boon*6�� ���� (1 -60���̹Ƿ�)*6=360������

		hourX = cX+(int)(110*Math.sin((si*30+boon/2)*Math.PI/180));
		hourY = cY-(int)(110*Math.cos((si*30+boon/2)*Math.PI/180));
		//��ħ�� �ð��� ������ ��� ��ȭ�ϴ� ���� õõ�� �����ִ� ������� ������
		//��ħ, ��ħ���� �޸� �ѹ��� �����̴� ������ �ʹ� ũ�� ����
		g.setColor(Color.magenta);
		g.drawLine(cY, cY, hourX, hourY);
		
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b1)
	{
		b1.setEnabled(false);
		Timer t1 = new Timer();
		t1.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				repaint(); //1�� ���� �ٽ� �׷��ش�.
			}
		},0,1000);
	}
}
}
public class ClockGUI  extends ClockGUI2 {

	public static void main(String[] args) {


		ClockGUI2 bb=new ClockGUI2();
	}

}
