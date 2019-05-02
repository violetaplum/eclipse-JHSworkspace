package listClass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListClass extends Frame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ListClass lc1 = new ListClass();
			
			lc1.setTitle("리스트 클래스");
			lc1.setLayout(new FlowLayout());
			//이것 하지 않으면 List가 정상적으로 출력되지 않는다.
			List list1 = new List(3,false);
			//보여지는 것은 3개,false면 단일 선택으로, true이면 다중 선택
			list1.add("웹툰");
			list1.add("드라마");
			list1.add("영화");
			list1.add("소설");
			list1.add("예능");
			
			list1.select(1); //기본선택은 두번째 아이템으로
			lc1.add(list1);	//List를 Frame에 넣기
			lc1.setBounds(100,100,300,400);
			// setSize() + setLocation(); : (x,y,width,height)
			
			
			
			lc1.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e1)
				{
					
					System.exit(0);
					
				}
			});
			lc1.setVisible(true);
			
	}

}
