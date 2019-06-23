package _04_are_you_happy;
import javax.swing.JOptionPane;

public class are_you_happy {

public static void main(String[] args) {
	

	String hi = JOptionPane.showInputDialog("Are You Happy?");

if(hi.equals("yes")) {
	JOptionPane.showMessageDialog(null, "keep doing whatever your doing");
}


else if(hi.equals("no")) { 
	
	String hii= JOptionPane.showInputDialog("do you want to be happy?");
	if(hii.equals("no")) {
		JOptionPane.showMessageDialog(null,"keep doing whatever your doing" );
	}
	else if(hii.equals("yes"))	{
		JOptionPane.showMessageDialog(null, "change something");	
			
	}
		}
	}
	
}



