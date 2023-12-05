import javax.swing.*;
public class  Exercise8
{
   public static void main(String[] args)
   {
       ImageIcon bugIcon = new ImageIcon("bug.gif");
       JOptionPane.showMessageDialog(null,"There's always one more bug...",
"Funny Programming Law",
       JOptionPane.PLAIN_MESSAGE, bugIcon);
    }
}