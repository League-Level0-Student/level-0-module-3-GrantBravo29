//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


package _08_shiny_objects;

import java.applet.AudioClip;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class ShinyObjects {
	public static void main(String[] args) {
		// 2. Ask the user how many shiny objects they want

		// 3. Play the sound that many times
String hi = JOptionPane.showInputDialog("How many shiny objects do you want?");
		// 1. Call the method below

	
	
	
int num=Integer.parseInt(hi);
for (int i = 0; i < num; i++) {
	playMisterZee();
}	
	
	
	
	
	
	
	
	
	
	
	
	}


	
	public static void playMisterZee() {
		try {
			AudioClip sound = JApplet.newAudioClip(ShinyObjects.class.getResource("shiny-objects.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


}
