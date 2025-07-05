package _03_print_and_popups._5_awesome_or_not;

import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main(String[] args) throws InterruptedException {
		
	
	
		Random ran = new Random(new Date().getTime());    //This will be used below to make a random number. 
	
		// 2. Make a variable that will hold a random whole number
	
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(); 
		int value = ran.nextInt(4);
		// 3. Print your variable to the console
		System.out.println(value);
		// 4. Get the user to enter something that they think is awesome
		String name = JOptionPane.showInputDialog(null,"Enter something that you think is awesome");
		// 5. If your variable is  0
		if(value == 0) {
			JOptionPane.showMessageDialog(null,"That is awesome");
		}
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
		if (value == 1) {
			// -- tell the user whatever they entered is ok.
			JOptionPane.showMessageDialog(null,"That is ok");
		}
		// 7. If your variable is  2
		if (value == 2) {
			JOptionPane.showMessageDialog(null, "That is boring");
			// -- tell the user whatever they entered is boring.
		}
		// 8. If your variable is  3
		if (value == 3) {
			JOptionPane.showMessageDialog(null, "That is interesting");
		}
			// -- invent your own message to give to the user (be nice).
	}
}
