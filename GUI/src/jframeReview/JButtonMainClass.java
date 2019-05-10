package jframeReview;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class JButtonClass extends JFrame implements ActionListener
{
    private JLabel jl1 = new JLabel("YOUNG 방송국 주관");
    private JLabel jl2 = new JLabel("비담 선발대회");
    private JLabel jl3 =new JLabel("잘한 코너는");

    private JButton jb1 = new JButton("노래 10점");
    private JButton jb2 = new JButton("댄스 20점");
    private JButton jb3 = new JButton("영어웅변 30점");
    private JButton jb4 = new JButton("철인삼종격기100점");
    private JButton jb5 = new JButton("미로탈출 90점");
    private JButton jb6 = new JButton("개그 80점");
    private JButton jb7 = new JButton("눌러요");
    private JButton jb8 = new JButton("취소");
    String hangmok="";
    int jum=0;

    public JButtonClass()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0,3,30,30));

        jl1.setFont(new Font("굴림",Font.ITALIC,25));
        jl2.setFont(new Font("굴림",Font.ITALIC,25));
        jl3.setFont(new Font("굴림",Font.ITALIC,25));
        jb7.setFont(new Font("굴림",Font.ITALIC,30));
        jb8.setFont(new Font("굴림",Font.ITALIC,30));

        jb7.setForeground(Color.red);
        jb7.setBackground(Color.cyan);
        jb8.setForeground(Color.blue);
        jb8.setBackground(Color.yellow);

        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        jb6.addActionListener(this);
        jb7.addActionListener(this);
        jb8.addActionListener(this);



        this.add(jl1);
        this.add(jl2);
        this.add(jl3);
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
        this.add(jb4);
        this.add(jb5);
        this.add(jb6);
        this.add(jb7);
        this.add(jb8);


        this.setTitle("YOUNG");
        this.setSize(800,800);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb1)
        {
            hangmok+=jb1.getText()+"\n";
            jum=jum+10;
        }
        if(e.getSource()==jb2)
        {
            hangmok+=jb2.getText()+"\n";
            jum=jum+20;
        }
        if(e.getSource()==jb3)
        {
            hangmok+=jb3.getText()+"\n";
            jum=jum+30;
        }
        if(e.getSource()==jb4)
        {
            hangmok+=jb4.getText()+"\n";
            jum=jum+100;
        }
        if(e.getSource()==jb5)
        {
            hangmok+=jb5.getText()+"\n";
            jum=jum+90;
        }
        if(e.getSource()==jb6)
        {
            hangmok+=jb6.getText()+"\n";
            jum=jum+80;
        }
        if(e.getSource()==jb7)
        {
            String msg1 = hangmok+"총점수는"+String.valueOf(jum)+"점";
            JOptionPane.showMessageDialog(jb7,msg1);
            hangmok="";
            jum=0;
        }
        if(e.getSource()==jb6)
        {
            JOptionPane.showMessageDialog(jb8,"취소 하였습니다.");
            hangmok="";
            jum=0;
        }

    }
}

public class JButtonMainClass {
    public static void main(String[] args)
    {
        new JButtonClass();
    }
}
