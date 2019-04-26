package frameTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the frame.
	 */
	public Frame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 921, 688);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel1 = new JLabel();
		
		
		lblNewLabel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
					int[] Bae = new int[6];
					for(int i=0;i<6;i++)
					{
						Bae[i]=(int)(Math.ceil(Math.random()*45));
						for(int j=0;j<i;j++)
						{
							if(Bae[i]==Bae[j])
							{
								i--;
							}
						}
					}
					Arrays.sort(Bae);
					textField.setText(String.valueOf(Bae[0]));//String.valueOf() 문자로 바꿔준다
					textField_1.setText(String.valueOf(Bae[1]));
					textField_2.setText(String.valueOf(Bae[2]));
					textField_3.setText(String.valueOf(Bae[3]));
					textField_4.setText(String.valueOf(Bae[4]));
					textField_5.setText(String.valueOf(Bae[5]));
					
				}
			});
		
		
		lblNewLabel1.setBounds(0, 0, 905, 649);
		JLabel lblNewLabel2 = new JLabel();
		JLabel lblNewLabel3 = new JLabel();
		JLabel lblNewLabel4 = new JLabel();
		JLabel lblNewLabel5 = new JLabel();
		JLabel lblNewLabel6 = new JLabel();
		contentPane.setLayout(null);
		
		contentPane.add(lblNewLabel1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(343, 318, 206, 104);
		contentPane.add(btnNewButton);
		
	
		
		
		
				textField = new JTextField();
				textField.setBounds(154, 117, 68, 68);
				contentPane.add(textField);
				textField.setColumns(10);
				contentPane.add(textField);
				
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(668, 117, 68, 68);
				contentPane.add(textField_1);
				
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(257, 117, 68, 68);
				contentPane.add(textField_2);
				
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(359, 117, 68, 68);
				contentPane.add(textField_3);
				
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(463, 117, 68, 68);
				contentPane.add(textField_4);
				
				textField_5 = new JTextField();
				textField_5.setColumns(10);
				textField_5.setBounds(566, 117, 68, 68);
				contentPane.add(textField_5);
		
		
		
	
}
		
}