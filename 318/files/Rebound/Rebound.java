//********************************************************************
//  Rebound.java
//
//  Demonstrates an animation and the use of the Timer class.
//********************************************************************


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rebound
{
   //-----------------------------------------------------------------
   //  Displays the main frame of the program.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Rebound");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new ReboundPanel());
      frame.setBounds(350,300, 400, 200);
      frame.pack();
      frame.setVisible(true);
   }
}
