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
                        System.out.print(imsi.getD());
                    }
                    break;
            }
        }
        while(sel!=5);


    }
}
