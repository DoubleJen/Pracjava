package tw.pracdou001;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	JLabel ID = new JLabel("User Name");
	JTextField IDInput =  new JTextField(20);
	
	JLabel Pass = new JLabel("Password");
	JPasswordField PassInput = new JPasswordField(20);
	
	JButton Enter = new JButton("ENTER");
	JButton Clear = new JButton("CLEAR");
	
	private ButtonHandler ButtonEvent = new ButtonHandler();
	private class ButtonHandler{
		
	}
	
	Login(){
		super("請輸入帳號密碼");
		setSize(300, 180);
		setVisible(true);
		//setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		JPanel jp = new JPanel();
		jp.setBackground(Color.white);
		jp.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		jp.add(ID);
		jp.add(IDInput);
		jp.add(Pass);
		jp.add(PassInput);
		jp.add(Enter);
		jp.add(Clear);
		setContentPane(jp);
	}
	
	
	
	
}
