package GuiTest;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class MyFrame extends JFrame{
    public MyFrame()
    {
        setTitle("Making 300x300 Frame"); //super("Title"); : �̷������� JFrame�����ڸ� ȣ���Ͽ� Ÿ��Ʋ�� �޼��� ��
        setSize(300,300);
        setVisible(true);
        addWindowListener(new WindowAdapter() //â���ݴ¾�
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
