package GUItest;
import java.awt.*;
import java.awt.event.*;


//AWT : 그래픽 처리시 윈도우 방식 차용
//SWING : 자바만의 방식 사용
////AWT------------------------------------------------------
//GUI : Graphic User Interface
//Event : 화면에 어떤 변화가 생긴 것 (마우스로 버튼클릭,마우스 끌기
//Frame : 창문틀
//ActionListener : 이벤트를 받아들이는 역할함
//Label : Frame 에 단지 출력만 되는 Component
//TextField : 입력,출력 필드
//Button : 버튼모양 출력
//

class BMIGUI2 extends Frame implements ActionListener
{

    private Button b1 = new Button("BMI START!"); // Button은 내장 class를 갖고있음
    //제출 Button
    private Label la1 = new Label("Your Hight is ");
    private Label la2 = new Label("Your Weight is ");

    private TextField tf1 = new TextField(); //입력 필드
    private TextField tf2 = new TextField(); //입력 필드

    private TextField tf3 = new TextField(); //출력 필드


    //생성자에 위치,크기,추가 를 구현
    //main에서 객체를 선언할때 가장 먼저 생성자를 만나기 때문에 생성자에 구현
    public BMIGUI2()
    {

        this.setLayout(null); //레이아웃(가로배치,세로배치,null). null : 자유롭게 배치
        b1.setSize(100,70); //Button size
        b1.setLocation(200,300);    //Button Location (좌측 상단 꼭짓점의 위치가 기본)
        b1.setBackground(Color.MAGENTA);
        this.add(b1);   //add the Button on Frame
        b1.addActionListener(this);  //Button as Event

        //------------------------------------------------------------------------------
        la1.setSize(90,30);
        la1.setLocation(20,70);
        la1.setForeground(Color.MAGENTA);
        this.add(la1);

        la2.setSize(90,30);
        la2.setLocation(20,100);
        la2.setForeground(Color.MAGENTA);
        this.add(la2);
        //-------------------------------------------------------------------------------

        tf1.setSize(70,30);
        tf1.setLocation(120,70);
        tf1.setForeground(Color.YELLOW);
        tf1.setBackground(Color.CYAN);
        this.add(tf1);  //weight 입력창

        tf2.setSize(70,30);
        tf2.setLocation(120,100);
        tf2.setForeground(Color.YELLOW);
        tf2.setBackground(Color.CYAN);
        this.add(tf2);  //height 입력창

        tf3.setSize(400,50);
        tf3.setLocation(20,400);
        this.add(tf3); //bmi결과 창

        //-----------------------------------------------------------------------------------

        this.setSize(500,500); //Frame 자체의 성질 정해주기
        this.setBackground(Color.BLUE);
        this.setVisible(true); //다 만들어 놓고 결과 보여주기

        addWindowListener(new WindowAdapter()   //생성자 안에 선언하는것 주의!!!
        {       //창 닫는걸 가능케해주는 메소드 선언
            public void windowClosing(WindowEvent e1)
            {
                dispose();
                System.exit(0);
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e)  //e 입력된 event을 받는다.
    {
        //현재 처리해야할 것들을 여기서 핸들링함

        if(e.getSource()==b1) //Button이 여러개일때 이곳을 바꾸어 다른 핸들링을 작성 가능
        {
            try {
                int hight = Integer.parseInt(tf1.getText());  //문자가 들어오기때문에 parsing함
                int weight = Integer.parseInt(tf2.getText());

                double myHight = hight / 100.0;
                double bmi = weight / Math.pow(myHight, 2); //Math.pow(밑,지수) : 제곱함수
                String result;

                if (bmi >= 30.0)
                    result = " Over Weighted.. ";
                else if (bmi > 25.0)
                    result = " Little Over Weighted ";
                else if (bmi >= 20.0)
                    result = " Normal Weighted ";
                else
                    result = " Low Weighted ";

                tf3.setText("Your BMI is " + bmi + " and you're" + result);
            } catch (NumberFormatException ee) {
                tf3.setText("Insert your Hight and Weight..");
            } catch (Exception ee) {
                tf3.setText(ee.getMessage());
            }
        }

    }

}
//Main클래스와 상위 클래스의 연결고리를 위해서
//상위 클래스의 객체 선언을 위한 객체 를 만들어 줘야 함
public class GuiMain {
    public static void main(String[] args)
    {
       BMIGUI2 b = new BMIGUI2(); //main 과 frame 클래스의 연결 객체
    }

}
