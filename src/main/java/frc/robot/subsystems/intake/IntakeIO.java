// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.intake;

import com.ctre.phoenix6.signals.NeutralModeValue;
import org.littletonrobotics.junction.AutoLog;

/** Add your docs here. */
public interface IntakeIO {
  @AutoLog
  public static class IntakeIOInputs {

    public double leftPivotPos = 0.0;
    public double rightPivotPos = 0.0;

    public double feederRightVel = 0.0;
    public double feederLeftVel = 0.0;
    public double feederCurrent = 0.0;
  }

  public default void updateInputs(IntakeIOInputs inputs) {}

  public default void setPivotNeutralMode(NeutralModeValue mode) {}

  public default void setPivotPosition(double posLeft, double posRight) {}

  public default void setFeederVelocity(double velocity) {}

  public default void setFeederDutyCycle(double percentOut) {}
}
