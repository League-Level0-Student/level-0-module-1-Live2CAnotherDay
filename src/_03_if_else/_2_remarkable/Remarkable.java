package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	

		// 1. Save something remarkable about each person in a variable.
	String name = JOptionPane.showInputDialog("Hello, please input a random name into here: ");
		// 2. Ask the user to enter a name. Store their answer in a variable.
	String something_Remarkable = JOptionPane.showInputDialog("Say something remarkable about that person: ");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	String who = JOptionPane.showInputDialog("Great! Everything is saved into the file. If you want to see a person's remarkable traits, then input the name here: ");
	if (name.equalsIgnoreCase(who)) {
		 
			
		
		JOptionPane.showMessageDialog(null, name);
		JOptionPane.showMessageDialog(null, something_Remarkable);
	}
	else {
		JOptionPane.showMessageDialog(null, "I'm sorry but this person is not inside of the file. Bye!");
	
	}



}





	// TODO Auto-generated method stub
	

}

