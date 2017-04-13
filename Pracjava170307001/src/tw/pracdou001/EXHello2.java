package tw.pracdou001;

public class EXHello2 {
    private String name;
    
    public EXHello2(){
        name = "nobody";
        System.out.println(name);
    }
 
    public EXHello2(String name){
        this.name = name;
        System.out.println(name);
    }
 
    public void hello(){
        System.out.print("Hello ");
        System.out.println(this.name);
    }
 
    public void setName(String name){
        this.name = name;
        System.out.println(name);
    }
    
    public static void main(String[] args) {
    	EXHello2 aa = new EXHello2();
    	EXHello2 bb = new EXHello2("Tony");
    	System.out.println("--------------");
    	
    	aa.hello();
    	aa.setName("MIKE");
    	bb.hello();
    	bb.setName("Double");
    	
    }
}
