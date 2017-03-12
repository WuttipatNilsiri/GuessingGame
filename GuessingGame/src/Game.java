import java.math.*;
public class Game {
	int randomNum;
	String hint;
	int ans;
	int max;
	int min;
	public Game(int max,int min){
		this.max = max;
		this.min = min;
		double range = (this.max - this.min) + 1;     
		this.randomNum = (int)((Math.random() * range) + min);
		
		hint = "It's between "+ (int) this.max + " and " + (int) this.min;
	}
	/**
	 * 
	 * @return
	 */
	public int getRandomnum(){
		return randomNum;
	}
	/**
	 * 
	 * @return
	 */
	public String getHint(){
		return hint;
	}
	/**
	 * 
	 * @param answer
	 * @return
	 */
	public Boolean isCorrect(){
		boolean s;
		if (ans != randomNum){
			s = false;
		}else
			s = true;
		return s;
	}
	/**
	 * 
	 * @param answer
	 */
	public void setHint(){
		
		if (ans > randomNum){
			hint = "too big";
			if (ans > max) hint = "Out of Bound";
		}else if (ans < randomNum){
			hint = "too small";
			if (ans < max) hint = "Out of Bound";
		}else 
			hint = "correct";
		
		
		
	}
	public void setAns(int ans){
		this.ans = ans;
		setHint();
		
	}
	

}
