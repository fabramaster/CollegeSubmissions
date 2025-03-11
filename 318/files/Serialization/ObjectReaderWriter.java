import java.awt.*;
import java.io.*;

public class ObjectReaderWriter {
  String filePath;

   ObjectReaderWriter() {

    try {
      //  Create instances of each data class to be serialized.
      MySerialObject serialObject = new MySerialObject();

      MyExternalObject externalObject = new MyExternalObject();

      MyVersionObject versionObject = new MyVersionObject();

      //  Allow the user to specify an output file.
      FileDialog fd = new FileDialog( new Frame(),
        "Save As...", FileDialog.SAVE );
      //fd.setVisible(true); //setVisible() is the newer method replacing show() method.
      fd.show();
      filePath = new String( fd.getDirectory() + fd.getFile() );

   	   //  Create a stream for writing.
      FileOutputStream fos = new FileOutputStream( filePath );

      //  Next, create an object that can write to that file.
      ObjectOutputStream outStream = new ObjectOutputStream( fos );

      //  Save each object.
      outStream.writeObject( serialObject );

      externalObject.writeExternal( outStream );

      outStream.writeObject( versionObject );

      //  Finally, we call the flush() method for our object, which forces the data to
      //  get written to the stream:
      outStream.flush();

      //  Allow the user to specify an input file.
      fd = new FileDialog( new Frame(), "Open...",
          FileDialog.LOAD );
      //fd.setVisible(true); //setVisible() is the newer method replacing show() method.
      fd.show();
      filePath = new String( fd.getDirectory() + fd.getFile() );

      //  Create a stream for reading.
      FileInputStream fis = new FileInputStream( filePath );

      //  Next, create an object that can read from that file.
      ObjectInputStream inStream = new ObjectInputStream( fis );

      // Retrieve the Serializable object.
      serialObject = ( MySerialObject )inStream.readObject();

      //  Display what we retrieved:
      System.out.println( serialObject.getS() );
      System.out.println( "i = " + serialObject.getI() );
      serialObject.displayInternalObjectAttrs();

      // Retrieve the Externalizable object.
      externalObject.readExternal( inStream );

      //  Display what we retrieved:
      System.out.println( externalObject.getS() );
      System.out.println( "i = " + externalObject.getI() );

      // Retrieve the versioned object.
      versionObject = ( MyVersionObject )
        inStream.readObject();
      //  Display what we retrieved:
      System.out.println( versionObject.getS() );
      System.out.println( "i = " + versionObject.getI() );

      // Display the SUID of the versioned class in the VM,
      // not necessarily the serialized object.
      ObjectStreamClass myObject = ObjectStreamClass.lookup(
          Class.forName( "MyVersionObject" ) );
      long theSUID = myObject.getSerialVersionUID();

      System.out.println
        ( "The SUID of class MyVersionObject = " + theSUID );
      fis.close();
      fos.close();
    }
    catch ( InvalidClassException e ) {
      System.out.println( "InvalidClassException..." );
    }
    catch ( ClassNotFoundException e ) {
      System.out.println( "ClassNotFoundException..." );
    }
    catch ( OptionalDataException e ) {
      System.out.println( "OptionalDataException..." );
    }
    catch ( FileNotFoundException e ) {
      System.out.println( "FileNotFoundException..." );
    }
    catch ( IOException e ) {
      System.out.println( "IOException..." );
    }
  }

  public static void main( String args[] ) {
    ObjectReaderWriter orw = new ObjectReaderWriter();
    System.exit(0);
  }


}
