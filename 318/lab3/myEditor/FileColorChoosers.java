import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
import java.io.*;

/** 
 * Extended version of FileColorChoosers that implements a full text editor
 * with file operations, editing capabilities, and printing support
 */
public class MyEditor extends JFrame {
    private JTextArea text = new JTextArea();
    private JFileChooser fileChooser = new JFileChooser();
    private JDialog colorDlg;
    private JColorChooser colorChoose = new JColorChooser();
    private File currentFile = null;

    private class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            
            switch(command) {
                case "NEW":
                    newFile();
                    break;
                    
                case "OPEN":
                    openFile();
                    break;
                    
                case "SAVE":
                    saveFile();
                    break;
                    
                case "PRINT":
                    printFile();
                    break;
                    
                case "EXIT":
                    dispose();
                    System.exit(0);
                    break;
                    
                case "SELECT_ALL":
                    text.selectAll();
                    break;
                    
                case "DELETE":
                    text.replaceSelection("");
                    break;
                    
                case "COPY":
                    text.copy();
                    break;
                    
                case "CUT":
                    text.cut();
                    break;
                    
                case "PASTE":
                    text.paste();
                    break;
                    
                case "CHANGE_COLOR":
                    if (colorDlg == null) {
                        colorDlg = JColorChooser.createDialog(
                            MyEditor.this,
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

    // Constructor
    public MyEditor(String titleText) {
        super(titleText);
        setJMenuBar(buildMenuBar());
        
        text.setEditable(true);
        text.setFont(new Font("Monospaced", Font.PLAIN, 12));
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        
        Container cp = getContentPane();
        cp.add(new JScrollPane(text), BorderLayout.CENTER);
        setBounds(350, 350, 600, 500);
        setVisible(true);
    }

    private void newFile() {
        if (text.getText().length() > 0) {
            int response = JOptionPane.showConfirmDialog(this,
                "Do you want to save the current file?",
                "Save File?",
                JOptionPane.YES_NO_CANCEL_OPTION);
                
            if (response == JOptionPane.YES_OPTION) {
                saveFile();
            } else if (response == JOptionPane.CANCEL_OPTION) {
                return;
            }
        }
        text.setText("");
        currentFile = null;
        setTitle("MyEditor - New File");
    }

    private void openFile() {
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                FileReader fr = new FileReader(file);
                text.read(fr, null);
                fr.close();
                currentFile = file;
                setTitle("MyEditor - " + file.getName());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,
                    "Error reading file: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void saveFile() {
        if (currentFile == null) {
            int result = fileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                currentFile = fileChooser.getSelectedFile();
                setTitle("MyEditor - " + currentFile.getName());
            } else {
                return;
            }
        }
        
        try {
            FileWriter fw = new FileWriter(currentFile);
            text.write(fw);
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,
                "Error saving file: " + ex.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void printFile() {
        try {
            text.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(this,
                "Error printing: " + ex.getMessage(),
                "Print Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Build the menu bar with all menus and menu items
    public JMenuBar buildMenuBar() {
        ActionListener menuListener = new MenuActionListener();
        
        JMenuBar menuBar = new JMenuBar();
        
        // File Menu
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        
        JMenuItem newItem = new JMenuItem("New", KeyEvent.VK_N);
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        newItem.setActionCommand("NEW");
        
        JMenuItem openItem = new JMenuItem("Open...", KeyEvent.VK_O);
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        openItem.setActionCommand("OPEN");
        
        JMenuItem saveItem = new JMenuItem("Save", KeyEvent.VK_S);
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        saveItem.setActionCommand("SAVE");
        
        JMenuItem printItem = new JMenuItem("Print...", KeyEvent.VK_P);
        printItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        printItem.setActionCommand("PRINT");
        
        JMenuItem exitItem = new JMenuItem("Exit", KeyEvent.VK_X);
        exitItem.setActionCommand("EXIT");
        
        // Edit Menu
        JMenu editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E);
        
        JMenuItem selectAllItem = new JMenuItem("Select All", KeyEvent.VK_A);
        selectAllItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        selectAllItem.setActionCommand("SELECT_ALL");
        
        JMenuItem deleteItem = new JMenuItem("Delete", KeyEvent.VK_D);
        deleteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
        deleteItem.setActionCommand("DELETE");
        
        JMenuItem copyItem = new JMenuItem("Copy", KeyEvent.VK_C);
        copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        copyItem.setActionCommand("COPY");
        
        JMenuItem cutItem = new JMenuItem("Cut", KeyEvent.VK_T);
        cutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        cutItem.setActionCommand("CUT");
        
        JMenuItem pasteItem = new JMenuItem("Paste", KeyEvent.VK_P);
        pasteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        pasteItem.setActionCommand("PASTE");
        
        // Format Menu
        JMenu formatMenu = new JMenu("Format");
        formatMenu.setMnemonic(KeyEvent.VK_O);
        
        JMenuItem colorItem = new JMenuItem("Change Color...", KeyEvent.VK_C);
        colorItem.setActionCommand("CHANGE_COLOR");
        
        // Add listeners to all menu items
        JMenuItem[] items = {newItem, openItem, saveItem, printItem, exitItem,
                           selectAllItem, deleteItem, copyItem, cutItem, pasteItem,
                           colorItem};
        
        for (JMenuItem item : items) {
            item.addActionListener(menuListener);
        }
        
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(printItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        
        editMenu.add(selectAllItem);
        editMenu.add(deleteItem);
        editMenu.addSeparator();
        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);
        
        formatMenu.add(colorItem);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(formatMenu);
        
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
        MyEditor app = new MyEditor("MyEditor - New File");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}