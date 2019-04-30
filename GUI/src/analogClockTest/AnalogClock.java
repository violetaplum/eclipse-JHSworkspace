package analogClockTest;

import frameTest.Frame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
//원주율 PI : 원의 둘레를 지름으로 나눈 값
// 반지름이 1이면 반원의 둘레는 PI가 됨
//즉,PI는 180도임
//그러므로 Math.PI/180 = 1도의 값  

//움직이는 각도가 중요하다
//초침은 1초에 몇도가 가는가? -> 6도

class ClockGUI2 extends Frame implements ActionListener
{
    //GUI
    private Button b1 = new Button("Hello");
    static int r1,cX,cY,sooX,sooY,secX, secY, minX, minY, hourX, hourY;
    static int si,boon,cho; //전역으로 사용한 이유는 밑에서 바로바로 사용하기 위해서

    public ClockGUI2()
    {
        this.setLayout(null);

         b1.setSize(100,70);
         b1.setForeground(new Color(0,0,255));
         b1.setBackground(new Color(255,180,100));
         b1.setFont(new Font("돋음",Font.BOLD,20));
         b1.setLocation(50,50);
         this.add(b1);
         b1.addActionListener(this);

         this.setBackground(new Color(255,255,0));
         this.setTitle("Java is fun");
         this.setSize(1100,1000);
         this.setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e1)
            {
                dispose();
                System.exit(0);

            }
        });
    }

    public void paint(Graphics g)
    {
        Date d1 = new Date();
        si = d1.getHours();
        boon = d1.getMinutes();
        cho = d1.getSeconds();

        g.setColor(Color.WHITE);
        g.fillOval(300,300,500,500);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}

public class AnalogClock {
    public static void main(String[] args)
    {
        ClockGUI2 gg= new ClockGUI2();
    }
}
