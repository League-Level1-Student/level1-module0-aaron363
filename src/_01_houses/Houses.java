package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
		Robot rob = new Robot();
		rob.setAngle(0);
		rob.penDown();
		rob.setSpeed(50);
		rob.setPenWidth(5);
		rob.moveTo(50, 400);
		rob.turn(90);
		rob.setPenColor(0, 150, 0);
		rob.move(35);
		
		house(rob, "small", 255, 0, 0, true);
		house(rob, "large", 0, 0, 255, true);
		house(rob, "medium", 255, 200, 100, false);
		
		
		house(rob, "small", 255, 0, 0, true);
		house(rob, "medium", 100, 240, 90, true);
		house(rob, "large", 255, 200, 120, false);
		
		house(rob, "medium", 255, 0, 0, false);
		house(rob, "small", 0, 0, 255, true);
		house(rob, "large", 100, 240, 90, true);
		house(rob, "small", 255, 200, 100, false);
		
	}
	public void house(Robot rob, String height, int r, int g, int b, boolean pointyRoof) {
		int _height = 120;
		if(height.equals("small")) {
			_height = 60;
		}else if(height.equals("medium")) {
			_height = 120;
		}else if(height.equals("large")) {
			_height = 250;
		}else {
			_height = 120;
		}
		
		if(pointyRoof == false || _height == 250) {
			rob.setAngle(0);
			rob.setPenColor(r, g, b);
			rob.penDown();
			rob.setSpeed(50);
			rob.setPenWidth(5);
			rob.move(_height);
			rob.turn(90);
			rob.move(40);
			rob.turn(90);
			rob.move(_height);
			rob.turn(-90);
			rob.setPenColor(0, 150, 0);
			rob.move(35);
		}else if(pointyRoof = true && _height == 120 || _height == 60) {
			rob.setAngle(0);
			rob.setPenColor(r, g, b);
			rob.penDown();
			rob.setSpeed(50);
			rob.setPenWidth(5);
			rob.move(_height);
			rob.turn(45);
			rob.move(20);
			rob.turn(90);;
			rob.move(20);
			rob.turn(45);
			rob.move(_height);
			rob.turn(-90);
			rob.setPenColor(0, 150, 0);
			rob.move(35);
		}
		
	}
}
