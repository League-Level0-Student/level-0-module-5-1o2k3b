import java.util.Random;

import javax.swing.JOptionPane;

public class skillPractice {
public static void main(String[] args) {
	skillPractice skills = new skillPractice();
	skills.skill1();
	skills.skill2();
	skills.skill3();
}

private void skill3() {
Random ran = new Random();
int q = ran.nextInt(20);
System.out.println(q);	
Random ra = new Random();
int w = ra.nextInt(20);
System.out.println(w);	
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
