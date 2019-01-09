package org.usfirst.frc.team2658.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain extends  Thread{
	public void run() {
		driveTankDrive(robot.ryansDriveTrain, 1,1.5, robot.ryan.getY(Hand.kLeft), robot.ryan.getY(Hand.kRight));
	}
	Robot robot;
	
	
	public DriveTrain(Robot robot) {
		this.robot= robot;
	}
	public void driveTankDrive(DifferentialDrive driveTrain, double power, double curve, double leftAxis, double rightAxis) {
		int constR=1,  constL=1;
		if(rightAxis<0) {
			constR=1;
		}
		else if(rightAxis>0) {
			constR=-1;
		}
		if(leftAxis<0) {
			constL=1;
		}
		else if(leftAxis>0) {
			constL=-1;
		}
		driveTrain.tankDrive(constL*power*Math.pow(Math.abs(leftAxis), curve), constR*power*Math.pow(Math.abs(rightAxis), curve));
	}

}
