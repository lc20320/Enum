import javax.swing.JOptionPane;

/**
* 
* Luis Cervantes<br>
* 10/25/16<br>
* This is an enum exercise using switch case loop and JOptionPane
*
*/

public class Enum { 
      	
	public enum Month {January, February, March, April, May, June, July, August, September, October, November, December}
			
		public static void main(String[] args) { 
								
		Month[] choices = { Month.January, Month.February, Month.March, Month.April, Month.May, Month.June, Month.July, Month.August, Month.September, Month.October, Month.November, Month.December }; 
		Month input = (Month) JOptionPane.showInputDialog(null,"Select a month.", "Months", 
											               
                JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]); 
													                            
															                 
                while (input!=null) { 
																			                   	 
		String monthString = null;
																					                 
		switch(input) {
			case December: case January: case February:  monthString = "Do you want to build a snowman?";
				break;
			case March: case April: case May: monthString = "Happy Spring days!";
			        break;
			case June: case July: case August: monthString = "It's Summer lovin'";
			        break;
			case September: case October: case November: monthString = "Welcome to the foliage season!";
			     	break;
			default:; }  
																																																		                	 
		JOptionPane.showMessageDialog(null, input + "\n" + monthString);
																																																							   
		input = (Month) JOptionPane.showInputDialog(null,"Select a month.", "Months", 
		JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);
		}																																																									             	
	}
}
