package tw.pracdou001;


class Person{
	public static void prt(String s){
	System.out.println(s);
	}
	
	Person(){
	prt("A Person.");
	}
	
	Person(String name){
	prt("A person name is:"+name);
	}
}
public class EXChinese extends Person{
	EXChinese(){
	super(); //調用父類構造函數（1）
	prt("A chinese.");//(4)
	}
	
	EXChinese(String name){
	super(name);//調用父類具有相同形參的構造函數（2）
	prt("his name is:"+name);
	}
	
	EXChinese(String name,int age){
	this(name);//調用當前具有相同形參的構造函數（3）
	prt("his age is:"+age);
	}
	
	public static void main(String[] args){
	EXChinese cn=new EXChinese();
	System.out.println("=================");
	cn=new EXChinese("kevin");
	System.out.println("=================");
	cn=new EXChinese("kevin",22);
	}
}
