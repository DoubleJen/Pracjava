package tw.pracdou001;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login001 extends JFrame{
	//彙集登入視窗須用的元件名稱
	private String[] n ={"帳號 Username", 
							"密碼 Password", 
							"登入 Login", 
							"忘記密碼 Forget Password", 
							"註冊新帳號 New Registration" };
	
	//設定"輸入Id"的欄位
	private JTextField IdInput = new JTextField(20){	
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				if(new String(IdInput.getText()).length() == 0){
					g.setColor(Color.GRAY);
					g.drawString(n[0], 10, 18);
				}
			};
	};
	
	//設定"輸入Password"的欄位
	private JPasswordField PassInput = new JPasswordField(20){
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				if(new String(PassInput.getPassword()).length() == 0){
					g.setColor(Color.GRAY);
					g.drawString(n[1], 10, 18);
				}
			};
	};
	
	//新增"登入"、"忘記密碼"及"註冊新帳號"的按鈕，與"點集按鈕"觸發的事件
	private JButton BLogin = new JButton(n[2]);	
	private JButton BForget = new JButton(n[3]);
	private JButton BRegis = new JButton(n[4]);
	private ButtonEvent Btouch = new ButtonEvent();

	//新增"初始Id"及"初始Password"設定方法與判斷式
	static String Id(){
		String Id = JOptionPane.showInputDialog("請輸入帳號(長度不限，字元限英、數字)");
		while(!Id.matches("^[A-Za-z0-9]+$")){
			JOptionPane.showMessageDialog(null, "您輸入的帳號格式有誤，請重新輸入(長度不限，字元限英、數字)");
			Id = JOptionPane.showInputDialog("請輸入帳號(長度不限，字元限英、數字)");
		}
		return Id;
	}
	static String Pass(){
		String Pass = JOptionPane.showInputDialog("請輸入密碼(長度6位以上、小於20位，字元限a-z、A-Z、0-9、$_*%?^)");
		while(!Pass.matches("^[A-Za-z0-9$_*%?^]{6,20}$")){
			JOptionPane.showMessageDialog(null, "您輸入的密碼格式有誤，請重新輸入(長度6位以上、小於20位，字元限a-z、A-Z、0-9、$_*%?^)");
			Pass = JOptionPane.showInputDialog("請輸入密碼(長度6位以上、小於20位，字元限a-z、A-Z、0-9、$_*%?^)");
		}
		return Pass;
	}
	String Id = Id();
	String Pass = Pass();
	
	
	Login001(){
		//設定框架與配置方式
		super("會員登入");
		setLayout(new BorderLayout());
		
		//設定框架內畫布與配置方式	
		JPanel login2 = new JPanel();
		login2.setLayout(new GridBagLayout());//new FlowLayout(FlowLayout.CENTER, 10, 10)...
		login2.setBackground(Color.white);
		login2.setPreferredSize(new Dimension(0, 200));
		
		//設定"輸入Id"欄位字體、提示框與擺放位置
		IdInput.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));//IdInput.setFont(new Font("Arial Unicode MS", Font.BOLD, 16));
		IdInput.setToolTipText("長度不限，字元限英、數字");
		GridBagConstraints IdInput1 = new GridBagConstraints();
		IdInput1.gridx = 0;
		IdInput1.gridy = 0;
		IdInput1.gridwidth = 8;
		IdInput1.gridheight = 1;
		IdInput1.weightx = 0;
		IdInput1.weighty = 0;
		IdInput1.fill = GridBagConstraints.BOTH;
		IdInput1.anchor = GridBagConstraints.CENTER;
		IdInput1.insets = new Insets(10, 5, 10, 5);
		login2.add(IdInput, IdInput1);
		
		//設定"輸入Password"欄位字體、顯示字元、提示框與擺放位置
		PassInput.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
		PassInput.setEchoChar('*');
		PassInput.setToolTipText("長度6位以上、小於20位，字元限a-z、A-Z、0-9、$_*%?^");
		GridBagConstraints PassInput1 = new GridBagConstraints();
		PassInput1.gridx = 0;
		PassInput1.gridy = 1;
		PassInput1.gridwidth = 8;
		PassInput1.gridheight = 1;
		PassInput1.weightx = 0;
		PassInput1.weighty = 0;
		PassInput1.fill = GridBagConstraints.BOTH;
		PassInput1.anchor = GridBagConstraints.CENTER;
		PassInput1.insets = new Insets(10, 5, 10, 5);
		login2.add(PassInput, PassInput1);
		
		//設定"登入"按鈕觸發動作與擺放位置
		BLogin.addActionListener(Btouch);
		GridBagConstraints BLogin1 = new GridBagConstraints();
		BLogin1.gridx = 0;
		BLogin1.gridy = 2;
		BLogin1.gridwidth = 8;
		BLogin1.gridheight = 1;
		BLogin1.weightx = 0;
		BLogin1.weighty = 0;
		BLogin1.fill = GridBagConstraints.NONE;
		BLogin1.anchor = GridBagConstraints.CENTER;
		BLogin1.insets = new Insets(10, 5, 10, 5);
		login2.add(BLogin, BLogin1);
		
		//設定"忘記密碼"按鈕觸發動作與擺放位置
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
		
		//設定"註冊新帳號"按鈕觸發動作與擺放位置
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
		
		//設定框架可見、顯示位置、程序結束動作、大小、可否調整，並將畫布加入框架及其位置
		setVisible(true);
		setLocationRelativeTo(null);//setLocation(350, 350)...
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(login2, BorderLayout.NORTH);
		setSize(500, 300); setResizable(false);//pack()...	
	}
	
	//設定各按鈕觸發事件的指令
	private class ButtonEvent implements ActionListener{
		private void BLogin(){		
			if(!(new String(IdInput.getText()).equals(Id) && new String(PassInput.getPassword()).equals(Pass))){
				JOptionPane.showMessageDialog(null, "帳號密碼有誤，請重新輸入");
			}
			System.out.println("歡迎登入");
		}
		private void BForget(){
			System.out.println("忘記密碼");
		}
		private void BRegis(){
			System.out.println("註冊新帳號");
		} 
		
		@Override
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == BLogin){BLogin();}
			else if(e.getSource() == BForget){BForget();}
			else if(e.getSource() == BRegis){BRegis();}
		}
	}
	
}




