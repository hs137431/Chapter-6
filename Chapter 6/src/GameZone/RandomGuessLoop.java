package GameZone;
import javax.swing.JOptionPane;
public class RandomGuessLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int guess;
			int result;
			String resultString, msg;
			int low = 1;
			int high = 100;
			int score = 10;
			result = low + (int)(Math.random() * high);
			do { 
				
			resultString = JOptionPane.showInputDialog(null, "Try to guess my number between " + low + " and " + high);
			guess = Integer.parseInt(resultString);
			score--;
			if (score < 1) {
				msg = "You Lose!!!";
			}
			else
			if(guess == result) {
				msg = "You Win!!!";
			}
			else
				if(guess < result)
				{
					msg = "Too Low";
					
				}
				else
					msg = "Your guess was too high";
			JOptionPane.showMessageDialog(null, msg + " Your Score is " + score);
			
		}while(guess != result && score > 0);
	}
	public static void displayRunGame()
	{
		
	}
}
