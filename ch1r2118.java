import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class ch1r2118
{
   public static void main(String[] args) throws Exception
   {
      URL imageLocation = new URL(
            "http://www.hilliardschools.org/bradleyjaguars/wp-content/uploads/Hilliard-BradleyJumpitn-Jag-300x160.jpg");
      JOptionPane.showMessageDialog(null, "Go jags", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
   }
}