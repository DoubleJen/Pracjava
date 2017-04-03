package tw.pracdou001;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolTip;

public class MainClass {

  public static void main(String args[]) {
    JFrame frame = new JFrame("Tooltip");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setBackground(Color.WHITE);
    panel.setToolTipText("<HtMl>Tooltip<br>Message");
    frame.add(panel, BorderLayout.CENTER);

    JButton button = new JButton("Hello, World") {
      public JToolTip createToolTip() {
        JToolTip tip = super.createToolTip();
        tip.setBackground(Color.YELLOW);
        tip.setForeground(Color.RED);
        return tip;
      }

      public boolean contains(int x, int y) {
        if (x < 100) {
          setToolTipText("x < 100");
        } else {
          setToolTipText("else");
        }
        return super.contains(x, y);
      }
    };
    
    button.setToolTipText("Hello, World");
    frame.add(button, BorderLayout.NORTH);

    frame.setSize(300, 150);
    frame.setVisible(true);
  }
}