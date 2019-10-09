package daysOfWeek;
import javax.swing.JOptionPane;


public class DaysOfWeek {
	
	public void show() {
			int number;
			String kk = "PLEASE PUT MONEY IN THE BANK FIRSTS!!! lolZZZZZ";
			number = Integer.parseInt(JOptionPane.showInputDialog("Please Enter the number"));
			
			
			switch (number) {
			
			case 0:
				JOptionPane.showMessageDialog(null, "Today is Sunday: " + number );
				break;
			
			case 1:
				JOptionPane.showMessageDialog(null, "Today is Monday: " + number );
				break;
				
			case 2:
				JOptionPane.showMessageDialog(null, "Today is Tuesday: " + number );
				break;
				
			case 3:
				JOptionPane.showMessageDialog(null, "Today is Wednesday: " + number);
				break;
				
			case 4:
				JOptionPane.showMessageDialog(null, "Today is Thursday: " + number);
				break;
				
			case 5:
				JOptionPane.showMessageDialog(null, "Today is Friday: " + number);
				break;
				
			case 6:
				JOptionPane.showMessageDialog(null, "Today is Saturday: " + number);
				break;
				
				
			}
			
			
			
			
			
			
			JOptionPane.showMessageDialog(null, "Thank you for using COVE BABA's application: " + kk);
			

		}

	}



