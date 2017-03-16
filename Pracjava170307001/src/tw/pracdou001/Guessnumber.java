package tw.pracdou001;

import javax.swing.JOptionPane;

//猜數字Guess Number
public class Guessnumber {
	
	//Method: create a answer(0-9中產生3碼不重複的字串)
	static String createAnswer(int d){//c.創造一createAnswer方法，宣告等下傳回字串
		boolean[] check = new boolean[10];	//0-9中共10個樣本空間，位置 0 - 9: false
		int[] poker = new int[d]; //產生3碼，位置 0-2: 0
		int temp; int counter=0;
		for (int i=0; i<poker.length; i++){
			do{
				temp = (int)(Math.random()*10);
				counter++;
			}while (check[temp]);
			poker[i] = temp;
			check[temp] = true;
		}
		String ret = "";
		for(int v:poker){ret += v;}
		return ret;
		//return " " + poker[0] + poker[1] + poker[2];//d.傳回字串
											 		//抽出poker陣列中的位置0 1 2(第1 2 3個數)
											 		//poker原為整數陣列，所以poker[0]+poker[1]+poker[2]結果為整數
											 		//方法宣告為字串，所以須回傳字串才合邏輯。
											 		//空字串加整數為字串，字串加整數為字串，....
	}
	
	
	// method: checkAB(answer, guess) => ?A?B
	static String checkAB(String answer, String guess){
		int A, B; A = B = 0;
		for(int i=0; i<guess.length(); i++){//字串.length()：呼叫方法；陣列.length：屬性
			if(guess.charAt(i) == answer.charAt(i)){A++;}
			else if(answer.indexOf(guess.charAt(i)) != -1){B++;}//"!="：不等於
		}
		return A + "A" + B + "B";
	}

	
	public static void main(String[] args) {
		System.out.println("Assignment：Guess Number, totally 10 chances!!!");
		System.out.println();//Assignment下空一行
		
		//1.	Create Answer
		String answer = createAnswer(3);//a.宣告一謎底，其為字串。無API，可自創一方法createAnswer
									   //b.static方法只能呼叫static方法
									   //e.於createAnswer方法創立後，呼叫產生謎底
									   //在createAnswer方法中定義int d(ex line6)可於此處()中控制answer的長度
		System.out.println(answer);
		
		
		//2.	Start Play
		boolean isWinner = false;
		String hist = "";
		for(int i=0; i<10; i++){
			//2.1.	Input a number string
			String guess =JOptionPane.showInputDialog((i+1) + ".猜一個數字\n" + hist);
			//2.2.	Compare with Answer, and return result: ?A?B
			String result = checkAB(answer, guess);
			hist += (i+1) + ". " + guess + ":" + result + "\n";
			JOptionPane.showMessageDialog(null, result);
			//2.3.	Guess Right =>Break Loop =>3.Show Ending Message "Congratulaiton, WINNER!!!"
			if(result.equals("3A0B")){isWinner = true; break;}
			//2.4.	Guess Error =>Repeat 10 times =>3.Show Ending Message "TOO BAD!!!"
		}
			
		
		//3.	Ending Message
		if(isWinner){JOptionPane.showMessageDialog(null, "Congratulaiton, WINNER!!!");}
		else{JOptionPane.showMessageDialog(null, "TOO BAD!!! Answer is" + answer);}
		
	}

}
