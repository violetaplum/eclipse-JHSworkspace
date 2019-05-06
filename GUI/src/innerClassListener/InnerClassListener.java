package innerClassListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassListener extends JFrame {
    public InnerClassListener()
    {
        setTitle("Action Listener Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener()); //버튼에 액션리스터 달기
        c.add(btn);

        setSize(350,150);
        setVisible(true);
    }
    private class MyActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            if(b.equals("Action"))
            {
                b.setText("Action!?!?!?");
            }
            else
            {
                b.setText("Action");
                //InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
                InnerClassListener.this.setTitle(b.getText());
                //프레임의 타이틀에 버튼 문자열을 출력한다.
            }
        }
    }
    public static void main(String[] args)
    {
        new InnerClassListener();
    }
}
