

public class Robot {
  // Java is boring
  public void TeleopInit() {
    // you do not need most of this
    Shooter.init();
    Drive.itit();
  }
  public void IO() {
    Sh = new Victor(0); // first two letters in test
    Co = new Victor(1);
    Ag = new Victor(2);
    Vi = new Victor(3);
    Sn = new Victor(4);
    LFD = new Victor(5); // sorry I just do not want to type that out
    LRD = new Victor(6); // these accronyms are the first letters in the var names in the test
    RFD = new Victor(7);
    RRD = new Victor(8);
    LJ = new JoyStick(0);
    RJ = new JoyStick(1);
    CoJ = new JoyStick(2);

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
    private LMset = LJ.getY;
    private RMset = RJ.getY;
    LFD.set(LMset);
    LRD.set(LMset);
    RFD.set(RMset);
    RRD.set(RMset);
  }
}
