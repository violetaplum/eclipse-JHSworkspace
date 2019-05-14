package listClass;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;

public class ListTest extends Frame {
    public static void main(String[] args)
    {
        ListClass lc1 =new ListClass();
        lc1.setTitle("리스트 클래스");
        lc1.setLayout(new FlowLayout());
        List list1 = new List(3,false);
        list1.add("웹툰");
        list1.add("드라마");
        list1.add("영화");
        list1.add("소설");
        list1.add("예능");

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
