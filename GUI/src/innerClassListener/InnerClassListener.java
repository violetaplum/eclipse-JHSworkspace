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
        btn.addActionListener(new MyActionListener()); //��ư�� �׼Ǹ����� �ޱ�
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
                //InnerClassListener�� ����� JFrame�� ����� ȣ���� �� ����
                InnerClassListener.this.setTitle(b.getText());
                //�������� Ÿ��Ʋ�� ��ư ���ڿ��� ����Ѵ�.
            }
        }
    }
    public static void main(String[] args)
    {
        new InnerClassListener();
    }
}
