package listClass;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;

public class ListTest extends Frame {
    public static void main(String[] args)
    {
        ListClass lc1 =new ListClass();
        lc1.setTitle("����Ʈ Ŭ����");
        lc1.setLayout(new FlowLayout());
        List list1 = new List(3,false);
        list1.add("����");
        list1.add("���");
        list1.add("��ȭ");
        list1.add("�Ҽ�");
        list1.add("����");

        list1.select(1);
        lc1.add(list1);
        lc1.setBounds(100,100,300,400);
        lc1.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(Event e)
            {
                System.exit(0);
            }
        });
    }
}
