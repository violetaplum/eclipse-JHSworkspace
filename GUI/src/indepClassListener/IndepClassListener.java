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
    {//������ Ŭ������ �̺�Ʈ ������ ��

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource(); //�̺�Ʈ �ҽ� ��ư �˾Ƴ���
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
