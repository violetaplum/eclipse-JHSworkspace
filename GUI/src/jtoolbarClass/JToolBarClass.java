package jtoolbarClass;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JToolBarClass2 extends JFrame implements ActionListener
{
    private JButton jbutton1, jbutton2, jbutton3, jbutton4, jbutton5;
    private JLabel jLabel1;
    private JToolBar jtoolbar1;
    public JToolBarClass2()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        jtoolbar1 = new JToolBar();
        jbutton1 = new JButton("red",new ImageIcon("E:/cat1.png"));
        jbutton1.setSize(20,20);
        jbutton1.addActionListener(this);

        jbutton2 = new JButton("green",new ImageIcon("E:/cat2.png"));
        jbutton2.setSize(20,20);
        jbutton2.addActionListener(this);

        jbutton3 = new JButton("30font",new ImageIcon("E:/font1.png"));
        jbutton3.setSize(20,20);
        jbutton3.addActionListener(this);

        jbutton4 = new JButton("50font",new ImageIcon("E:/font2.png"));
        jbutton4.setSize(20,20);
        jbutton4.addActionListener(this);

        jbutton5 = new JButton("exit",new ImageIcon("E:/exit.png"));
        jbutton5.setSize(20,20);
        jbutton5.addActionListener(this);

        jtoolbar1.add(jbutton1);
        jtoolbar1.add(jbutton2);
        jtoolbar1.add(jbutton3);
        jtoolbar1.add(jbutton4);
        jtoolbar1.add(jbutton5);

        jtoolbar1.setVisible(true);
        this.add(jtoolbar1);
        jLabel1 = new JLabel("JToolBar·Î ¸ÚÁö°Ô µðÀÚÀÎ ÇÏ¶ó´Â~~~");
        add(jLabel1);

        this.setSize(1000,700);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jbutton1)
        {
            jLabel1.setForeground(Color.red);

        }
        else if(e.getSource()==jbutton2)
        {
            jLabel1.setForeground(Color.green);

        }
        else if(e.getSource()==jbutton3)
        {
            jLabel1.setFont(new Font("±¼¸²",Font.BOLD,30));
        }
        else if(e.getSource()==jbutton4)
        {
            jLabel1.setFont(new Font("±¼¸²",Font.BOLD,50));

        }
        else if(e.getSource()==jbutton5)
        {
            System.exit(0);
        }
    }
}

public class JToolBarClass {
    public static void main(String[] args)
    {
        new JToolBarClass2();
    }

}
