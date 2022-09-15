
package _01_algorithms._2_fibonacci;
import javax.swing.JOptionPane;

public class unnamed {
public static void main(String[] args) {
	int secondlast = 0;
	int last = 1;
	for(int i = 0; i<12; i++ ) {
		int f = secondlast + last;
		secondlast = last;
		last = f;
		JOptionPane.showInputDialog(f);
		
	}
	
}
}
