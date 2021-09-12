package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
public class Oppgaveo3 {

	public static void main(String[] args) {

	long i, fact=1;
long n = parseInt(showInputDialog("Tast inn et tall"));
	for (i=1;i<=n; i ++) {
		fact=fact*i;
		showMessageDialog(null,fact);
	}
	}
}
