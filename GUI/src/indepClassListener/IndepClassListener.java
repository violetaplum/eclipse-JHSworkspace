package indepClassListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class IndepClassListener extends JFrame {
    public IndepClassListener()
    {
        setTitle("Action Event Listener Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());
        c.add(btn);

        setSize(350,150);
        setVisible(true);
    }

    class MyActionListener implements ActionListener
    {//독립된 클래스로 이벤트 리스너 작

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource(); //이벤트 소스 버튼 알아내기
            if(b.getText().equals("Action"))
            {
                b.setText("Action!!!!");
            }
            else
            {
                b.setText("Action");
            }
        }
    }
    public static void main(String[] args)
    {
        new IndepClassListener();
    }
}
