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
	private Button b2 = new Button("���� READ");
	private Button b3 = new Button("���� WRITE");
	
	private TextArea ta1 = new TextArea();
	//������ ���������� JText��� �� ����
	//TextField�� ���پ��ۿ� �ȵ�����
	//TextArea�� ���� line�� ����. ��, ���� ������ �� ��  �ִ�. ȭ��ũ�Ⱑ ������ ��ũ�ѹٷ� �Ѿ��. ó������
	
	public FileGUI2()
	{
		this.setLayout(null);
		b2.setSize(100,70);
		b2.setForeground(new Color(255,255,255));
		b2.setBackground(new Color(0,0,255));
		b2.setFont(new Font("����",Font.BOLD,15));
		b2.setLocation(350,200);
		this.add(b2);
		b2.addActionListener(this);

		b3.setSize(100,70);
		b3.setForeground(new Color(255,255,255));
		b3.setBackground(new Color(0,0,255));
		b3.setFont(new Font("����",Font.BOLD,15));
		b3.setLocation(350,300);
		this.add(b3);
		b3.addActionListener(this);//�̺�Ʈ ó���ϴ³�
		
		ta1.setSize(300,340);// ũ��
        ta1.setForeground(new Color(0,0,255));
        ta1.setBackground(new Color(255,255,0));
        ta1.setFont(new Font("����",Font.BOLD,20));
        ta1.setLocation(20,40); // ������ġ 
	    this.add(ta1);// �߰� 
        
	    this.setBackground(new Color(0,200,0)); 
	    this.setTitle("���� ���ִ� �޸���~~~~~~~ !!!!!!");
	    this.setSize(460, 400); //������ ũ�� 
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
	{ //actionPerformed���� � ��ư�� �������� �� �˾Ƴ���.
		// TODO Auto-generated method stub
		
		if(e.getSource()==b2) //�ʰ� ���� ��ư�� ���ư�̴�? : b2�� �б��ư
		{
			String fileData="";
			FileDialog fd1 = new FileDialog(this,"���� READ",FileDialog.LOAD); //FileDialog.LOAD : ���콺�� ���� ���� �������.
			//FileDialog(���?, ����, FileDialog.LOAD)
			//FileDialog : ȭ�鿡 �߰��� ��ȭ���ڸ� ����ش�.
			//Java���� Ž���⸦ �����ش�.
			fd1.setVisible(true);
			
			String dirFile = fd1.getDirectory()+fd1.getFile();
			//FileDialog.getDirectory():������ ��ġ, FileDialog.getFile():������ �̸�
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
			
			FileDialog fd2 = new FileDialog(this,"���� SAVE",FileDialog.SAVE);
			fd2.setVisible(true);
			String dirFile2 = fd2.getDirectory()+fd2.getFile();//������ ����
			/*File file = new File("E:/a.txt");*/
			String FileData2 = ta1.getText().replaceAll("\n", "\r\n");
			//TextArea.getText().replaceAll(,);
			//.replace('/','-'); ���� ����ϸ� /�� -�� �ٲٴ� ���
			
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
