package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave6 {

	public static void main(String[] args) {
		
		int helTall = parseInt(showInputDialog("Positivt heltall: "));
		int helTall2 = helTall;
		int resultat;
		
		if (helTall > 0) {
			
			for(resultat = 1; helTall > 0; --helTall) {
				   resultat = resultat * helTall;
			       }
			       showMessageDialog(null, "Resultatet av " + helTall2 + "! er " + resultat);
		}
		else { 
			showMessageDialog(null, "Ugyldig tall, må vere et positivt heltall");
		}
	}

}

