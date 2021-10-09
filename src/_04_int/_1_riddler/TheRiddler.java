package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
int score = 0;

		// 1. Make a variable to hold the score
JOptionPane.showMessageDialog(null, "Hello Challenger! Get a question right and your score goes up! If not your score goes down! Good Luck!");
// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

String answer = JOptionPane.showInputDialog("Question: I travel Around the World, Yet I Stick On The Corner. What Am I?");
if (answer.equalsIgnoreCase("Stamp")) {
	score = score + 500;
	JOptionPane.showMessageDialog(null, "Your score right now is: " + score + ".");		
}
else{
	score = score - 1000;
	JOptionPane.showMessageDialog(null, "Your score right now is: " + score + ".");
			
}

///------------------------------------------------------------------------------------------------\\\

String answer1 = JOptionPane.showInputDialog("Question: Paul's Height Is Six Feet, He's An Assistant At A Butcher's Shop, And Wears Size 9 Shoes. What Does He Weigh?");
if (answer1.equalsIgnoreCase("Meat")) {
	score = score + 1500;
	JOptionPane.showMessageDialog(null, "Your score right now is: " + score + ".");	
}
else{
	score = score - 10000;
	JOptionPane.showMessageDialog(null, "Your score right now is: " + score + ".");		
}

///-------------------------------------------------------------------------------------------------\\\

String answer2 = JOptionPane.showInputDialog("Final Question: I Am A Odd Number. Take Away A Letter And I Become Even. What Am I?");
if (answer2.equalsIgnoreCase("Seven")) {
	score = score + 2000;
	JOptionPane.showMessageDialog(null, "Your final score right now is: " + score + ". Thanks for playing :D");
	
}
else{
	score = score - 100000;
	JOptionPane.showMessageDialog(null, "Your final score right now is: " + score + ". I expected more....");		
}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

