import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//JOptionPane = pop up a standard dialog box that prompts users for a value
		//				or informs them of something
		
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);;
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);;
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE);;
		//while(true) {
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.WARNING_MESSAGE);;
		//}
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.ERROR_MESSAGE);;

		//int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code?", "title", JOptionPane.YES_NO_CANCEL_OPTION);
		//String name = JOptionPane.showInputDialog("What's ur name?: ");
		//System.out.println("Hello " + name);
		String[] responses = {"No, ur awesome", "thank you!", "blush*"};
		
		ImageIcon icon = new ImageIcon("742751.png");
		
		JOptionPane.showOptionDialog(null, "ur awesome", "title", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
	}
}
