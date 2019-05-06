package gridLayoutEx;
import java.awt.*;
import javax.swing.*;


public class GridLayoutEx extends JFrame {

    public GridLayoutEx()
    {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4,2); //4x2 ������ GridLayout ��ġ������ ����
        grid.setVgap(20); //���� ������ ���� ������ 5�ȼ��� ����

        Container c = getContentPane();
        c.setLayout(grid);
        c.add(new JLabel(" Name"));
        c.add(new JTextField(""));
        c.add(new JLabel(" ID Number"));
        c.add(new JTextField(""));
        c.add(new JLabel(" Department"));
        c.add(new JTextField(""));
        c.add(new JLabel(" Subject"));
        c.add(new JTextField(""));// ���ʿ��� ������, ������ �Ʒ��� ������ ��ġ�ȴ�.

        setSize(400,400);
        setVisible(true);


    }

    public static void main(String[] args)
    {
        new GridLayoutEx();
    }
}
