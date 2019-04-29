package memoTest;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

class FileGUI2 extends Frame implements ActionListener
{
	private Button b2 = new Button("파일 READ");
	private Button b3 = new Button("파일 WRITE");
	
	private TextArea ta1 = new TextArea();
	//윈도우 빌더에서는 JText라고 뜰 것임
	//TextField는 한줄씩밖에 안들어갔엇음
	//TextArea는 여러 line이 들어간다. 행, 열이 여러개 일 수  있다. 화면크기가 작으면 스크롤바로 넘어간다. 처리가능
	
	public FileGUI2()
	{
		this.setLayout(null);
		b2.setSize(100,70);
		b2.setForeground(new Color(255,255,255));
		b2.setBackground(new Color(0,0,255));
		b2.setFont(new Font("돋음",Font.BOLD,15));
		b2.setLocation(350,200);
		this.add(b2);
		b2.addActionListener(this);

		b3.setSize(100,70);
		b3.setForeground(new Color(255,255,255));
		b3.setBackground(new Color(0,0,255));
		b3.setFont(new Font("돋음",Font.BOLD,15));
		b3.setLocation(350,300);
		this.add(b3);
		b3.addActionListener(this);//이벤트 처리하는놈
		
		ta1.setSize(300,340);// 크기
        ta1.setForeground(new Color(0,0,255));
        ta1.setBackground(new Color(255,255,0));
        ta1.setFont(new Font("돋움",Font.BOLD,20));
        ta1.setLocation(20,40); // 내부위치 
	    this.add(ta1);// 추가 
        
	    this.setBackground(new Color(0,200,0)); 
	    this.setTitle("나의 멋있는 메모장~~~~~~~ !!!!!!");
	    this.setSize(460, 400); //프레임 크기 
	    this.setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e1)
			{
				dispose();
				System.exit(0);

			}
		});
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{ //actionPerformed에서 어떤 버튼을 눌렀는지 다 알아낸다.
		// TODO Auto-generated method stub
		
		if(e.getSource()==b2) //너가 누른 버튼이 어떤버튼이니? : b2는 읽기버튼
		{
			String fileData="";
			FileDialog fd1 = new FileDialog(this,"파일 READ",FileDialog.LOAD); //FileDialog.LOAD : 마우스로 찝은 것이 띄워진다.
			//FileDialog(어디서?, 제목, FileDialog.LOAD)
			//FileDialog : 화면에 추가의 대화상자를 띄워준다.
			//Java에서 탐색기를 열어준다.
			fd1.setVisible(true);
			
			String dirFile = fd1.getDirectory()+fd1.getFile();
			//FileDialog.getDirectory():파일의 위치, FileDialog.getFile():파일의 이름
			try
			{
				FileReader fr = new FileReader(dirFile);
				BufferedReader br = new BufferedReader(fr);
				String s;
				while((s=br.readLine())!=null)
				{
					fileData = s+"\n";
				}
				ta1.setText(fileData);
				br.close();fr.close();
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b3)
		{
			
			FileDialog fd2 = new FileDialog(this,"파일 SAVE",FileDialog.SAVE);
			fd2.setVisible(true);
			String dirFile2 = fd2.getDirectory()+fd2.getFile();//저장을 위해
			/*File file = new File("E:/a.txt");*/
			String FileData2 = ta1.getText().replaceAll("\n", "\r\n");
			//TextArea.getText().replaceAll(,);
			//.replace('/','-'); 으로 사용하면 /를 -로 바꾸는 명령
			
			try
			{
				FileWriter fw = new FileWriter(dirFile2);
				PrintWriter pw = new PrintWriter(fw);
			
				pw.println(FileData2);
				pw.close(); fw.close();
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		
		
		}
}
}
public class MemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileGUI2 bb = new FileGUI2();
	}

}
