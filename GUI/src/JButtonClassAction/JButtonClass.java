package JButtonClassAction;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JButtonClass extends JFrame implements ActionListener {
    JButton jb1;

    public JButtonClass()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jb1 = new JButton("Press the Button!",new ImageIcon("E:/bb.jpg"));
        jb1.setFont(new Font("±¼¸²",Font.BOLD,32));
        jb1.setBackground(Color.magenta);

        jb1.addActionListener(this);

        getContentPane().add(jb1);
        setVisible(true);
        setSize(1000,1000);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        jb1.setIcon(new ImageIcon("E://aa.jpg"));
        jb1.setText("Have a nice day!!");
        jb1.setFont(new Font("±¼¸²",Font.BOLD,22));
        jb1.setBackground(Color.ORANGE);
    }
    public static void main(String[] args)
    {
        new JButtonClass();
    }
}
