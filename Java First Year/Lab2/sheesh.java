import javax.swing.JOptionPane;
public class sheesh
{
    public static void main(String[] args) {
        String milesText;
        double mph;
        double kph;
        milesText = JOptionPane.showInputDialog(null, 
        "Please enter the speed in miles per hour?");
        mph = Double.parseDouble(milesText);
        kph = 1.621 * mph;
        JOptionPane.showMessageDialog(null, mph + " mi/h = " + kph + 
" km/h");
        System.exit(0);
    }
}