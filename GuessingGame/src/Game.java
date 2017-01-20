import java.math.*;
public class Game {
	int randomNum;
	String hint;
	public Game(double max,double min){
		double range = (max - min) + 1;     
		this.randomNum = (int)((Math.random() * range) + min);
		
		hint = "It's between "+ (int) max + " and " + (int) min;
	}
	public int getRandomnum(){
		return randomNum;
	}
	public String getHint(){
		return hint;
	}
	public Boolean isCorrect(int answer){
		boolean s;
		if (answer != randomNum){
			s = false;
		}else
			s = true;
		return s;
	}
	public void setHint(int answer){
		
		if (answer > randomNum){
			hint = "too big";
		}else if (answer < randomNum){
			hint = "too small";
		}
	}
	

}
