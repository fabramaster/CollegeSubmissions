import java.io.*;

public class MyInternalObject implements Serializable {
  private int num;
  private String s;

  MyInternalObject() {
    num = 128;
    s = new String( "Instance of MyInternalObject..." );
  }
  public int getNum() {
    return num;
  }

  public String getS() {
    return s;
  }
}
