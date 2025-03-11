// Average.java

// Class-average program with sentinel-controlled repetition.
import java.text.DecimalFormat;  // class to format numbers
import javax.swing.JOptionPane;

public class Average {

   public static void main( String args[] )
   {
      int total;           // sum of grades
      int gradeCounter;    // number of grades entered
      int grade;           // grade value

      double average;  // number with decimal point for average

      String gradeString;  // grade typed by user

      // initialization phase
      total = 0;         // initialize total
      gradeCounter = 0;  // initialize loop counter

      // processing phase
      // get first grade from user
      gradeString = JOptionPane.showInputDialog(null,
         "Enter Integer Grade or -1 to Quit:","Input",JOptionPane.INFORMATION_MESSAGE);

      // convert gradeString to int
      grade = Integer.parseInt( gradeString );

      // loop until sentinel value read from user
      while ( grade != -1 ) {
         total = total + grade;            // add grade to total
         gradeCounter = gradeCounter + 1;  // increment counter

         // get next grade from user
         gradeString = JOptionPane.showInputDialog(null,
         "Enter Integer Grade or -1 to Quit:","Input",JOptionPane.INFORMATION_MESSAGE);


         // convert gradeString to int
         grade = Integer.parseInt( gradeString );

      } // end while

      // termination phase
      DecimalFormat twoDigits = new DecimalFormat( "0.00" );

      // if user entered at least one grade...
      if ( gradeCounter != 0 ) {

         // calculate average of all grades entered
         average = (double) total / gradeCounter;

         // display average with two digits of precision
         JOptionPane.showMessageDialog( null,
            "Class average is " + twoDigits.format( average ),
            "Class Average", JOptionPane.INFORMATION_MESSAGE);

      } // end if part of if...else

      else // if no grades entered, output appropriate message
         JOptionPane.showMessageDialog( null, "No grades were entered",
         	"Class Average", JOptionPane.INFORMATION_MESSAGE);

      System.exit( 0 );  // terminate application

   } // end main

} // end class Average