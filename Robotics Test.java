package org.usfirst.frc.team86.robot;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.IterativeRobot;
public class Robot extends IterativeRobot{
  // Java is boring

  public void TeleopInit() {
    // you do not need most of this
    Shooter.init();
    Drive.itit();
  }
  public void IO() {
    public static Victor Sh = new Victor(0); // first two letters in test
    public static Victor Co = new Victor(1);
    public static Victor Ag = new Victor(2);
    public static Victor Vi = new Victor(3);
    public static Victor Sn = new Victor(4);
    public static Victor LFD = new Victor(5); // sorry I just do not want to type that out
    public static Victor LRD = new Victor(6); // these accronyms are the first letters in the var names in the test
    public static Victor RFD = new Victor(7);
    public static Victor RRD = new Victor(8);
    public static JoyStick LJ = new JoyStick(0);
    public static JoyStick RJ = new JoyStick(1);
    public static JoyStick CoJ = new JoyStick(2);

   }

};
class Shooter {
  public void init() {
    Sh.set(0);
    Co.set(0);
    Ag.set(0);
    Vi.set(0);
    Sn.set(0);
    LFD.set(0);
    LRD.set(0);
    RFD.set(0);
    RRD.set(0);
  }
  public void update() {
   if (CoJ.button1) {
      Sh.set(0.65);
      Co.set(1);
      Ag.set(0);
      Vi.set(0);

   } else if (CoJ.button3)
     Sh.set(0.65);
     Co.set(1);
     Ag.set(0.3);
     Vi.set(0.5);
   } else {
     Sh.set(0);
     Co.set(0);
     Ag.set(0);
     Vi.set(0);
   }
   if (CoJ.button5) {
     Sn.set(0.25);
   } else {
     Sn.set(0);
   }

};
class Drive {
  tim = System.currentTimeMillis();
  Rob = new RobotDrive();
  shooter.update();
  public void init() {
    LFD.set(0);
    LRD.set(0);
    RFD.set(0);
    RRD.set(0);
  }
  public void autoUpdate() {

    if (System.currentTimeMillis() - tim <= 300) {
      LFD.set(0.5);
      LRD.set(0.5);
      RFD.set(0.5);
      RRD.set(0.5);
    } else if (System.currentTimeMillis() - tim <= 550)
      LFD.set(0.25);
      LRD.set(0.25);
      RFD.set(-0.25);
      RRD.set(-0.25);
  } else if (System.currentTimeMillis() - tim <= 850) {
    LFD.set(-0.5);
    LRD.set(-0.5);
    RFD.set(-0.5);
    RRD.set(-0.5);
  } else {
    LFD.set(0);
    LRD.set(0);
    RFD.set(0);
    RRD.set(0);
  }
  public void teleopUpdate() {
    private LMset = LJ.getY();
    private RMset = RJ.getY();
    LFD.set(LMset);
    LRD.set(LMset);
    RFD.set(RMset);
    RRD.set(RMset);
  }
}
