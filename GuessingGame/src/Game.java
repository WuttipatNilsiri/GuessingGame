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
	public Boolean isCorrect(int answer){
		boolean s;
		if (answer != randomNum){
			s = false;
		}else
			s = true;
		return s;
	}
	/**
	 * 
	 * @param answer
	 */
	public void setHint(int answer){
		
		if (answer > randomNum){
			hint = "too big";
		}else if (answer < randomNum){
			hint = "too small";
		}
	}
	

}
