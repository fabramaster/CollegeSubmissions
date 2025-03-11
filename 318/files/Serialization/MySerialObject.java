import java.io.*;

public class MySerialObject implements Serializable {
  private transient int i;
  private String s;
  MyInternalObject mio;

  MySerialObject() {
    i = 64;
    s = new String( "Instance of MySerialObject..." );
    mio = new MyInternalObject();
  }

  public int getI() {
    return i;
  }

  public String getS() {
    return s;
  }

  public void displayInternalObjectAttrs() {
    System.out.println( mio.getS() );
    System.out.println( "i = " + mio.getNum() );
  }
}
