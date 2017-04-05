package tw.pracdou001;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ToolTipManager;

public class Login001 extends JFrame {
	String[] n ={"帳號或手機號碼/Username or CellPhone", 
				"密碼/Password", 
				"登入/Login", 
				"忘記密碼/Forget Password", 
				"註冊新帳號/New Registration" };
	
	private ButtonHandler ButtonEvent = new ButtonHandler();
	private class ButtonHandler{		
	}
	
	
	
	
	
	Login001(){
//		JFrame login1 = new JFrame("請輸入帳號密碼");//
//		login1.setLayout(new BorderLayout());
		super("請輸入帳號密碼");
		setLayout(new BorderLayout());
		
		JPanel login2 = new JPanel();
		login2.setLayout(new GridBagLayout());//new FlowLayout(FlowLayout.CENTER, 10, 10)
		login2.setBackground(Color.white);
		login2.setPreferredSize(new Dimension(0, 200));
		
		JTextField IdInput = new JTextField(n[0] ,25);
		GridBagConstraints IdInput1 = new GridBagConstraints();
		IdInput1.gridx = 0;
		IdInput1.gridy = 0;
		IdInput1.gridwidth = 10;
		IdInput1.gridheight = 1;
		IdInput1.weightx = 0;
		IdInput1.weighty = 0;
		IdInput1.fill = GridBagConstraints.BOTH;
		IdInput1.anchor = GridBagConstraints.CENTER;
		IdInput1.insets = new Insets(10, 5, 10, 5);
		login2.add(IdInput, IdInput1);
		
		JPasswordField PassInput = new JPasswordField(n[1] ,25);
		PassInput.setEchoChar('*');
		PassInput.setToolTipText("密碼長度6位以上、小於20位，限a-z、A-Z、0-9、$_*%?^");
//		PassInput.setPreferredSize(new Dimension(0, 20));
		GridBagConstraints PassInput1 = new GridBagConstraints();
		PassInput1.gridx = 0;
		PassInput1.gridy = 1;
		PassInput1.gridwidth = 10;
		PassInput1.gridheight = 1;
		PassInput1.weightx = 0;
		PassInput1.weighty = 0;
		PassInput1.fill = GridBagConstraints.BOTH;
		PassInput1.anchor = GridBagConstraints.CENTER;
		PassInput1.insets = new Insets(10, 5, 10, 5);
		login2.add(PassInput, PassInput1);
		
		JButton BLogin = new JButton(n[2]);
		GridBagConstraints BLogin1 = new GridBagConstraints();
		BLogin1.gridx = 0;
		BLogin1.gridy = 2;
		BLogin1.gridwidth = 10;
		BLogin1.gridheight = 1;
		BLogin1.weightx = 0;
		BLogin1.weighty = 0;
		BLogin1.fill = GridBagConstraints.NONE;
		BLogin1.anchor = GridBagConstraints.CENTER;
		BLogin1.insets = new Insets(10, 5, 10, 5);
		login2.add(BLogin, BLogin1);
		
		JButton BForget = new JButton(n[3]);
		GridBagConstraints BForget1 = new GridBagConstraints();
		BForget1.gridx = 0;
		BForget1.gridy = 3;
		BForget1.gridwidth = 1;
		BForget1.gridheight = 1;
		BForget1.weightx = 0;
		BForget1.weighty = 0;
		BForget1.fill = GridBagConstraints.NONE;
		BForget1.anchor = GridBagConstraints.WEST;
		BForget1.insets = new Insets(10, 5, 10, 5);
		login2.add(BForget, BForget1);
		
		JButton BRegis = new JButton(n[4]);
		GridBagConstraints BRegis1 = new GridBagConstraints();
		BRegis1.gridx = 1;
		BRegis1.gridy = 3;
		BRegis1.gridwidth = 1;
		BRegis1.gridheight = 1;
		BRegis1.weightx = 0;
		BRegis1.weighty = 0;
		BRegis1.fill = GridBagConstraints.NONE;
		BRegis1.anchor = GridBagConstraints.EAST;
		BRegis1.insets = new Insets(10, 5, 10, 5);
		login2.add(BRegis, BRegis1);
		
		
	
//		ID.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
//		Pass.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));

//		
		
		
		
		
		setVisible(true);
		setLocationRelativeTo(null);//setLocation(350, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(login2, BorderLayout.SOUTH);//login1.setContentPane(login2);
		pack();//login1.setSize(260, 500); login.setResizable(false);
		
		
	}
	
	
	
	
}
