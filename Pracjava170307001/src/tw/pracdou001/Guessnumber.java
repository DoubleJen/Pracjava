package tw.pracdou001;
//猜數字Guess Number
public class Guessnumber {

	public static void main(String[] args) {
		System.out.println("Assignment：Guess Number, totally 10 chances!!!");
		System.out.println();//Assignment下空一行
		
		static String CreateAnswer(){
			int[] Answer = new int[3];//新增一整數陣列，位置0 1 2，其值均為0
			for(int i=0; i<Answer.length; i++){
				int temp = (int)(Math.random()*10);
			}
			
		}
		
		//1.	Create Answer
		String answer = "123";
		System.out.println(answer);
		
		
		//2.	Start Play
			//2.1.	Input a number
			//2.2.	Compare with Answer, and return ?A?B
			//2.3.	Guess Right =>Break Loop =>3.Show Ending Message "Congratulaiton, WINNER!!!"
			//2.4.	Guess Error =>Repeat 10 times =>3.Show Ending Message "TOO BAD!!!"
		
		//3.	Ending Message
		
		
	}

}
