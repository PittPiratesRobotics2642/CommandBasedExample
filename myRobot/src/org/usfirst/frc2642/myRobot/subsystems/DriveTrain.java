// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2642.myRobot.subsystems;

import org.usfirst.frc2642.myRobot.RobotMap;
import org.usfirst.frc2642.myRobot.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController frontLeftMotor = RobotMap.driveTrainFrontLeftMotor;
    SpeedController rearLeftMotor = RobotMap.driveTrainRearLeftMotor;
    SpeedController frontRightMotor = RobotMap.driveTrainFrontRightMotor;
    SpeedController rearRightMotor = RobotMap.driveTrainRearRightMotor;
    RobotDrive robotDrive = RobotMap.driveTrainrobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new MecanumDefault());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void mecanumDrive(Joystick stick) {
    	robotDrive.mecanumDrive_Cartesian(stick.getX(), stick.getY(), stick.getTwist(), 0);
    }
    
    public void driveFoward(double speed) {
    	robotDrive.mecanumDrive_Cartesian(speed, 0, 0, 0);
    }
    
    
    
}
