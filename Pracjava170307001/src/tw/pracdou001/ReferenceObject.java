package tw.pracdou001;

public class ReferenceObject {
	ReferenceObject instance;
	
	public ReferenceObject(){
	instance = this;
	}
	
	public void test(){
	System.out.println(this);
	}
	
	public static void main(String[] args){
		ReferenceObject t =new ReferenceObject();
		System.out.println("=============");
		t.test();
		System.out.println(t);
	}
}





