package GuiTest;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class MyFrame extends JFrame{
    public MyFrame()
    {
        setTitle("Making 300x300 Frame"); //super("Title"); : 이런식으로 JFrame생성자를 호출하여 타이틀을 달수도 있
        setSize(300,300);
        setVisible(true);
        addWindowListener(new WindowAdapter() //창문닫는애
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
                System.exit(0);
            }
        });

    }
    public static void main(String[] args)
    {
        MyFrame frame = new MyFrame();
    }
}
