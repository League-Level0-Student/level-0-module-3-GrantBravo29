package _16_obedient_robot;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;


public class Obidient_Robot {
	static Robot rob = new Robot();
	public static void main(String[] args) {
	String shape = JOptionPane.showInputDialog("What shape do you want to draw?");
if(shape.equals("circle")) {
rob.hide();
	rob.penDown();
drawCircle();
	
}	
	
else if(shape.equals("square")) {
	
drawSquare();	
}


{



 if(shape.equals("triangle")) {

drawTriangle();



}}


	}
	
public static void drawSquare() {

rob.setSpeed(20);
rob.sparkle();
rob.hide();
rob.setRandomPenColor();
rob.setPenWidth(100);
rob.hide();
rob.penDown();

for (int i = 0; i < 4; i++) {
	rob.move(100);	
	rob.turn(90);
}
}

public static void drawTriangle() {
rob.penDown();

for (int i = 0; i < 3; i++) {
	rob.move(100);
	rob.turn(120);
}
}
public static void drawCircle() {
	
for (int i = 0; i < 360; i++) {
	rob.turn(1);
rob.move(1);
}


}
}