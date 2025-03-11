import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/** 
 * Modified version of FileColorChoosers that uses a single ActionListener
 * for all menu items
 */
public class MyChoosers extends JFrame {
    private JTextArea text = new JTextArea();
    private JFileChooser fileChoose = new JFileChooser();
    private JDialog colorDlg;
    private JColorChooser colorChoose = new JColorChooser();
    
    private class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            
            switch(command) {
                case "FILE_OPEN":
                    loadFile();
                    break;
                    
                case "EXIT":
                    dispose();
                    System.exit(0);
                    break;
                    
                case "CHANGE_COLOR":
                    if (colorDlg == null) {
                        colorDlg = JColorChooser.createDialog(
                            MyChoosers.this,
                            "Select Text Color",
                            true,
                            colorChoose,
                            new ColorOKListener(),
                            null
                        );
                    }
                    colorChoose.setColor(text.getForeground());
                    colorDlg.setVisible(true);
                    break;
            }
        }
    }

    public MyChoosers(String titleText) {
        super(titleText);
        setJMenuBar(buildMenuBar());
        text.setEditable(false);
        Container cp = getContentPane();
        cp.add(new JScrollPane(text), BorderLayout.CENTER);
        setBounds(350, 350, 500, 400);
        setVisible(true);
    }

    public void loadFile() {
        int result = fileChoose.showOpenDialog(this);
        File file = fileChoose.getSelectedFile();
        if (file != null && result == JFileChooser.APPROVE_OPTION) {
            try {
                FileReader fr = new FileReader(file);
                text.setText("");
                char[] charBuffer = new char[4096];
                int charsRead = fr.read(charBuffer, 0, charBuffer.length);
                while (charsRead != -1) {
                    text.append(new String(charBuffer, 0, charsRead));
                    charsRead = fr.read(charBuffer, 0, charBuffer.length);
                }
                fr.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

    public JMenuBar buildMenuBar() {
        // Create the action listener
        ActionListener menuListener = new MenuActionListener();
        
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu colorMenu = new JMenu("Color");
        
        // Create menu items with action commands
        JMenuItem fileOpenItem = new JMenuItem("File Open...");
        fileOpenItem.setActionCommand("FILE_OPEN");
        
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setActionCommand("EXIT");
        
        JMenuItem colorsItem = new JMenuItem("Change Color...");
        colorsItem.setActionCommand("CHANGE_COLOR");

        fileMenu.setMnemonic(KeyEvent.VK_F);
        colorMenu.setMnemonic(KeyEvent.VK_C);
        fileOpenItem.setMnemonic(KeyEvent.VK_O);
        exitItem.setMnemonic(KeyEvent.VK_X);
        colorsItem.setMnemonic(KeyEvent.VK_C);

        fileOpenItem.addActionListener(menuListener);
        exitItem.addActionListener(menuListener);
        colorsItem.addActionListener(menuListener);

        menuBar.add(fileMenu);
        menuBar.add(colorMenu);
        fileMenu.add(fileOpenItem);
        fileMenu.add(exitItem);
        colorMenu.add(colorsItem);

        return menuBar;
    }

    class ColorOKListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Color c = colorChoose.getColor();
            text.setForeground(c);
            text.repaint();
        }
    }

    public static void main(String[] args) {
        MyChoosers app = new MyChoosers("File and Color Choosers");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}