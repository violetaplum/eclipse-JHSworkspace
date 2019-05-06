package loginTest;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Kaja1 extends Frame {
	private Button btnJoin, btnCancle;
	private Label label1, label2, label3, label4, label5;
	private TextField txName, txPhone;
	private Checkbox chk1, chk2, chk3, chkMan, chkWoman;
	private CheckboxGroup checkboxGroup;
	private TextArea textArea;

	public Kaja1() {
		this.setLayout(null);///////////////////

		label1 = new Label("Name");
		label1.setSize(30, 20);
		label1.setLocation(50, 50);
		this.add(label1);

		txName = new TextField();
		txName.setSize(100, 30);
		txName.setLocation(130, 50);
		this.add(txName);

		label2 = new Label("Tell");
		label2.setSize(50, 20);
		label2.setLocation(50, 80);
		this.add(label2);

		txPhone = new TextField();
		txPhone.setSize(100, 30);
		txPhone.setLocation(130, 80);
		this.add(txPhone);

		label3 = new Label("Genre");
		label3.setSize(50, 30);
		label3.setLocation(50, 130);
		this.add(label3);

		chk1 = new Checkbox("Thriller", false);
		chk1.setSize(60, 30);
		chk1.setLocation(50, 160);
		this.add(chk1);
		chk2 = new Checkbox("Action", false);
		chk2.setSize(60, 30);
		chk2.setLocation(120, 160);
		this.add(chk2);
		chk3 = new Checkbox("Animation", false);
		chk3.setSize(90, 30);
		chk3.setLocation(180, 160);
		this.add(chk3);

		label4 = new Label("Sex");
		label4.setSize(50, 30);
		label4.setLocation(50, 200);
		this.add(label4);

		checkboxGroup = new CheckboxGroup();//////////

		chkMan = new Checkbox("Man", checkboxGroup, false);
		chkMan.setSize(40, 30);
		chkMan.setLocation(50, 230);
		this.add(chkMan);

		chkWoman = new Checkbox("Woman", checkboxGroup, false);
		chkWoman.setSize(40, 30);
		chkWoman.setLocation(120, 230);
		this.add(chkWoman);

		label5 = new Label("Quote");
		label5.setSize(70, 30);
		label5.setLocation(50, 270);
		this.add(label5);

		textArea = new TextArea(5, 50);////////////
		textArea.setSize(200, 80);
		textArea.setLocation(50, 300);
		this.add(textArea);

		btnJoin = new Button("Sign Up");
		btnJoin.setSize(40, 30);
		btnJoin.setLocation(100, 400);
		this.add(btnJoin);

		btnCancle = new Button("Cancel");
		btnCancle.setSize(40, 30);
		btnCancle.setLocation(160, 400);
		this.add(btnCancle);

		this.setBackground(new Color(120,100,220));
		this.setTitle("Comic Cafe Sign up");
		this.setSize(300, 500);
		this.setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e1) {
				dispose();
				System.exit(0);

			}
		});
	}
}

public class Login {
	public static void main(String[] args) {
		new Kaja1();
	}
}
