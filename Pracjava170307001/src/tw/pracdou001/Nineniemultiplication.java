package tw.pracdou001;
//99乘法
public class Nineniemultiplication {

	public static void main(String[] args) {
		System.out.println("Assignment：顯示九九乘法表");
		System.out.println();//Assignment下空一行
		
		for(int k=0; k<=1; k++){//k可隨意切換, 達到不同層數效果。
			for(int j=1; j<=9; j++){
				for(int i=2; i<=5; i++){
					int newi = (i + (k * 4));
					int result = newi * j;
					System.out.print(newi + " x " + j + " = " + result + "\t");
				}System.out.println();//讓i*j(同一j下做完換行), ex:2*1 3*1 4*1 5*1後換行			
			}System.out.println("-------------------------------------------------------------");
		}
		System.out.println("GOOD JOB!!!");		

	}

}


