

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

