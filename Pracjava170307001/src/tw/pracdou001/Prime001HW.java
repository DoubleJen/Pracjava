package tw.pracdou001;
//質數
public class Prime001HW {

	public static void main(String[] args) {
		for(int k=0; k<=9; k++){//k可隨意切換, 達到不同層數效果。
			for(int i=1; i<=10; i++){
				int newi = (i + (k * 10));
				int counter = 0;
					if(newi==1){System.out.print(newi + "\t");}
					else if(newi==2){System.out.print(newi + "***" + "\t"); counter++;}
					else{boolean isPrime =true;
						for(int j = 2; j<newi; j++){
							if(newi%j == 0){isPrime = false; break;}
						}
						if(isPrime){System.out.print(newi + "***" + "\t");}
						else System.out.print(newi + "\t"); counter++;
					} 
			}System.out.println();//讓i*j(同一j下做完換行), ex:2*1 3*1 4*1 5*1後換行			
		}				
		System.out.println("-------------------------------------------------------------");
		System.out.println(counter);
		System.out.println("GOOD JOB!!!");	
		
		
	

	}

}


