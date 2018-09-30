package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraf {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setSpeed(100);
		r2d2.turn(-90);
		r2d2.move(80);
		r2d2.turn(-90);
		r2d2.move(80);
		r2d2.turn(-90);
		r2d2.move(80);
		r2d2.penUp();
		r2d2.moveTo(100, 200);
	}

}
