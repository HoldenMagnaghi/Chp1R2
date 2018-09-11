import javax.swing.JOptionPane;
public class ch1r2116
{
   public static void main(String[] args)
   {
      String name = JOptionPane.showInputDialog("What is your name?");
      System.out.println(name);

      System.out.println("Hello, "+name);
   }
}