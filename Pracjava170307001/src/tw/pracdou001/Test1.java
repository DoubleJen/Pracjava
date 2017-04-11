package tw.pracdou001;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test1 {

	public static void main(String[] args) {
		File fin = new File("./DIREC1/test.txt");
		try {
			FileReader fr = new FileReader(fin);
			//System.out.println(fr.read());
			int frr;
			while((frr = fr.read())!=-1){
				System.out.print((char)frr);
				
			}
			
			//System.out.println("11");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		

	}

}
