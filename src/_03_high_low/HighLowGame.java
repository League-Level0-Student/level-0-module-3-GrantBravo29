//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		
	System.out.println(random);	
		// 2. Print out the random variable above
		
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i <10 ; i++) {
			
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String guess = JOptionPane.showInputDialog("guess a number 1 - 100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
int guesss = Integer.parseInt(guess);	
			// 5. if the guess is correct
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			
if(guesss==random) {
	
	JOptionPane.showMessageDialog(null, "you won");
	System.exit(0);

	
}

else if(guesss>random) { 
	JOptionPane.showMessageDialog(null, "too high ");
	
}

	
	

 else if(guesss<random) { 
	JOptionPane.showMessageDialog(null, "too low ");
 }
		}
// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low
JOptionPane.showMessageDialog(null, "you lost, try again");		
		// 13. Tell them they lose
	}
}






