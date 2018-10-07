package strings_and_dialogs;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
public static void main(String[] args) {
	String message = JOptionPane.showInputDialog("What do you like?");
	JOptionPane.showMessageDialog(null, "Talk about lame, you like " + message + "?");
	JOptionPane.showMessageDialog(null, "What a loser");
	}
}
