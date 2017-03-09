package tw.pracdou001;

public class Type001 {

	public static void main(String[] args) {
		
		/*variable definition rule,
		 * 1st digital use [a-zA-Z$_]
		 * 2nd digital use [a-zA-Z0-9$_]...
		 * don't use keyword(color word)]
		 */
		
		//big5 = 2bytes = 2^16 = 65536 ; UTF8=2^24 
		int $_$=1234567890;
		System.out.println($_$);
		
		
		//byte(2^8), short(2^16), int(2^32), long(2^64)
		byte var1=111;
		byte var2, var3=127, var4, var5=-11;
			//var2/4無給值稱無初始化-->error var2/4 may not have been initialized.-->無法運算
		System.out.println(var1+var5);
		
		var5 ++;
			//++ is 遞增運算子(向前位移),http://pydoing.blogspot.tw/2010/10/java-operator.html
		System.out.println(var5);
		
		var5 +=10;
			//TODO += is 
		System.out.println(var5);
		
	}

}
