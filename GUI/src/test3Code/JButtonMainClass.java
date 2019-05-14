package test3Code;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.*;

class JButtonClass extends JFrame implements ActionListener{

    private	JLabel jl1 = new JLabel("���� ���� �ܹ��� �Դϴ�");
    private	JLabel jl2 = new JLabel("��� �޴��� �����ϼ���");
    private	JButton jb1 = new JButton("�ſ� �ҽ� �ܹ���  : 5000");
    private	JButton jb2 = new JButton("���� ���� �ܹ���  : 7000");
    private	JButton jb3 = new JButton("��ä�����ܹ���    : 4500");
    private	JButton jb4 = new JButton("�����丶���ܹ��� :  5500");
    private	JLabel  jl3 = new JLabel("�޴������� �� ���̸� �����Ͻø� 10%���ε˴ϴ� ==>");
    private	String[] age1={"10��", "20��", "30���̻�"};
    private	JComboBox jcb1=new  JComboBox(age1);

    private   JButton jb5 = new JButton("�ֹ��մϴ�");
    private	JButton jb6 = new JButton("����մϴ�");


    private List<Integer> al = new ArrayList<>();


    String joomoon1="";
    String msg1;
    int hap=0;
    int haphalin;
    int cnt=0;
    int sw=0;

    public JButtonClass() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2, 50, 50));
        jl1.setFont(new Font("����",Font.BOLD,25));
        jl2.setFont(new Font("����",Font.BOLD,25));
        jb1.setFont(new Font("����",Font.BOLD,20));
        jb2.setFont(new Font("����",Font.BOLD,20));
        jb3.setFont(new Font("����",Font.BOLD,20));
        jb4.setFont(new Font("����",Font.BOLD,20));
        jb5.setFont(new Font("����",Font.BOLD,20));
        jb6.setFont(new Font("����",Font.BOLD,20));
        jb5.setBackground(Color.orange);
        jb6.setBackground(Color.yellow);

        al.add(12);
        al.add(2153);
        al.add(29);
        al.add(230);
        al.add(345);
        al.add(25);

        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+"\t");
        }
        System.out.println();
        Collections.reverse(al);
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+"\t");
        }



        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        jb6.addActionListener(this);
        jcb1.addActionListener(this);

        add(jl1);
        add(jl2);
        add(jb1);
        add(jb2);
        add(jb3);
        add(jb4);
        add(jl3);
        add(jcb1);
        add(jb5);
        add(jb6);

        ArrayList<Component> array = new ArrayList<>();
        array.add(jl1);
        array.add(jl2);
        array.add(jb1);
        array.add(jb2);
        array.add(jb3);
        array.add(jb4);
        array.add(jl3);
        array.add(jcb1);
        array.add(jb5);
        array.add(jb6);
        Collections.reverse(array);
        for(int i=0;i<array.size();i++)
        {
            
        }




        setTitle("������� ���� �����Դϴ�");
        setSize(700, 700);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==jb1) {
            joomoon1+=jb1.getText()+"\n";
            hap=hap+5000;
            cnt++;
        }
        if(e.getSource()==jb2) {
            joomoon1+=jb2.getText()+"\n";
            hap=hap+7000;
            cnt++;
        }
        if(e.getSource()==jb3) {
            joomoon1+=jb3.getText()+"\n";
            hap=hap+4500;
            cnt++;
        }
        if(e.getSource()==jb4) {
            joomoon1+=jb4.getText()+"\n";
            hap=hap+5500;
            cnt++;
        }
        if(e.getSource()==jcb1) {
            JOptionPane.showMessageDialog(null,(String) jcb1.getSelectedItem()+"�̽ñ���");
            haphalin=hap-(int)(hap*0.1);
            sw=1;
        }
        if(e.getSource()==jb5) {
            if(sw==1) {
                msg1=joomoon1+"�ѱݾ�:"+String.valueOf(hap)+ "��"+"\n"+"���ε��ѱݾ�:"+String.valueOf(haphalin)+ "��"+"\n"+"���ֹ�����:"+String.valueOf(cnt)+ "��";
                JOptionPane.showConfirmDialog(jb5,msg1,"�޼���",JOptionPane.OK_CANCEL_OPTION);
            }
            else {
                msg1=joomoon1+"�ѱݾ�:"+String.valueOf(hap)+ "��"+"\n"+"���ֹ�����:"+String.valueOf(cnt)+ "��";
                int num=JOptionPane.showConfirmDialog(jb5,msg1,"�޼���",JOptionPane.OK_CANCEL_OPTION);
                if(num==JOptionPane.YES_OPTION)
                {
                    JOptionPane.showMessageDialog(jb5,"�ֹ��Ϸ�","�޼���",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(jb5,"�ֹ����� �ʾҽ��ϴ�","�޼���",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            joomoon1="";
            hap=0;
            haphalin=0;
            cnt=0;
            sw=0;

        }
        if(e.getSource()==jb6) {

            JOptionPane.showMessageDialog(jb6,"��ҵǾ����ϴ�");
            joomoon1="";
            hap=0;
            haphalin=0;
            cnt=0;
            sw=0;
        }

    }
}
public class JButtonMainClass {
    public static void main(String args[]) {
        new JButtonClass();

    }
}

