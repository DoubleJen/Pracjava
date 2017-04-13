package tw.pracdou001;

public class Test2 {

	public static void main(String[] args) {
		String aa = "Test2";
		String bb = new String("Test2");
		String cc = new String(aa);
		String dd = new String(bb);
		
		if(dd == cc){
			System.out.println("same");
		}else{
			System.out.println("not same");
		}
		
		if(dd.equals(cc)){
			System.out.println("same");
		}
		
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);
		System.out.println("-----------------");
		
		char[] ee ={'e'};
		String eee =new String(ee);
		System.out.println(eee);
		

	}

}
