package tw.pracdou001;

import javax.swing.JOptionPane;

public class Check_NumtoChinese {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("請輸入數字");
		char a = '0';
		for(int i=0; i<input.length(); i++){
			a = input.charAt(i);
			
		}
		System.out.println(a);
		switch(a){
				case '1': System.out.println("壹"); break;
				default: System.out.println("空空如也"); break;
			}

		
		
//		int num = 10;
//		switch(num){
//			case 10:
//				System.out.println("拾億");
				
		
	}

}


