package tw.pracdou001;
//LayoutManager(FlowLayout, BorderLayout, CardLayout, GridLayout, GridBagLayout)
//http://ccy.dd.ncu.edu.tw/~chen/course/Java/ch6/6.htm
//http://www.kaiching.org/2011/05/java-gridbaglayout.html
//http://www.kaiching.org/2012/06/java-api-gridbagconstraints.html
import java.awt.*;
import java.applet.*; 
import java.awt.event.*;   

public class LayoutManager extends Applet implements ActionListener{
	Panel myPanel;
	Button[] myButton= new Button[5];
    CardLayout Card=new CardLayout(); 
        
    public void init(){
    	myPanel = new Panel();
    	myPanel.setLayout(Card);
    	this.add(myPanel);
        for (int i=0;i<5;i++){
	        myButton[i] = new Button("This is " + String.valueOf(i)+" class.");
	        myPanel.add(String.valueOf(i), myButton[i]);
	        myButton[i].addActionListener(this);            
        }               
     }
    
    public void actionPerformed(ActionEvent theEv){
	    if (theEv.getSource()==myButton[0]||theEv.getSource()==myButton[1]
	           ||theEv.getSource()==myButton[2]||theEv.getSource()==myButton[3]
	       ||theEv.getSource()==myButton[4])
	            {Card.next(myPanel);}
    }
    
}