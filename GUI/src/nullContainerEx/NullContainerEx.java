package nullContainerEx;
import java.awt.*;
import javax.swing.*;

public class NullContainerEx extends JFrame{
    public NullContainerEx()
    {
        setTitle("Null Container Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        //new FlowLayout(); : 중앙정렬과 hGap=5,vGap=5인 배치관리자
        //new FlowLayout(FlowLayout.LEFT); : 왼쪽정렬과 hGap=5, vGap=5인 배치관리자
        //new FlowLayout(FlowLayout.LEFT,10,20); : 중앙정렬, hGap=10,vGap=20인 배치관리자

        JLabel la = new JLabel("Hello, Press Buttons!");
        /*la.setLocation(130,50);*/
        la.setSize(200,20);
        c.add(la);

        for(int i=0;i<=9;i++)
        {
            JButton  b = new JButton(Integer.toString(i));
            b.setLocation(i*15,i*15);
            b.setSize(50,20);
            c.add(b);
        }
        setSize(300,200);
        setVisible(true);

    }
    public static void main(String[] args)
    {
        new NullContainerEx();
    }
}
