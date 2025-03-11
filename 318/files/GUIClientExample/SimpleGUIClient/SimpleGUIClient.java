/**
 * Implement graphics on JPanel to provide smoothier and better graphics
 *
 **/

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUIClient {

    public static void main(String[] args) throws IOException {
 		JFrame app = new JFrame("Simple GUI Client");
 		Image icon = Toolkit.getDefaultToolkit().getImage("okc.png");
 		app.setIconImage(icon);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		app.getContentPane().add(new ClientJPanel());
		app.pack();
		app.setBounds(450,350, 300, 240);
		app.setVisible(true);
    }
}
