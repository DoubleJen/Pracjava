package tw.pracdou001;
//String字串基礎練習
public class String001 {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(str);//-->abc
		
		char[] data = {'a', 'b', 'c'};
	    String str1 = new String(data);
	    System.out.println(str1);//-->abc
	    
	    System.out.println("abc");//-->abc
	    System.out.println("-------------------------");
	    
	    String cde = "cde";
	    System.out.println("abc" + cde);//-->abccde
	    System.out.println("-------------------------");
	    
	    String txt1 = "abcdefghijk";
	    System.out.println(txt1.substring(2));//-->跳過txt1字串前2字母後，產生cdefghijk
	    System.out.println("abcdefghijk".substring(2));//-->結果同上cdefghijk
	    System.out.println(txt1.substring(1, 5));//跳過txt1字串前1字母後，產生(5-1)長度的bcde
	    System.out.println("abcdefghijk".substring(1, 5));//-->結果同上bcde
	    System.out.println("-------------------------");
	    
	    String str2 = new String();
	    System.out.println(str2);//-->""empty.
	    System.out.println("-------------------------");
	    
	    byte[] b1= {97,98,99,100,101,102,103,104};
		String str3 = new String(b1);
					//API REF: public String(byte[] bytes), bytes-The bytes to be decoded into characters 
		
		System.out.println(str3);//-->abcdefgh
		System.out.println(str3.substring(2, 6));//-->cdef
		String str4 = new String(b1, 2, 4);//-->2為b1陣列中跳過的數目，4為跳過後取的長度，產生cdef
					//API REF: String(byte[] bytes, int offset, int length)
		System.out.println("-------------------------");
		
		char c1= str3.charAt(4);//取出str3 0-7中的4
		System.out.println(c1);//e
		System.out.println("abcdefgh".charAt(4));//e
		System.out.println("-------------------------");
		
		System.out.println(str3.indexOf('e'));//-->傳回字母e在str3中位置，產生4
		System.out.println(str3.indexOf('m'));//-->沒有位置的，產生-1
		System.out.println("abcdefgh".indexOf('e'));//-->傳回字母e在"abcdefgh"中位置，產生4
		System.out.println("abcdefgh".indexOf('m'));//-->沒有位置的，產生-1
		System.out.println(str3.indexOf(str4));//-->2
		System.out.println(str3.indexOf("cdef"));//-->2
		System.out.println("abcdefgh".indexOf('f', 2));//-->5
		System.out.println("abcdefgh".indexOf(str4, 2));//-->2
		

	}

}
