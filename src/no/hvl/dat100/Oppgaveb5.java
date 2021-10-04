package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
public class Oppgaveb5 {

	public static void main(String[] args) {
		int karakter = Integer.parseInt(showInputDialog("skriv inn poeng"));
		
		
		if (karakter <= -1)
			showMessageDialog(null,"ugyldig poeng");
		else if (karakter <= 39)
			showMessageDialog(null,"karakter f");
		else if (karakter <=49)
			showMessageDialog(null,"karakter e");
		else if (karakter <=59)
			showMessageDialog(null,"karakter d");
		else if (karakter <=79)
			showMessageDialog(null,"karakter c");
		else if (karakter <=89)
			showMessageDialog(null,"karakter b");
		else if (karakter <=100)
			showMessageDialog(null,"karakter a");
		else if (karakter >=101)
			showMessageDialog(null,"karkter ugyldig poeng");
		
	}

}
