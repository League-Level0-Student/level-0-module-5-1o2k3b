import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
Robot rob = new Robot();
rob.setSpeed(100);
rob.penDown();
rob.setX(150);
rob.setY(270);
String x = JOptionPane.showInputDialog("ask my robot rob to draw a square triangle or circle");
if(x.equalsIgnoreCase("triangle")) {
	drawTriangle(rob, 100);
}
if(x.equalsIgnoreCase("square")) {
	drawSquare(rob, 100);
}
if(x.equalsIgnoreCase("circle")) {
	drawCircle(rob, 10);
}
}


static void drawSquare(Robot rob, int size) {
	for(int i = 0; i<4; i++) {
		rob.move(size);
		rob.turn(90);
	}

}
static void drawCircle(Robot rob, int size) {
	for(int i = 0; i<4; i++) {
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);			
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);		
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
		rob.move(size);
		rob.turn(3);
	}
}
static void drawTriangle(Robot rob, int size) {
	for(int i = 0; i<3; i++) {
		rob.move(size);
		rob.turn(120);
	}

}
}
