package gridLayoutEx;
import java.awt.*;
import javax.swing.*;


public class GridLayoutEx extends JFrame {

    public GridLayoutEx()
    {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4,2); //4x2 격자의 GridLayout 배치관리자 생성
        grid.setVgap(20); //격자 사이의 수직 간격을 5픽셀로 설정

        Container c = getContentPane();
        c.setLayout(grid);
        c.add(new JLabel(" Name"));
        c.add(new JTextField(""));
        c.add(new JLabel(" ID Number"));
        c.add(new JTextField(""));
        c.add(new JLabel(" Department"));
        c.add(new JTextField(""));
        c.add(new JLabel(" Subject"));
        c.add(new JTextField(""));// 왼쪽에서 오른쪽, 위에서 아래의 순서로 배치된다.

        setSize(400,400);
        setVisible(true);


    }

    public static void main(String[] args)
    {
        new GridLayoutEx();
    }
}
