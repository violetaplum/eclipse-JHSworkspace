package imageClass;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ImageClass extends Frame {

	static Image img1;  // aa.jpg�� ���� ��ü
	static String krim = "src/imageClass/aa.jpg"; // "d:aa.jpg"   ----> "src/��Ű�����/���ϸ�"
	// ���� �� ȥ�� ���� �Ŷ�� ���������.. ��������� �Բ� ���� �ڵ���
	// �̷� �������� ��Ű�� �ȿ� ���� ������ �ٳ�� �Ѵ�.
	public void paint(Graphics g) //�׸� �׷��ִ°�
	{
		g.drawImage(img1,0,0,500,500,this);
		
	}
	
	public static void main(String[] args) { //static method (���� �޼ҵ�)
		// TODO Auto-generated method stub
			ImageClass pc1 = new ImageClass(); // Frame�� �÷Ǵ� �ٿ��ٰ� �����ϴ�
			//������ �׸��� �������� �ʴ´�.
			//���߿� �׸��� Frame���� ���� ���̰� ���� ���� �ִ�.
			img1 = Toolkit.getDefaultToolkit().getImage(krim);
							//static 		//static method
			pc1.setTitle("�̹��� �ֱ�");//���������� ����
			pc1.setSize(500,500);//���� ������ ũ��
			pc1.setResizable(true);
			pc1.setLayout(null);//���̾ƿ� �޴��� �ʱ�ȭ
			pc1.setVisible(true);
			pc1.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e1) {
					/*dispose();*/
					System.exit(0);

				}
			});
	}

}
