package jbuttonClass;
import javax.swing.*;
import java.awt.*;

public class JButtonClass extends JFrame {
    //â���� �⺻���� ����
    //���۾����� �ۼ��� swing
    //window builder �÷����� �Ǿ� ������ ����-Open With-window builder editor�� ���� ����
    public JButtonClass()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jp1 = new JPanel();
        JButton jb1 = new JButton("Apple");
        JButton jb2 = new JButton("Pear");
        JButton jb3 = new JButton("Persimmon");
        jp1.add(jb1);
        jp1.add(jb2);
        jp1.add(jb3);
        getContentPane().add(jp1);
    }
    public static void main(String[] args)
    {
        JButtonClass jbc1 = new JButtonClass();
        jbc1.setTitle("��ư�̾�");
        jbc1.setSize(300,200);
        jbc1.setLayout(new GridLayout(3,5));
        jbc1.setVisible(true);
    }
}
