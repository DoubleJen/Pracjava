package tw.pracdou001;

public class EXSimpleMath {
	 	public static final double PI = 3.141596;
	    public static double circumference(double r){return PI * r * r;
	    }
	 
	    public static double area(double r){return PI * r * r;
	    }
	 
	    public static double volumn(double r){return PI * r * r * r * 4 / 3;
	    }
	
	public static void main(String[] args) {
		System.out.println("PI = " + EXSimpleMath.PI);
		System.out.println("圓周長: " + EXSimpleMath. circumference(2.1));
		System.out.println("圓面積: " + EXSimpleMath.area(2.1));
		System.out.println("球體積: " + EXSimpleMath.volumn(2.1));

	}

}
