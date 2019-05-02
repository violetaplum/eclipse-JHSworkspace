package combo;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Combo extends Frame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Combo cc1 = new Combo();
			cc1.setTitle("콤보박스 (초이스)");
			Choice c1 = new Choice();
			c1.add("서울");
			c1.add("경기");
			c1.add("인천");
			
			/*c1.remove(0); //index 0번에 아이템 제거
			c1.insert("대전", 0); //index 0번에 아이템 추가
			*/
			
			
			cc1.add(c1); //프레임에 선택된 버튼 넣기
			cc1.pack();
			cc1.setSize(300,350);
			cc1.setVisible(true);
			
			
			System.out.println("아이템 갯수  "+c1.getItemCount());
			System.out.println("0번에 있는 아이템  " + c1.getItem(0));
			System.out.println("현재선택 아이템   "+ c1.getSelectedItem());
			
			//Choice.getItemCount(index) : 아이템의 갯수
			//Choice.getItem(index) : index에 있는 아이템
			//Choice.getSelectedItem() : 현재 선택된 아이템
			
			
			cc1.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					
					System.exit(0);
				}
			});
	}

}
