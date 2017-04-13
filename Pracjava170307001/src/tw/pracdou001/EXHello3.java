package tw.pracdou001;

public class EXHello3 {
    private String name;
    
    public EXHello3(){
        this("nobody");
        System.out.println(name);
    }
 
    public EXHello3(String name){
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
    	EXHello3 aa = new EXHello3();
    	EXHello3 bb = new EXHello3("Tony");
    	System.out.println("--------------");
    	
    	aa.hello();
    	aa.setName("MIKE");
    	bb.hello();
    	bb.setName("Double");
    	
    }
}
