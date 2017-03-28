package tw.pracdou001;


public class Test {
	public static void main(String [] args){
		for(int i=1; i<=31; i++){
			String s = Integer.toString(i);
			System.out.println(s + "\t" + s.matches("(^0?[1-9]|(1|2)[0-9]|30|31)$"));
			//System.out.println(s.matches("(^0?[1-9]|(1|2)[0-9]|30|31)$"));
		}
		
        
	}
	
}
