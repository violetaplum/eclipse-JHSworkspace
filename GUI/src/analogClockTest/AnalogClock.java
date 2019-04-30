package analogClockTest;

import frameTest.Frame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
//������ PI : ���� �ѷ��� �������� ���� ��
// �������� 1�̸� �ݿ��� �ѷ��� PI�� ��
//��,PI�� 180����
//�׷��Ƿ� Math.PI/180 = 1���� ��  

//�����̴� ������ �߿��ϴ�
//��ħ�� 1�ʿ� ��� ���°�? -> 6��

class ClockGUI2 extends Frame implements ActionListener
{
    //GUI
    private Button b1 = new Button("Hello");
    static int r1,cX,cY,sooX,sooY,secX, secY, minX, minY, hourX, hourY;
    static int si,boon,cho; //�������� ����� ������ �ؿ��� �ٷιٷ� ����ϱ� ���ؼ�

    public ClockGUI2()
    {
        this.setLayout(null);

         b1.setSize(100,70);
         b1.setForeground(new Color(0,0,255));
         b1.setBackground(new Color(255,180,100));
         b1.setFont(new Font("����",Font.BOLD,20));
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
