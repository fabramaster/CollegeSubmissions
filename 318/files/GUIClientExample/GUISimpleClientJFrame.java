import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUISimpleClientJFrame extends JFrame {
	private JTextField textField = new JTextField("localhost",25);
	private	JRadioButton radioButton1 = new JRadioButton("Get Client's Info", true);
	private	JRadioButton radioButton2 = new JRadioButton("Get Server's Info", false);
	private	JTextArea textDisplay = new JTextArea(5,25);
	private JLabel ip = new JLabel("Server's Address:");
	private	JButton ok = new JButton("Go");
	private	ButtonListener buttonHandler = new ButtonListener ();
	private RadioItemListener itemHandler = new RadioItemListener();
	private String data = "1";

	public GUISimpleClientJFrame() {

		super("GUI Simple Client");

		Container container = getContentPane();
		container.setLayout(new FlowLayout());


		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(radioButton1);
		radioGroup.add(radioButton2);

		container.add(ip);
		container.add(textField);
		container.add(radioButton1);
		container.add(radioButton2);
		container.add(new JScrollPane(textDisplay));
		container.add(ok);


		ok.addActionListener(buttonHandler);
		radioButton1.addItemListener(itemHandler);
		radioButton2.addItemListener(itemHandler);


		setBounds(350,350, 300,240);
		setVisible(true);
	}

	private class RadioItemListener implements ItemListener {
	  public void itemStateChanged (ItemEvent e) {
	  	    //clear textDisplay
           	textDisplay.setText("");

	  	if (e.getItem() == radioButton1)
	  	    data = "1";
	  	 else data = "2";
	 }
   }



	private class ButtonListener implements ActionListener {
	  public void actionPerformed (ActionEvent e) {

	   try {
			// host may be either IP name or IP address
			Socket sock = new Socket("localhost", 2501);
			String addr ="";


           if (data.equals("1")){

           		// get the client-side info
				addr = InetAddress.getLocalHost() + " : " + sock.getLocalPort();
                textDisplay.append("Client's info:   " + addr + "\n");
           }
           else
           {
           		 InetAddress ipAddress = sock.getInetAddress();
				 addr = ipAddress.getHostAddress() + "/" + ipAddress.getHostName() + " : " + sock.getPort();
           		 textDisplay.append("Server's Info: " + addr + "\n");
           }
           sock.close();
          } catch (SocketException se) {
          	textDisplay.append("Socket Exception!");
          } catch (UnknownHostException uhe) {
          	textDisplay.append("Unknown Host Exception!");
          } catch (IOException ioe) {
          	textDisplay.append("IO Exception!");
          }
	  }
	}

    public static void main(String[] args) throws IOException {
 		GUISimpleClientJFrame app = new GUISimpleClientJFrame();
 		Image icon = Toolkit.getDefaultToolkit().getImage("okc.png");
 		app.setIconImage(icon);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
