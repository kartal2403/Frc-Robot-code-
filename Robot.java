
package frc.robot;



import edu.wpi.first.wpilibj.Joystick;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Robot extends TimedRobot {
  // Test
  Victor rearRight = new Victor(0);
  Victor frontRight = new Victor(1);
  Victor rearLeft = new Victor(2);
  Victor frontLeft = new Victor(3);

  Joystick stick = new Joystick(0);
  SpeedControllerGroup leftMotor = new SpeedControllerGroup(rearLeft,frontLeft);
  SpeedControllerGroup rightMotor = new SpeedControllerGroup(rearRight,frontRight);

  DifferentialDrive m_drive = new DifferentialDrive(leftMotor,rightMotor);

  @Override
  public void robotInit() {}


  @Override
  public void autonomousInit() {
  
  }
  @Override
  public void robotPeriodic() {}

  /mevlana module
  @Override
  public void autonomousPeriodic() {
   
  }

  /** This function is called once when teleop is enabled. */
  @Override
  public void teleopInit() {
   
  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
    m_drive.arcadeDrive(stick.getRawAxis(1)*0.75, stick.getRawAxis(2)*0.75);

    // Motorlara aynı güç verildiğindeki durum
    if(stick.getRawButton(4)){
    leftMotor.set(0.5);
    rightMotor.set(0.5);
    }
    
  }
  // murat kurt tv
// KIZILAY YARDIMI OLABİLİR.
  /** This function is called once when the robot is disabled. */
  @Override
  public void disabledInit() {}

  /** This function is called periodically when disabled. */
  @Override
  public void disabledPeriodic() {}

  /** This function is called once when test mode is enabled. */
  @Override
  public void testInit() {}

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}
}
