import java.math.*;
public class Game {
	int randomNum;
	String hint;
	public Game(double max,double min){
		double range = (max - min) + 1;     
		this.randomNum = (int)((Math.random() * range) + min);
		
		hint = "It's between "+ (int) max + " and " + (int) min;
	}
	/**
	 * get number that it already random with in the bound
	 * @return that number
	 */
	public int getRandomnum(){
		return randomNum;
	}
	/**
	 * get hint that was setted
	 * @return hint that already set
	 */
	public String getHint(){
		return hint;
	}
	/**
	 * find is it equal number that randomed
	 * @param answer input answer 
	 * @return is it correct answer
	 */
	public Boolean isCorrect(int answer){
		boolean s;
		if (answer != randomNum){
			s = false;
		}else
			s = true;
		return s;
	}
	/**
	 * set hint by compare the answer with randomed number
	 * @param answer input answer
	 */
	public void setHint(int answer){
		
		if (answer > randomNum){
			hint = "too big";
		}else if (answer < randomNum){
			hint = "too small";
		}
	}
	

}
