package tw.pracdou001;//Phone, CellPhone, Date, Time, IP

import javax.swing.JOptionPane;

class Phone{
	Phone(){
		String p = JOptionPane.showInputDialog("請輸入電話號碼, 如02-27208889");
		while(!p.matches("^(0[\\d]{1,3})-?([\\d]{5,8})$")){
			JOptionPane.showMessageDialog(null, "您輸入的格式有誤，請重新輸入");
			p = JOptionPane.showInputDialog("請輸入電話號碼, 如02-27208889");
		}
		System.out.println(p);
	}
}

class CellPhone{
	CellPhone(){
		String c = JOptionPane.showInputDialog("請輸入手機號碼, 如0932-888555");
		while(!c.matches("^(09[\\d]{2})-?([\\d]{6})$")){
			JOptionPane.showMessageDialog(null, "您輸入的格式有誤，請重新輸入");
			c = JOptionPane.showInputDialog("請輸入手機號碼, 如0932-888555");
		}
		System.out.println(c);
	}
}

class Date{
	Date(){
		String d = JOptionPane.showInputDialog("請輸入西元年月日, 如2017-03-01");
		while(!d.matches("^([\\d]{1,4})-(0?[1-9]|1[0-2])-(0?[1-9]|(1|2)[0-9]|30|31)$")){
			JOptionPane.showMessageDialog(null, "您輸入的格式有誤，請重新輸入");
			d = JOptionPane.showInputDialog("請輸入西元年月日, 如2017-03-01");
		}
		System.out.println(d);
	}
}

class Time{
	Time(){
		String t = JOptionPane.showInputDialog("請輸入時間, 如13:59:17");
		while(!t.matches("^([0-2][0-9])((:[0-5][0-9]){2})$")){
			JOptionPane.showMessageDialog(null, "您輸入的格式有誤，請重新輸入");
			t = JOptionPane.showInputDialog("請輸入時間, 如13:59:17");
		}
		System.out.println(t);
	}
}

class IP{
	IP(){
		String i = JOptionPane.showInputDialog("請輸入IP位址, 如192.168.0.0");
		while(!i.matches("^([12]?[\\d]?[\\d])(.[12]?[\\d]?[\\d]){3}$")){
			JOptionPane.showMessageDialog(null, "您輸入的格式有誤，請重新輸入");
			i = JOptionPane.showInputDialog("請輸入IP位址, 如192.168.0.0");
		}
		System.out.println(i);
	}
}



public class HWRegex001 {
	public static void main(String[] args) {
		System.out.println("Assignment：既定格式下，印出市內電話、手機號碼、西元年月日、時間（時:分:秒）、IP位址");
		System.out.println();//Assignment下空一行
		
		Phone p1 = new Phone();
		CellPhone c1 =new CellPhone();
		Date d1 = new Date();
		Time t1 = new Time();
		IP i1 = new IP();
	}

}
