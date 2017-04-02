package tw.pracdou001;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JPasswordUI extends JFrame
{
    private JLabel Jlb_ID = new JLabel("帳號");
    private JLabel Jlb_PW = new JLabel("密碼");
    private JPasswordField jpw = new JPasswordField(8);
    private JTextField jid = new JTextField();
    private JButton Jbtn_YES = new JButton("確定");
    private JButton Jbtn_NO = new JButton("清除");
    private ButtonHandler hbtHandler = new ButtonHandler();  //處理按鈕事件 
    

    public JPasswordUI()
    {
        super("輸入帳號密碼"); 
        Container c = getContentPane(); 
        c.setLayout(null);
        
        //設定Jlb_ID大小位置及顯示字型
        Jlb_ID.setLocation(20,10);
        Jlb_ID.setSize(50,20);
        Jlb_ID.setFont(new Font("Serif",Font.BOLD,16));
        c.add(Jlb_ID);
        
        //設定帳號輸入框大小位置及顯示字型
        jid.setLocation(70,10);
        jid.setSize(100,20);
        c.add(jid);
        
        //設定Jlb_PW大小位置及顯示字型
        Jlb_PW.setLocation(20,50);
        Jlb_PW.setSize(50,20);
        Jlb_PW.setFont(new Font("Serif",Font.BOLD,16));
        c.add(Jlb_PW);
        
        //設定密碼輸入框大小位置及顯示字型
        jpw.setLocation(70,50);
        jpw.setSize(100,20);
        jpw.setEchoChar('●');
        jpw.setToolTipText("密碼長度8個字元");
        c.add(jpw);
        
        jpw.addActionListener(hbtHandler);
                
        //設定確定按鈕大小位置及顯示字型
        Jbtn_YES.setLocation(10,90);
        Jbtn_YES.setSize(80,20);
        Jbtn_YES.addActionListener(hbtHandler);
        c.add(Jbtn_YES);
        
        //設定清除按鈕大小位置及顯示字型
        Jbtn_NO.setLocation(100,90);
        Jbtn_NO.setSize(80,20);
        Jbtn_NO.addActionListener(hbtHandler);
        c.add(Jbtn_NO);
        
        //設定視窗
        setSize(200,150);
        setLocation(300,200); 
         setResizable(false);//視窗放大按鈕無效 
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 
    
    private class ButtonHandler implements ActionListener 
    {
        public void actionPerformed(ActionEvent evtE) 
        {
            if(evtE.getSource() == Jbtn_YES)
            {
                //char [] pw = jpw.getPassword();
                //System.out.println(""+pw.toString());
                System.out.println("Y");
            }else if(evtE.getSource() == Jbtn_NO)
            {
                //char [] pw = jpw.getPassword();
                //System.out.println(""+pw.toString());
                System.out.println("N");
            }
        }
    }
    
    public static void main(String [] args)
    {
        JPasswordUI pw = new JPasswordUI();
    }
}