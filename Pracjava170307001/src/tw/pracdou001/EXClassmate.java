package tw.pracdou001;

class Classmate{
	  String name;
	  int height;
	  int weight;
	  
	  Classmate(){
	   System.out.println("0參數的自構函數");
	  }
	  
	  Classmate(String name, int height, int weight){
	   this();
	   this.name = name;
	   this.height = height;
	   this.weight = weight;
	   System.out.println("三個參數的自構函數");
	  }
	  
	  void discuss(){
	   System.out.println("In " + this.name + " Opinion");
	   
	  }
	 
}
