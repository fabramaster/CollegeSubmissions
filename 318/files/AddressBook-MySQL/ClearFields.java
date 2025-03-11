// ClearFields.java
// Class ClearFields definition

import java.awt.*;
import java.awt.event.*;

public class ClearFields implements ActionListener {
   private ScrollingPanel fields;

   public ClearFields( ScrollingPanel f )
   {
      fields = f;
   }

   public void actionPerformed( ActionEvent e )
   {
      fields.id.setText( "" );
      fields.first.setText( "" );
      fields.last.setText( "" );
      fields.address.setText( "" );
      fields.city.setText( "" );
      fields.state.setText( "" );
      fields.zip.setText( "" );
      fields.country.setText( "" );
      fields.email.setText( "" );
      fields.home.setText( "" );
      fields.fax.setText( "" );
   }
}