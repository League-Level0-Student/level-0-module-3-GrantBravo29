//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		String color=	JOptionPane.showInputDialog("what color do you wasnt him to use\n" + 
				"		");
		
		 
		
	Robot rob = new Robot();	
	if(color.equals("red")) {
	
		rob.setPenColor(Color.red);
	}
	if(color.equals("yellow")) {
			
			rob.setPenColor(Color.yellow);
		}
		rob.setSpeed(100);
		rob.penDown();	
		
		rob.setPenWidth(10);
			rob.move(150);
			rob.turn(90);
			rob.move(150);
			rob.turn(90);
			rob.move(150);
			rob.turn(90);
			rob.move(150);
			rob.turn(90);
			rob.hide();

		
		//1. Create a new Robot
		
		//3. Ask the user what color they would like the robot to draw
		
		//5. Use an if/else statement to set the pen color that the user requested

        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
