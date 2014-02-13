
package test.main.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import test.main.RobotMap;

/**
 *
 */
public class Catapult extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void shoot(double speed){
        RobotMap.leftCatapult.set(speed);
        RobotMap.rightCatapult.set(speed);
    }
}

