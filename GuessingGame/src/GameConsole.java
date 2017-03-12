import java.math.*;
import java.util.Scanner;
public class GameConsole {
	public static void main(String[]args){
		int mindebug = 0;
		int maxdebug = 0;
		String con = "";
		int num1 = readInt("#1 number : ");
		int num2 = readInt("#2 number : ");
		if (num1 >= num2){
			maxdebug = num1;
			mindebug = num2;
		}else if(num1 < num2){
			maxdebug = num2;
			mindebug = num1;
		}
			
			
		 
		Game g = new Game(maxdebug,mindebug);
		System.out.println(g.getHint());
		int count = 0;
		while(con != "q"){
			int answer = readInt("answer : ");
			if(answer <= maxdebug && answer >= mindebug){
				g.setAns(answer);
				if(g.isCorrect()){
					count++;
					System.out.println("Correct! " + "The Secret is " + g.getRandomnum() + " Total count : " + count);
					con = "q";
					break;
				}
				else
					count++;
					g.setHint();
					System.out.println(g.getHint() + " count : " + count);
			}
			else 
				System.out.println("Out of Bound");
		}
		System.out.println("Thank for play");
	}
	/**
	 * 
	 * @param text
	 * @return
	 */
	public static int readInt(String text){
		Scanner in = new Scanner(System.in);
		System.out.print(text);
		return in.nextInt();
	}

}
