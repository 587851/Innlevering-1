package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave5 {

	public static void main(String[] args) {
		
		for(int student = 1; student<=10; student++ ) {
		
		int poeng = parseInt(showInputDialog("Din poengsum: "));
		
		if ( poeng <= 100 && poeng >=90) {
			showMessageDialog(null, "Din poengsum tilsvarer karakteren A");
			
		}
		else if (poeng <= 89 && poeng >=80) {
			showMessageDialog(null, "Din poengsum tilsvarer karakteren B");
			
		}
		else if (poeng <= 79 && poeng >=60) {
			showMessageDialog(null, "Din poengsum tilsvarer karakteren C");
			
		}
		else if (poeng <= 59 && poeng >=50) {
			showMessageDialog(null, "Din poengsum tilsvarer karakteren D");
		
		}
		else if (poeng <= 49 && poeng >=40) {
			showMessageDialog(null, "Din poengsum tilsvarer karakteren E");	
			
		}
		else if (poeng <= 39 && poeng >=0) {
			showMessageDialog(null, "Din poengsum tilsvarer karakteren F");		
			
		}
		else {
			showMessageDialog(null, "Ugyldig poengsum, skriv på nytt!");
			student--;
		}
		
		}
		int a = 1%2;
		
		System.out.println(a);

	}

}
