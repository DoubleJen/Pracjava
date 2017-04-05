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
	JPasswordField PassInput = new JPasswordField(20)
	{
		//private boolean bDraw = true;
		public void paint(Graphics g){
			super.paint(g);
			if(new String(PassInput.getPassword()).length() == 0){//bDraw && 
				g.setColor(Color.GRAY);
				g.drawString("請輸入密碼", 15, 15);
			}
		}
	};
	
	JButton Enter = new JButton("ENTER");
	JButton Clear = new JButton("CLEAR");
	
	private ButtonHandler ButtonEvent = new ButtonHandler();
	private class ButtonHandler{		
	}
	
	
	
	
	
	Login(){
		JFrame login1 =new JFrame("請輸入帳號密碼");//super("請輸入帳號密碼");
		
		JPanel login2 = new JPanel();
		login2.setBackground(Color.white);
		login2.setPreferredSize(new Dimension(0, 200));
		login2.setLayout(new GridBagLayout());//new FlowLayout(FlowLayout.CENTER, 10, 10)//new GridLayout(1, 6)
		GridBagConstraints pos = new GridBagConstraints();
		pos.gridx=1;
		pos.gridy=0;
		pos.gridwidth=1;
		pos.gridheight=1;
		pos.fill=GridBagConstraints.BOTH;
		pos.anchor=GridBagConstraints.CENTER;
		
		login2.add(ID, pos);
		login2.add(IDInput);
		login2.add(Pass);
		login2.add(PassInput);
		login2.add(Enter);
		login2.add(Clear);
		ID.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		Pass.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		//PassInput.setPreferredSize(new Dimension(0, 20));
		PassInput.setEchoChar('*');
		PassInput.setToolTipText("密碼長度6位以上、小於20位，限a-z、A-Z、0-9、$_*%?^");
		
		
		
		login1.setLayout(new BorderLayout());
		login1.setVisible(true);
		login1.setLocationRelativeTo(null);//setLocation(350, 350);
		login1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		login1.add(login2, BorderLayout.SOUTH);//login1.setContentPane(login2);
		login1.pack();//login1.setSize(260, 500); login.setResizable(false);
		
		
	}
	
	
	
	
}
