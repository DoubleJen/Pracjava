package tw.pracdou001;
//JAVA八大型別(float double char boolean未整理)
public class Type001 {

	public static void main(String[] args) {
		
		/*variable definition rule,
		 * 1st digital use [a-zA-Z$_]
		 * 2nd digital use [a-zA-Z0-9$_]*...
		 * don't use keyword(color word)]
		 */
		
		//big5 = 2bytes = 2^16 = 65536 ; UTF8=2^24 
		int $_$=1234567890;
		System.out.println($_$);//-->1234567890
		System.out.println("--------------------------------");
		
		
		//整數型態byte(2^8), short(2^16), int(2^32), long(2^64)
		byte var1=111;
		byte var2, var3=127, var4, var5=-11;
			//var2,4無給值稱無初始化-->error var2,4 may not have been initialized.-->無法運算
		System.out.println(var1);//-->111
		System.out.println(var1+var5);//-->100
		System.out.println(var1-var5);//-->122
		System.out.println(var1*var5);//-->-1221
		System.out.println(var1/var5);//-->-10
		System.out.println("--------------------------------");
		
		var5 ++;
			//++ is 遞增運算子(位移), http://pydoing.blogspot.tw/2010/10/java-operator.html
		System.out.println(var5);//-->-10
		
		var5 --;
			//-- is 遞減運算子(位移), http://pydoing.blogspot.tw/2010/10/java-operator.html
			//var5 line25已遞增過一次, var5 line29會以line25的結果進行遞減。
		System.out.println(var5);//-->-11
		
		var5 +=5;
			//+= is 相加同時指派 , http://pydoing.blogspot.tw/2010/10/java-operator.html
			//-11+5=-6
		System.out.println(var5);//-->-6
		System.out.println("--------------------------------");
		
		var5 = (byte)(3 + var5);
			/*
			 * 3 & var5單位不同, 因此需要加上"(byte, short, int, long...)"強制轉換為byte, short, int, long...
			 */
		System.out.println(var5);//>-3
		System.out.println("--------------------------------");
		System.out.println("GOOD JOB!!!");

		
	}

}
