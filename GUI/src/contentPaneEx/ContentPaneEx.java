package contentPaneEx;
import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
    Container contentPane;
    public ContentPaneEx()
    {
        setTitle("ContentPane and JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); : 프레임닫힐때 프로그램도 종료한다

        this.contentPane = getContentPane();
        this.contentPane.setBackground(Color.ORANGE);
        this.contentPane.setLayout(new FlowLayout());

        this.contentPane.add(new JButton("OK"));
        this.contentPane.add(new JButton("Cancel"));
        this.contentPane.add(new JButton("Ignore"));

        this.setSize(300,150);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        new ContentPaneEx();
    }
}
