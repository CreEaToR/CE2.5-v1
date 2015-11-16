import javax.swing.JOptionPane;


public class Ce25 {

	public static void main(String[] args) {
	
		int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a 1, 5, or 10 dollar bill"));
		
		int pennies = 0;
		
		int dimes = 0;
		
		int quarters = 0;
		
		int nickles = 0;
		
		
		if(input == 1){
			
			pennies = 100;
			dimes = 10;
			quarters = 4;
			nickles = 20;
			
			
			JOptionPane.showMessageDialog(null, "Pennies: " + pennies +
					   "\n" + "Dimes: " + dimes +
					   "\n" + "Quarters: " + quarters +
					   "\n" + "Nickles: " + nickles);
			
		}else if(input == 5){
			
			
			
			pennies = 500;
			dimes = 50;
			quarters = 20;
			nickles = 100;
		
			
			JOptionPane.showMessageDialog(null, "Pennies: " + pennies +
					   "\n" + "Dimes: " + dimes +
					   "\n" + "Quarters: " + quarters +
					   "\n" + "Nickles: " + nickles);
			
			
			
			
		}else if(input == 10){
			
			pennies = 1000;
			dimes = 100;
			quarters = 40;
			nickles = 200;
			
			JOptionPane.showMessageDialog(null, "Pennies: " + pennies +
					   "\n" + "Dimes: " + dimes +
					   "\n" + "Quarters: " + quarters +
					   "\n" + "Nickles: " + nickles);
			
		
			
			
			
		}
	}

}
