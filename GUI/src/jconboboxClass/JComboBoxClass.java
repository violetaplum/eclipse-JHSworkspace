package jconboboxClass;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
class JComboBox2 extends JFrame implements ActionListener
{
    String[] kwail = {"Apple","Pear","Persimmon"};
    JComboBox jcb1 =  new JComboBox(kwail);
    /*JComboBox jcb1;*/
    public JComboBox2()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        /*JComboBox jcb1 =  new JComboBox(kwail);*/
        this.add(jcb1);
       /* jcb1.addItemListener(new ItemListener() { //comboBox�� �ִ� �������� ������ ���� �̺�Ʈ ó��
            @Override
            public void itemStateChanged(ItemEvent e) {
            JOptionPane.showMessageDialog(null,(String)jcb1.getSelectedItem());
            //System.out.println((String)jcb1.getSelectedItem());
            }
        });*/

        this.setSize(500,500);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public void itemStateChanged(ItemEvent e)
    {
        JOptionPane.showMessageDialog(null,(String)jcb1.getSelectedItem()); //�� �ȿ� ���ڰ� ����ִ��� �� �𸣴� �̶�
        //����ȯ �����ָ� �ȴ�.
    }
}

public class JComboBoxClass {
    public static void main(String[] args)
    {
        new JComboBox2();
    }
}
