package tw.pracdou001;

import java.awt.*;
import java.awt.event.*;
 
public class ButtonDemo implements ActionListener {
    Frame frame;
    Button button1, button2, button3, button4, button5;
     
    public static void main(String[] args) {
        new ButtonDemo();
    }
     
    public ButtonDemo() {
        frame = new Frame("AWTDemo");
        frame.addWindowListener(new AdapterDemo());
        frame.setLayout(new FlowLayout());
         
        button1 = new Button("b1");
        button2 = new Button("b2");
        button3 = new Button("b3");
        button4 = new Button("b4");
        button5 = new Button("b5");
         
        button1.setActionCommand("b1");
        button1.addActionListener(this);
        button2.setActionCommand("b2");
        button2.addActionListener(this);
        button3.setActionCommand("b3");
        button3.addActionListener(this);
        button4.setActionCommand("b4");
        button4.addActionListener(this);
        button5.setActionCommand("b5");
        button5.addActionListener(this);
         
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
         
        frame.pack();
        frame.setVisible(true);
    }
     
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd == "b1") {
            button1.setLabel("new 1");
        }
        if (cmd == "b2") {
            System.out.println("label: " + button2.getLabel());
        }
        if (cmd == "b3") {
            System.out.println("command: " + button3.getActionCommand());
        }
        if (cmd == "b4") {
            System.out.println("hello~~");
        }
        if (cmd == "b5") {
            button1.removeActionListener(this);
            button2.removeActionListener(this);
            button3.removeActionListener(this);
            button4.removeActionListener(this);
        }
    }
}
 
class AdapterDemo extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
 
/* 《程式語言教學誌》的範例程式
    http://pydoing.blogspot.com/
    檔名：ButtonDemo.java
    功能：示範 Java 程式 
    作者：張凱慶
    時間：西元 2012 年 3 月 */
