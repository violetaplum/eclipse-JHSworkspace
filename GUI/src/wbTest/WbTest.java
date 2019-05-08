package wbTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class WbTest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WbTest frame = new WbTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WbTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 410, 241);
		contentPane.add(scrollPane);
		
		JTextArea txtrAsdfAsdfAsdf = new JTextArea();
		txtrAsdfAsdfAsdf.setText("asdf\r\nasdf\r\nasdf\r\nasd\r\nfas\r\ndf\r\nasdf\r\nsa\r\ndf\r\nfsdf\r\nsd\r\nf\r\nsf\r\ns\r\ndf\r\nsdf\r\ns\r\ndfs\r\nfd\r\nsdf\r\n");
		scrollPane.setViewportView(txtrAsdfAsdfAsdf); //반응형 웹에서 또 배우게 된다.
	}
}
