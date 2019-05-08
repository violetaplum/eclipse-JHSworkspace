package wbToolbar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class WbToolbar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WbToolbar frame = new WbToolbar();
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
	public WbToolbar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1343, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ILoveYou");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 324, 1303, 199);
		contentPane.add(lblNewLabel);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(12, 10, 1303, 304);
		contentPane.add(toolBar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel.setForeground(Color.RED);
			}
		});
		btnNewButton.setIcon(new ImageIcon(WbToolbar.class.getResource("/jtoolbarClass/cat1.png")));
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setForeground(Color.BLUE);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(WbToolbar.class.getResource("/jtoolbarClass/cat2.png")));
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setForeground(Color.CYAN);
				lblNewLabel.setFont(new Font("±¼¸²",Font.BOLD,50));
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(WbToolbar.class.getResource("/jtoolbarClass/cat3.png")));
		toolBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setForeground(Color.magenta);
				lblNewLabel.setFont(new Font("±¼¸²",Font.BOLD,70));
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(WbToolbar.class.getResource("/jtoolbarClass/exit.png")));
		toolBar.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setForeground(Color.orange);
				lblNewLabel.setFont(new Font("±¼¸²",Font.BOLD,10));
				
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(WbToolbar.class.getResource("/jtoolbarClass/font2.png")));
		toolBar.add(btnNewButton_4);
		
	}
}
