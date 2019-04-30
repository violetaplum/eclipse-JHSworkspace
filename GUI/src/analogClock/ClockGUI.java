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

//원주율 PI : 원의 둘레를 지름으로 나눈 값
//반지름이 1이면 반원의 둘레는 PI가 됨
//즉,PI는 180도임
//그러므로 Math.PI/180 = 1도의 값  

//움직이는 각도가 중요하다
//초침은 1초에 몇도가 가는가? -> 6도

class ClockGUI2 extends Frame implements ActionListener{
	private Button b1=new Button("click!");
	static int r1,cX,cY,sooX,sooY,secX,secY,minX,minY,hourX,hourY;//이 밑에서 다 사용하기 위해

	static int si,boon,cho;
	public ClockGUI2() {
		
		this.setLayout(null);
		b1.setSize(100,70);
		b1.setForeground(new Color(0,0,255));
		b1.setBackground(new Color(255,180,180));
		b1.setFont(new Font("돋움", Font.BOLD,20));
		b1.setLocation(50,50);
		this.add(b1);
		b1.addActionListener(this);
		this.setBackground(new Color(255,255,0));
		this.setTitle("Clock");
		this.setSize(1100, 1000);
		this.setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e1) {
				dispose();//개발자가 컴퓨터에 있는 메모리를 날려버리는것
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g) //그림그릴때 쓰는것
	{
		Date d1=new Date();
		si=d1.getHours();
		boon=d1.getMinutes();
		cho=d1.getSeconds();
		g.setColor(Color.ORANGE); //Graphics.setColor(Color.color);
		g.fillOval(300, 300, 500, 500);
		//Graphics.fillOval( x, y, w, h) : 원을 그려서 값을 채워준다. 앞의 두자리는 중심좌표 (x,y), 나머지 두개는 너비,높이 사실 이 x,y는 원의 왼쪽 상단을 찝은 것이기 때문에 나중에 실제 중심을 구해야 한다.
		//노란색 중앙에 하얀색 표시를 하기 위한 장치
		
		r1=200; //반지름을 200으로 정함
		cX=300+500/2;//원의 지름이 500이므로 왼쪽상단의 x좌표에 반지름을 더해주면 실제 중심이 나온다.
		cY = 300+500/2;	
		
		g.setFont(new Font("굴림",Font.BOLD,42)); //Graphics.setFont(new Font("font",Font.BOLD,42);
		g.setColor(Color.blue); //Graphics.setColor(Color.color);
		
		for(int i=1;i<=12;i++)
		{					//반지름보다 조금 짧은 180을 함				//Math.PI/180 을 하면 1도가 나온다.
			sooX = cX+(int)(180*Math.sin(i*30*Math.PI/180)); //원에서 분침이든 시침이든지 간에 원으로부터의 위치를 정하기 위해
															//sin,cos이 필요하게 된다.
			sooY = cY-(int)(180*Math.cos(i*30*Math.PI/180));//하나의 숫자마다 30도씩 움직인 것이므로 30*i가 된다.
			//좌표값으로 바꾸기 때문에 일반적인 cos,sin의 반대로 논리가 적용됨
			
			
			
			
			g.drawString(/*""+i*/String.valueOf(i),sooX-13,sooY+10); //Graphics.drawString(내용,x,y) : i를 x,y좌표에 그림을 그려라
		}						//원안에 그림을 그리는데 한쪽으로 쏠릴 수가 있으므로 추가해준 것임.
								//""+숫자 --> 문자열로 파싱된다.
		
		
		secX = cX+(int)(180*Math.sin(cho*6*Math.PI/180));//초침이 갈때 몇도단위로 움직이는지가 중요
		secY = cY-(int)(180*Math.cos(cho*6*Math.PI/180));//1초 갈때씩 6도씩 움직여야한다.
		//좌표값으로 바꾸기 때문에 일반적인 cos,sin의 반대로 논리가 적용됨
		
		
		Graphics2D g2d = (Graphics2D)g; //Graphics2D gg = (Graphics2D)Graphics : Graphics2D는 Graphics를 파싱하여 정해줄 수 있다.
		g2d.setStroke(new BasicStroke(3));
		//Graphics2D.setStroke(new BasicStroke(int));
		//선의 굵기를 3으로 정해줌
		g.setColor(Color.black);
		g.drawLine(cX,cY,secX,secY); //선을 그려주기 위해서는 Graphics2D 클래스가 필요해진다.
		//Graphics.drawLine(시작X,시작Y,끝X,끝Y);
		//Graphics,Graphics2D를 혼동하지 말자.
		
		
		//secX = cX+(int)((r1-10)*Math.cos(Math.PI/2-cho*(Math.PI/30)));
		//secY = cY-(int)((r1-10)*Math.sin(Math.PI/2-cho*(Math.PI/30)));
		//이 방식으로 하면 cos,sin이 뒤바뀌지 않아도 된다.
		
		minX = cX+(int)(140*Math.sin((boon*6+cho/10)*Math.PI/180));//분침길이는 초침보다 짧게하려 150으로
		minY = cY-(int)(140*Math.cos((boon*6+cho/10)*Math.PI/180));
		g.setColor(Color.cyan);
		g.drawLine(cX, cY, minX, minY);
		//boon*6은 각도 (1 -60분이므로)*6=360도까지

		hourX = cX+(int)(110*Math.sin((si*30+boon/2)*Math.PI/180));
		hourY = cY-(int)(110*Math.cos((si*30+boon/2)*Math.PI/180));
		//시침은 시간이 갈수록 계속 변화하는 것을 천천히 보여주는 방식으로 구현됨
		//분침, 초침과는 달리 한번에 움직이는 각도가 너무 크기 때문
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
				repaint(); //1초 마다 다시 그려준다.
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
