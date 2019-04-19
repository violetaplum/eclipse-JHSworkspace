package telinfoPrintMain;
import telinfoDAO.*;
import telinfoVO.*;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class TelInfoMain
{

    public static void main(String[] args)
        throws ClassNotFoundException,SQLException
    {
        int sel = 0;
        String sql = "";
        TelInfoDAO tidao = new TelInfoDAO();
        do{
            System.out.println("비상연락망 관리!!");
            System.out.println("--------------------------");
            System.out.println("1: 한명입력");
            System.out.println("2: 수정");
            System.out.println("3: 삭제");
            System.out.println("4: 전체출력");
            System.out.println("5: 종료");
            System.out.println("--------------------------");
            System.out.println("메뉴를 선택하세요^^");

            sel = Integer.parseInt(JOptionPane.showInputDialog("메뉴선택"));
            //원래는 Scanner를 썼었지만 이번에는 GUI로 받는방식
            //화면에 메뉴가 뜬다. 입력한 int가 case의 숫자로 들어간다.

            switch(sel)
            {
                case 4:
                    ArrayList<TelInfoVO> tiArray = tidao.getAllInfo();  //TelInfoDAO.getAllInfo();
                    //.getAllInfo() : 전체 출력을 위한 메소드였음
                    //안에는 sql, 각각의 속성들의 값들을 할당한 방식을 포함 하고 있다.
                    for(TelInfoVO imsi : tiArray)
                    {
                        System.out.print(imsi.getId()+"\t");
                        System.out.print(imsi.getName()+"\t");
                        System.out.print(imsi.getTel()+"\t");
                        System.out.println(imsi.getD());
                    }
                    break;
                case 2:
                    String n1 = JOptionPane.showInputDialog("기존 이름은?");
                    String n2 = JOptionPane.showInputDialog("바뀔 전화번호는?");

                    boolean b2 = tidao.update_nametel(n1,n2);
                    if(b2)
                    {
                        System.out.println("update ok");
                    }
                    else
                    {
                        System.out.println("update error");
                    }
                    break;

                    case 1:

                    String id = JOptionPane.showInputDialog("아이디 입력 : ");
                    int Id = Integer.parseInt(id);
                    String name = JOptionPane.showInputDialog("이름 입력 : ");
                    String tel = JOptionPane.showInputDialog("번호 입력 : ");
                    String date = JOptionPane.showInputDialog("날짜 입력 : ");

                    boolean b3 = tidao.insert_person(Id,name,tel,date);

                    if(b3)
                    {
                        System.out.println("insert success!");
                    }
                    else
                    {
                        System.out.println("insert Error!!");
                    }
                    break;
                case 3:
                    String did = JOptionPane.showInputDialog("삭제할 아이디 입력");
                    boolean bb = tidao.delete_nametel(Integer.parseInt(did));
                    if(bb)
                    {
                        System.out.println("delete success!!");
                    }
                    else
                    {
                        System.out.println("delete Error!!");
                    }
                    break;

            }
        }
        while(sel!=5);  //while때문에 끝나지 않고 상단의 메뉴가 다시 출력된다.


    }
}
