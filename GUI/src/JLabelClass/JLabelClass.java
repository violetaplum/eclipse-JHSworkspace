package JLabelClass;
import javax.swing.*;
import java.awt.*;

public class JLabelClass  extends JFrame{
    JLabel jl1;
    //�ۿ� �ִ� ������ �ȿ��� �ƹ����Գ� ����ϱ� ���ؼ� ��
    public JLabelClass()
    {
        ImageIcon img1 = new ImageIcon("src/JLabelClass/aa.jpg");//java.awt.*;
        jl1 = new JLabel("���� JLabel�Դϴ�.",img1,SwingConstants.LEFT);
        jl1.setFont(new Font("����",Font.BOLD,32));
        //jl1 = new JLabel("����~~",new ImageIcon("src/aa.png");
        getContentPane().add(jl1);
        setVisible(true);
        setSize(1000,700);
        /*JPanel jp1 = new JPanel();*/
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args)
    {
        new JLabelClass();
    }
}
