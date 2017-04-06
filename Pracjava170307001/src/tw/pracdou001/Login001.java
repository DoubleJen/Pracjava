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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ToolTipManager;



public class Login001 extends JFrame{
	
	protected String[] n ={"帳號或手機號碼/Username or CellPhone", 
						"密碼/Password", 
						"登入/Login", 
						"忘記密碼/Forget Password", 
						"註冊新帳號/New Registration" };
	
	protected JTextField IdInput = new JTextField(20){
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				if(new String(IdInput.getText()).length() == 0){
					g.setColor(Color.GRAY);
					g.drawString(n[0], 10, 15);
				}
			};
	};
	
	JPasswordField PassInput = new JPasswordField(20){
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				if(new String(PassInput.getPassword()).length() == 0){
					g.setColor(Color.GRAY);
					g.drawString(n[1], 10, 15);
				}
			};
	};
	
	protected JButton BLogin = new JButton(n[2]);	
	protected JButton BForget = new JButton(n[3]);
	protected JButton BRegis = new JButton(n[4]);
	ButtonEvent Btouch = new ButtonEvent();


	
	
	Login001(){
//		JFrame login1 = new JFrame("請輸入帳號密碼");//
//		login1.setLayout(new BorderLayout());
		super("請輸入帳號密碼");
		setLayout(new BorderLayout());
		
		JPanel login2 = new JPanel();
		login2.setLayout(new GridBagLayout());//new FlowLayout(FlowLayout.CENTER, 10, 10)
		login2.setBackground(Color.white);
		login2.setPreferredSize(new Dimension(0, 200));
		
		IdInput.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
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
		
		PassInput.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
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
		
		BLogin.addActionListener(Btouch);
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
		
		BForget.addActionListener(Btouch);
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
		
		BRegis.addActionListener(Btouch);
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
		
		
		setVisible(true);
		setLocationRelativeTo(null);//setLocation(350, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(login2, BorderLayout.NORTH);//login1.setContentPane(login2);
		setSize(500, 300); setResizable(false);//pack();	
	}
	
	protected class ButtonEvent implements ActionListener{
		
		protected void BLogin(){
			if(!new String(PassInput.getPassword()).equals("123")){
				JOptionPane.showMessageDialog(null, "密碼有誤，請重新登入");
			}
		}
		protected void BForget(){
			System.out.println("BForget");
		}
		protected void BRegis(){
			System.out.println("BRegis");
		} 
		
		@Override
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == BLogin){BLogin();}
			else if(e.getSource() == BForget){BForget();}
			else if(e.getSource() == BRegis){BRegis();}
		}
	}
	
}


