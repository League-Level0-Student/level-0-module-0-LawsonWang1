package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String answer = JOptionPane.showInputDialog("What is the largest continent by area?");
				// 3.  Use an if statement to check if their answer is correct
				if (answer.toLowerCase().contains("asia")) {
				score +=1;	
				} else {
				score -=1;
				}
				
				// 4.  if the user's answer was correct, add one to their score 
				answer = JOptionPane.showInputDialog("How many bones are in the human body?");
				if (answer.contains("206")) {
				score +=1;
				} else {
				score -=1;
				}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		System.out.println(score);
		JOptionPane.showMessageDialog(null, "Your score is " + score + ".");
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
