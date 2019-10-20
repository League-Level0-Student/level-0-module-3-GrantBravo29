package _16_obedient_robot;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;


public class Obidient_Robot {
	static Robot rob = new Robot();
	public static void main(String[] args) {
	
if(JOptionPane.showInputDialog("What shape do you want to draw?") != null) {


	
	
	
	
	
	
}	
	drawSquare();
drawTriangle();
drawCircle();






	}
	static int e = 1655636;
public static void drawSquare() {

rob.setSpeed(20);
rob.setPenWidth(4);
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
	rob.turn(e);
rob.move(e);
}


}
}