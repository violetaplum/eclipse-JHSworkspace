package JLabelClass;
import javax.swing.*;
import java.awt.*;

public class JLabelClass  extends JFrame{
    JLabel jl1;
    //밖에 있는 이유는 안에서 아무렇게나 사용하기 위해서 임
    public JLabelClass()
    {
        ImageIcon img1 = new ImageIcon("src/JLabelClass/aa.jpg");//java.awt.*;
        jl1 = new JLabel("나는 JLabel입니다.",img1,SwingConstants.LEFT);
        jl1.setFont(new Font("굴림",Font.BOLD,32));
        //jl1 = new JLabel("나는~~",new ImageIcon("src/aa.png");
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
