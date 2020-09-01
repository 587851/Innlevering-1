package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave4 {

	public static void main(String[] args) {
		
		int bruttoInntekt = parseInt(showInputDialog("Din bruttoinntekt: "));
			
	
        double trinn0 = 0;
        double trinn1 = 0.0093;
        double trinn2 = 0.0241;
        double trinn3 = 0.1152;
        double trinn4 = 0.1452;
		
		if (bruttoInntekt > 0 && bruttoInntekt <= 180800) {
		    showMessageDialog(null, "Trinnskatten din er på " + bruttoInntekt*trinn0 + " kr");
			
		}
		else if (bruttoInntekt > 180800 && bruttoInntekt <= 254500) {
			showMessageDialog(null, "Trinnskatten din er på " + (int)((bruttoInntekt*trinn1) + 0.5) + " kr");
			
		}
		else if (bruttoInntekt > 254500 && bruttoInntekt <= 639750) {
			showMessageDialog(null, "Trinnskatten din er på " + (int)((bruttoInntekt*trinn2) + 0.5) + " kr");
			
		}
		else if (bruttoInntekt > 6396750 && bruttoInntekt <= 999550) {
			showMessageDialog(null, "Trinnskatten din er på " + (int)((bruttoInntekt*trinn3) + 0.5) + " kr");
		
		}
		else {
			showMessageDialog(null, "Trinnskatten din er på " + (int)((bruttoInntekt*trinn4) + 0.5) + " kr");
		}
		

	}

}