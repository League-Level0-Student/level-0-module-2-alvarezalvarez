//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(11);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 0) 
			JOptionPane.showMessageDialog(null, "You are great");
		if (randomNumber == 1) 
			JOptionPane.showMessageDialog(null, "You are cool");
		if (randomNumber == 2) 
			JOptionPane.showMessageDialog(null, "You are awesome");
		if (randomNumber == 3) 
			JOptionPane.showMessageDialog(null, "You are smart");
		if (randomNumber == 4) 
			JOptionPane.showMessageDialog(null, "You are nice");
		if (randomNumber == 5) 
			JOptionPane.showMessageDialog(null, "You are very nice");
		if (randomNumber == 6) 
			JOptionPane.showMessageDialog(null, "You are good");
		if (randomNumber == 7) 
			JOptionPane.showMessageDialog(null, "You are a decent human");
		if (randomNumber == 8) 
			JOptionPane.showMessageDialog(null, "You look great");
		if (randomNumber == 9) 
			JOptionPane.showMessageDialog(null, "You look awesome");
		if (randomNumber == 10) 
			JOptionPane.showMessageDialog(null, "Good job");
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
