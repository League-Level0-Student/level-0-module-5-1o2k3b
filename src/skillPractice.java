import java.util.Random;

import javax.swing.JOptionPane;

public class skillPractice {
public static void main(String[] args) {
	skillPractice skills = new skillPractice();
	skills.skill1();
	skills.skill2();
	skills.skill3();
	skills.skill4();
	skills.skill5();
}
private void skill5() {
String s = JOptionPane.showInputDialog("what school dp you go to");
JOptionPane.showInputDialog(s + " That school is as good as the guy that jumps on the deck and flops like a fish");
}
private void skill4() {
String x = JOptionPane.showInputDialog("what city do you live in?");
if(x.equalsIgnoreCase("San Diego")) {
	JOptionPane.showInputDialog("You live in americas finest city");
}
else {
	JOptionPane.showInputDialog("Move to san diego");
	String e = JOptionPane.showInputDialog("how many cars do you/your family have");
	int cars = Integer.parseInt(e);
	if(cars <= 0) {
		JOptionPane.showInputDialog("you must use public transportation.");
	}
	if(cars == 1) {
JOptionPane.showInputDialog("here is free tesla.");
	}
	if(cars > 1) {
		JOptionPane.showInputDialog("would thst be 8, 10 or 12 wheels, but this isnt question.");
	}
}
}
private void skill3() {
Random ran = new Random();
int q = ran.nextInt(20);
System.out.println(q);	
Random ra = new Random();
int w = ra.nextInt(10);
System.out.println(w);	
JOptionPane.showInputDialog(q-w);
}

void skill2() {

	for(int i = 0; i<31; i+=3) {
		System.out.println(i);
	}
}

void skill1() {
String x = JOptionPane.showInputDialog("how many dimes do you have?");
int y = Integer.parseInt(x);
int g = y*10;
JOptionPane.showInputDialog("you have"+g+" cents");
String e = JOptionPane.showInputDialog("how tall are you in inches?!!!");
int a = Integer.parseInt(e);
if(a <= 36) {
	JOptionPane.showInputDialog("eat your wheaties!");
}
}
}
