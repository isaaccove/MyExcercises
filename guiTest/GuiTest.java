package guiTest;
import javax.swing.JOptionPane;


public class GuiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int g = -1;
		while (g < 0) {
			String input = JOptionPane.showInputDialog("Please Enter your Name: ");
			if(input.length() > 0) {
				g++;
				//System.out.println("Thank You for your Time");
				JOptionPane.showMessageDialog(null, "Thanks to you All");
				
			}
			else {
				System.out.println("Enter your Name: ");
			}
		}

	}

}
