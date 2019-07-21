
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String dogsBirthday = "August 21th";
		String dadsBirthday = "May 13th";
		String myBirthday = "September 22nd";

		// 2. Find out which birthday the user wants and and store their response in a variable

		// 3. Print out what the user typed
	
String qw =	JOptionPane.showInputDialog	("Which birthday do you want to hear?");

if(qw.equals("myBirthday")){

JOptionPane.showMessageDialog(null, "September 22nd");
}
else if(qw.equals("dogsBirthday")) {
	
	JOptionPane.showMessageDialog(null, "August 21th");
	
}
	
else if(qw.equals("dadsBirthday")){
	JOptionPane.showMessageDialog(null, "May 13th");
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	} 
}
