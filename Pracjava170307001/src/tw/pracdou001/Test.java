package tw.pracdou001;

import java.util.Scanner;

public class Test {
	public static void main(String [] args){

		
        String str1, str2, str3;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("請輸入一字串：(不包含空白字元、空白鍵、Tab)");
        str1 = scanner.next();
        str2 = scanner.next();
        str3 = scanner.next();
        System.out.println("您輸入的字串一為：\n" + str1 );
        System.out.println("您輸入的字串一為：\n" + str2 );
        System.out.println("您輸入的字串一為：\n" + str3 );
	}
	
}
