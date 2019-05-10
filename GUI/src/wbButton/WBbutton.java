package wbButton;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JComboBox;

public class WBbutton extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WBbutton frame = new WBbutton();
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
	public WBbutton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(231, 29, 191, 83);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("<html>\uD30C\uC774\uC36C<br />\uD654\uC774\uD305</html>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("¸ÚÁ®~~~");
				textArea.append(System.lineSeparator());
				textArea.append("³ªµµ¿À´Ã ¹æ°¡");
				
			}
		});
		btnNewButton.setFont(new Font("±¼¸²",Font.BOLD,10));
		btnNewButton.setBounds(183, 156, 97, 56);
		contentPane.add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(49, 32, 97, 90);
		
		contentPane.add(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(152, 309, 178, 34);
		String[] word = {"String","Integer","Char"};
		JComboBox jc = new JComboBox(word);
		contentPane.add(jc);
		comboBox.addItem("String");
		comboBox.addItem("Integer");
		comboBox.addItem("Char");
		contentPane.add(comboBox);
		
		
	}
}
