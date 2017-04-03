package tw.pracdou001;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ToolTipManager;

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
		setSize(260, 240);
		setLocation(350, 350);
		setVisible(true);
		//setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel jp = new JPanel();
		jp.setBackground(Color.white);
		jp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		jp.add(ID);
		jp.add(IDInput);
		jp.add(Pass);
		jp.add(PassInput);
		jp.add(Enter);
		jp.add(Clear);
		ID.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		Pass.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		PassInput.setEchoChar('*');
		PassInput.setToolTipText("密碼長度6位以上、小於20位，限a-z、A-Z、0-9、$_*%?^");
		setContentPane(jp);
		
	}
	
	
	
	
}
