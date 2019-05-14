package gridLayoutEx;
import javax.swing.*;
import java.awt.*;

public class GridTest extends JFrame{
    public GridTest()
    {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout grid = new GridLayout(4,2);
        grid.setVgap(20);
        Container c = getContentPane();
        c.setLayout(new GridLayout(4,2));
        c.add(new JLabel("Name"));
        c.add(new TextField(""));
        c.add(new JLabel("ID Nunebr"));
        c.add(new TextField(""));
        c.add(new JLabel(" Department"));
        c.add(new TextField(""));
        c.add(new JLabel("Subject"));
        c.add(new TextField(""));

        setSize(400,400);
        setVisible(true);

    }
    public static void main(String[] args)
    {
        new GridTest()
;    }
}
