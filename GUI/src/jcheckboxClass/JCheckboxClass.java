package jcheckboxClass;
import javax.swing.*;
import java.awt.*;

public class JCheckboxClass extends JFrame {
    public JCheckboxClass()
    {
        JPanel jp1 = new JPanel();
        //Panel�� �⺻������ FlowLayout�̰� �߾������̴�.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JCheckBox jcb1 = new JCheckBox("ȸ��ī�庸��",false);
        JCheckBox jcb2 = new JCheckBox("���ȸ��",false);
        JCheckBox jcb3 = new JCheckBox("�ؿܿ����û����",false);
        jp1.add(jcb1);
        jp1.add(jcb2);
        jp1.add(jcb3);

        getContentPane().add(jp1);//�������� contentpane�� �˾Ƴ� �� ������Ʈ ����
        //������ = �޴��� + content pane(���� ������Ʈ�鿡 �� ��)
        //Label, Button���� ����.
        //������ �˾Ƴ� �Ŀ� add()�Ѵ�.


    }
    public static void main(String[] args)
    {
        JCheckboxClass jcbc1 = new JCheckboxClass();
        jcbc1.setTitle("CheckBox!!");
        jcbc1.setSize(300,500);
        jcbc1.setVisible(true);
    }
}
