package jcheckboxClass;

import javax.swing.*;
import java.awt.*;

public class JCheckboxTest extends JFrame{
    public JCheckboxTest()
    {
        JPanel jp1 = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JCheckBox jcb1 = new JCheckBox("ȸ��ī�庸��", false);
        JCheckBox jcb2 = new JCheckBox("���ȸ��",false);
        JCheckBox jcb3 = new JCheckBox("�ؿܿ����û����", false);

        jp1.setLayout(new FlowLayout());
        jp1.add(jcb1);
        jp1.add(jcb2);
        jp1.add(jcb3);

        getContentPane().add(jp1);
    }
    public static void main(String[] args)
    {
        JCheckboxTest jcbc1 = new JCheckboxTest();
        jcbc1.setTitle("CheckBox!");
        jcbc1.setSize(300,500);
        jcbc1.setVisible(true);

    }
}