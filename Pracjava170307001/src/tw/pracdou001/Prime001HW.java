package tw.pracdou001;
//質數
public class Prime001HW {

	public static void main(String[] args) {
		System.out.println("Assignment：每列10個數字為單位，列出1-100，並於質數後加上***");
		System.out.println();//Assignment下空一行
		
		int counter = 0;//統計質數個數用
		for(int k=0; k<=9; k++){//k可隨意切換, 達到不同層數效果。
			for(int i=1; i<=10; i++){
				int newi = (i + (k * 10));
					if(newi==1){System.out.print(newi + "\t");}
					else if(newi==2){System.out.print(newi + "***" + "\t"); counter++;}//2為質數，所以counter++一次
					else{boolean isPrime =true;
						for(int j = 2; j<newi; j++){
							if(newi%j == 0){isPrime = false; break;}//假如newi除以j(從2開始測 不超過newi)餘數為0，則newi非質數
						}
						if(isPrime){System.out.print(newi + "***" + "\t"); counter++;}//此為質數處，所以每一質數counter++一次
						else System.out.print(newi + "\t");//此為非質數處 
					} 
			}System.out.println();//每十個數字後換行			
		}System.out.println("質數共有：" + counter + "個");				
		System.out.println("------------------------------------------------------------------------");
		System.out.println("GOOD JOB!!!");	
	
	}

}


