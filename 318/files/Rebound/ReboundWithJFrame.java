//********************************************************************
//  Rebound.java
//
//  Demonstrates an animation and the use of the Timer class.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReboundWithJFrame extends JFrame
{
   private final int WIDTH = 400, HEIGHT = 200;
   private final int DELAY = 20, IMAGE_SIZE = 35;

   private ImageIcon image;
   private Timer timer;
   private int x, y, moveX, moveY;
   private Container cpane;

   //-----------------------------------------------------------------
   //  Sets up the panel, including the timer for the animation.
   //-----------------------------------------------------------------
   public ReboundWithJFrame(String title)
   {
   	  super(title);
      timer = new Timer(DELAY, new ReboundListener());

      //image = new ImageIcon (getClass().getResource("happyFace.png"));
      image = new ImageIcon ("happyFace.png");

      x = 0;
      y = 40;
      moveX = moveY = 3;
	  cpane = getContentPane();
      cpane.setSize (WIDTH, HEIGHT);
      cpane.setBackground (Color.black);
      setBounds(350,300,WIDTH, HEIGHT);
      setVisible(true);
      timer.start();
   }

   //-----------------------------------------------------------------
   //  Draws the image in the current location.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {
      super.paint (page);
      image.paintIcon (this, page, x, y);
   }

   //*****************************************************************
   //  Represents the action listener for the timer.
   //*****************************************************************
   private class ReboundListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Updates the position of the image and possibly the direction
      //  of movement whenever the timer fires an action event.
      //--------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         x += moveX;
         y += moveY;

         if (x <= 0 || x >= WIDTH-IMAGE_SIZE)
            moveX = moveX * -1;

         if (y <= 0 || y >= HEIGHT-IMAGE_SIZE)
            moveY = moveY * -1;

         repaint();
      }
   }



   //-----------------------------------------------------------------
   //  Displays the main frame of the program.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      ReboundWithJFrame frame = new ReboundWithJFrame ("Rebound");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);


   }
}
