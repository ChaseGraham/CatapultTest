
package test.main.commands;

/**
 *
 * @author bradmiller
 */
public class DriveCatapult extends CommandBase {

    public DriveCatapult() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        setTimeout(.2);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        CommandBase.exampleSubsystem.shoot(1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        CommandBase.exampleSubsystem.shoot(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        CommandBase.exampleSubsystem.shoot(0);
    }
}
