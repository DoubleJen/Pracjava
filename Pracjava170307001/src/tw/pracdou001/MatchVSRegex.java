package tw.pracdou001;
//match V.S. Regular Expression(正規表示法)
//https://zh.wikipedia.org/zh-tw/%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8F
//http://www.webpage.idv.tw/maillist/maillist4/pro/05/regular1.htm
//http://deerchao.net/tutorials/regex/regex.htm
public class MatchVSRegex {

	public static void main(String[] args) {
		String s1 = "1000";//-->true
		System.out.println(s1.matches("^[0-9]*$"));//只能輸入數字，樣式必須出現0次以上(>0) 
		System.out.println("1.----------------------------------------------------");

		String s2 = "123";//-->true
		System.out.println(s2.matches("^[\\d]{3}$"));//只能輸入3位的數字 。序列「\\」符合「\」。\d：數字字元。
		System.out.println("2.----------------------------------------------------");		
		
		String s3 = "12345";//-->true
		System.out.println(s3.matches("^[\\d]{4,}$"));//只能輸入至少4位的數字。
		System.out.println("3.----------------------------------------------------");		
		
		String s4 = "1234";//-->true
		System.out.println(s4.matches("^[\\d]{4,5}$"));//只能輸入4~5位的數字。
		System.out.println("4.----------------------------------------------------");		

		String s5 = "#123456";//-->false
		System.out.println(s5.matches("^0|([1-9][0-9]*)$"));//只能輸入零或非零開頭的數字。(x|y)：樣式是x或者是y
		System.out.println("5.----------------------------------------------------");
		
		String s6 = "0.12";//-->true
		System.out.println(s6.matches("^[0-9]+(.[0-9]{2})?$"));//只能輸入有2位小數的正實數。?：樣式必須出現0或1次(0 or 1)。
		System.out.println("6.----------------------------------------------------");
		
		String s7 = "0";//-->true
		System.out.println(s7.matches("^[0-9]+(.[0-9]{1,3})?$"));//只能輸入有1~3位小數的正實數。?：樣式必須出現0或1次(0 or 1)。
		System.out.println("7.----------------------------------------------------");

		String s8 = "1234567890";//-->true
		System.out.println(s8.matches("^[\\+]?[1-9]([0-9]*)$"));//只能輸入非0的正整數。
		System.out.println("8.----------------------------------------------------");

		String s9 = "-1234567890";//-->true
		System.out.println(s9.matches("^[\\-][1-9]([0-9]*)$"));//只能輸入非0的負整數。
		System.out.println("9.----------------------------------------------------");

		String s10 = "#@1";//-->true
		System.out.println(s10.matches("^.{3}$"));//只能輸入長度為 3 的字符。.：任何字元，換行除外。
		System.out.println("10.----------------------------------------------------");
		
		String s11 = "bB";//-->true
		System.out.println(s11.matches("^[A-Za-z]+$"));//只能輸入由 26 個英文字母組成的字符串。+：樣式必須出現1次以上(>1)。
		System.out.println("11.----------------------------------------------------");
		
		String s12 = "bB";//-->false
		System.out.println(s12.matches("^[A-Z]+$"));//只能輸入由 26 個大寫英文字母組成的字符串。
		System.out.println("12.----------------------------------------------------");
		
		String s13 = "bB";//-->false
		System.out.println(s13.matches("^[a-z]+$"));//只能輸入由 26 個小寫英文字母組成的字符串。
		System.out.println("13.----------------------------------------------------");
		
		String s14 = "bB1";//-->true
		System.out.println(s14.matches("^[0-9A-Za-z]+$"));//只能輸入由數字和 26 個英文字母組成的字符串。
		System.out.println("14.----------------------------------------------------");
		
		String s15 = "Az012_";//-->true
		System.out.println(s15.matches("^[\\w]+$"));//只能輸入由數字、26 個英文字母或者下劃線組成的字符串。\w：[A-Za-z0-9_]。
		System.out.println("15.----------------------------------------------------");

		String s16 = "a1234567890abcdef_";//-->true
		System.out.println(s16.matches("^[a-zA-Z][\\w]{5,17}$"));//驗證用戶密碼，正確格式為：以字母開頭，長度在 6~18 之間(含字母)，只能包含字符、數字和下劃線。
		System.out.println("16.----------------------------------------------------");
		
		String s17 = "\\";//-->true
		System.out.println(s17);
		System.out.println(s17.matches("^[%&』,;=?$\"\\\\^]+[\\d]*$"));//驗證字串開頭是否含有%&』,;=?$"\^等字符。
		System.out.println(s17.matches("^[%&』,;=?$\"\\x5C^]+[\\d]*$"));//\改為ASCII寫法。https://zh.wikipedia.org/wiki/ASCII
		System.out.println(s17.matches("^[%&』,;=?$\"\\u005C^]+[\\d]*$"));//\改為Unicode寫法。https://zh.wikipedia.org/wiki/Unicode%E5%AD%97%E7%AC%A6%E5%88%97%E8%A1%A8
			//System.out.println(s17.matches("^[%&』,;=?$\"\\^]+[\\d]*$"));//^前需補兩個\\
		System.out.println("17.----------------------------------------------------");
		
		String s18 = "資策會";//-->true
		System.out.println(s18);
		System.out.println(s18.matches("^[\\u4E00-\\u9FA5]{0,}$"));//驗證只能輸入漢字。
		System.out.println("18.----------------------------------------------------");
		//http://blog.udn.com/glwang/3931534
		//https://blog.oasisfeng.com/2006/10/19/full-cjk-unicode-range/
		//http://www.cns11643.gov.tw/AIDB/welcome.do
		
		
		
		
		
		
	}

}
