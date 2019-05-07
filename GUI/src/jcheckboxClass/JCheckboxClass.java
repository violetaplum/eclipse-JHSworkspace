package jcheckboxClass;
import javax.swing.*;
import java.awt.*;

public class JCheckboxClass extends JFrame {
    public JCheckboxClass()
    {
        JPanel jp1 = new JPanel();
        //Panel은 기본적으로 FlowLayout이고 중앙정렬이다.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JCheckBox jcb1 = new JCheckBox("회원카드보유",false);
        JCheckBox jcb2 = new JCheckBox("장기회원",false);
        JCheckBox jcb3 = new JCheckBox("해외여행신청여부",false);
        jp1.add(jcb1);
        jp1.add(jcb2);
        jp1.add(jcb3);

        getContentPane().add(jp1);//프레임의 contentpane을 알아낸 후 컴포넌트 부착
        //프레임 = 메뉴바 + content pane(각종 컴포넌트들에 들어갈 것)
        //Label, Button들이 들어간다.
        //정보를 알아낸 후에 add()한다.


    }
    public static void main(String[] args)
    {
        JCheckboxClass jcbc1 = new JCheckboxClass();
        jcbc1.setTitle("CheckBox!!");
        jcbc1.setSize(300,500);
        jcbc1.setVisible(true);
    }
}
