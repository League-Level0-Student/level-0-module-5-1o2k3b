package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class imtired {
public static void main(String[] args) {
String z = JOptionPane.showInputDialog("say a number");
int j = Integer.parseInt(z);
for(int i = 2; i<j; i++) {
	if(j % i == 0) {
		JOptionPane.showInputDialog("that isnt prime");
		return;
	}
	}
JOptionPane.showInputDialog("that is prime");
}
}
