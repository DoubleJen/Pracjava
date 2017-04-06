package tw.pracdou001;
//Scanner
//https://dotblogs.com.tw/freedom42408/2013/11/20/130586
//http://blog.csdn.net/uucai/article/details/10050129
import java.util.Scanner;
import java.util.regex.MatchResult;

public class Scan {
	public static void main(String[] args) {
//		第一種 nextInt()：取得使用者輸入的整數
		int n1, n2, n3;
		System.out.println("請輸入三個數字(以空白鍵分開)：");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		System.out.println("您輸入第一個數字為：" + n1);
		System.out.println("您輸入第二個數字為：" + n2);
		System.out.println("您輸入第三個數字為：" + n3);
		//Scanner默認使用的分隔符是空格、ENTER和tab。
		
		
//		第二種 nextFloat()：取得使用者輸入的浮點數
//		float f1, f2, f3;
//		System.out.println("請輸入三個浮點數(以Tab鍵分開)：");
//		Scanner sc1 = new Scanner(System.in);
//		f1 = sc1.nextFloat();
//		f2 = sc1.nextFloat();
//		f3 = sc1.nextFloat();
//      System.out.println("您輸入第一個浮點數為：" + f1 );
//      System.out.println("您輸入第二個浮點數為：" + f2 );
//      System.out.println("您輸入第三個浮點數為：" + f3 );
        
		
//		第三種 nextLine()：取得使用者輸入的字串(包含空白字元、空白鍵、Tab)
//		String str1, str2, str3;
//		System.out.println("請輸入一字串：");
//		Scanner sc2 = new Scanner(System.in);
//		str1 = sc2.nextLine();
//		str2 = sc2.nextLine();
//		str3 = sc2.nextLine();
//		System.out.println("您輸入的字串一為：\n" + str1 );
//		System.out.println("您輸入的字串一為：\n" + str2 );
//		System.out.println("您輸入的字串一為：\n" + str3 );
		
		
//		第四種 next()：取得使用者輸入的字串(不包含空白字元、空白鍵、Tab)
//		String str4, str5, str6;
//		System.out.println("請輸入一字串：(不包含空白字元、空白鍵、Tab)");
//		Scanner sc3 = new Scanner(System.in);
//		str4 = sc3.next();
//		str5 = sc3.next();
//		str6 = sc3.next();
//		System.out.println("您輸入的字串一為：\n" + str4 );
//		System.out.println("您輸入的字串一為：\n" + str5 );
//		System.out.println("您輸入的字串一為：\n" + str6 );
		
		
//		第五種delimiter()：分隔符
//	     String input = "1 fish 2 fish red fish blue fish";
//	     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
//	     System.out.println(s.nextInt());
//	     System.out.println(s.nextInt());
//	     System.out.println(s.next());
//	     System.out.println(s.next());
//	     s.close(); 
		
//	     String input = "1 fish 2 fish red fish blue fish";
//	     Scanner s = new Scanner(input);
//	     String find = s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
//	     System.out.println(find);
//	     MatchResult result = s.match();
//	     System.out.println(result);
//	     for (int i=1; i<=result.groupCount(); i++)
//	         System.out.println(result.group(i));
//	     s.close();
	     //http://www.howsoftworks.net/javaapi/java.util/scanner_findinline.html
		
//		Scanner sc = new Scanner(System.in);  
//        sc.useDelimiter("a");  
//        while (sc.hasNext()) {  
//            System.out.println("hasNext()判斷為true,我還有下一個：");  
//            System.out.println("下一個輸出是："+sc.next());
//        }
        
	}

}
