import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class DateQuoteClient extends JFrame {
    private JTextField hostnameField;
    private JTextArea displayArea;
    private JRadioButton dateButton;
    private JRadioButton quoteButton;
    private DatagramSocket socket;
    
    public DateQuoteClient() {
        super("DateQuoteClient");
        setupWindow();
        setupNetworking();
    }
    
    private void setupWindow() {
        // Set custom icon
        try {
            Image icon = new ImageIcon("okc.png").getImage();
            setIconImage(icon);
        } catch (Exception e) {
            System.err.println("Error loading icon: " + e.getMessage());
        }
        
        // Create components
        JPanel inputPanel = new JPanel(new BorderLayout(10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Hostname field
        JPanel hostPanel = new JPanel(new BorderLayout());
        hostPanel.add(new JLabel("Hostname: "), BorderLayout.WEST);
        hostnameField = new JTextField("localhost", 20);
        hostPanel.add(hostnameField, BorderLayout.CENTER);
        inputPanel.add(hostPanel, BorderLayout.NORTH);
        
        // Radio buttons
        JPanel choicePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        choicePanel.add(new JLabel("Choice: "));
        dateButton = new JRadioButton("Date", true);
        quoteButton = new JRadioButton("Quote");
        ButtonGroup group = new ButtonGroup();
        group.add(dateButton);
        group.add(quoteButton);
        choicePanel.add(dateButton);
        choicePanel.add(quoteButton);
        inputPanel.add(choicePanel, BorderLayout.CENTER);
        
        // Display area
        displayArea = new JTextArea(10, 40);
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        
        // Buttons
        JPanel buttonPanel = new JPanel();
        JButton sendButton = new JButton("Send");
        JButton clearButton = new JButton("Clear");
        
        sendButton.addActionListener(e -> sendRequest());
        clearButton.addActionListener(e -> displayArea.setText(""));
        
        buttonPanel.add(sendButton);
        buttonPanel.add(clearButton);
        
        // Layout
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout(10, 10));
        contentPane.add(inputPanel, BorderLayout.NORTH);
        contentPane.add(scrollPane, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
        
        // Window settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }
    
    private void setupNetworking() {
        try {
            socket = new DatagramSocket();
        } catch (SocketException e) {
            JOptionPane.showMessageDialog(this, "Error creating socket: " + e.getMessage(),
                "Network Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
    
    private void sendRequest() {
        try {
            String request = dateButton.isSelected() ? "1" : "2";
            byte[] buf = request.getBytes();
            
            InetAddress address = InetAddress.getByName(hostnameField.getText());
            DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);
            socket.send(packet);
            
            buf = new byte[512];
            packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            
            String received = new String(packet.getData(), 0, packet.getLength());
            String prefix = dateButton.isSelected() ? "Date: " : "Quote: ";
            displayArea.append(prefix + received + "\n");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error communicating with server: " + e.getMessage(),
                "Communication Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DateQuoteClient().setVisible(true);
        });
    }
}