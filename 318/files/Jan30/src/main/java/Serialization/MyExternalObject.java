package Serialization;

import java.io.*;

public class MyExternalObject implements Externalizable {
  private int i;
  private String s;

  MyExternalObject() {
    i = 256;
    s = new String( "Instance of MyExternObject..." );
  }

  public int getI() {
    return i;
  }

  public String getS() {
    return s;
  }

  public void writeExternal( ObjectOutput out ) throws
      IOException {
    out.writeInt( this.i );
    out.writeObject( this.s );
  }

  public void readExternal( ObjectInput in ) throws
      IOException, ClassNotFoundException {
    this.i = in.readInt();
    this.s = ( String )in.readObject();
  }
}
