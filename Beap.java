package beap;
import javax.swing.JOptionPane;

public class beap
{
    public static void main( String[] args )
    {
        String firstNumber = 
                JOptionPane.showInputDialog( "Enter first integer");
        String secondNumber = 
                JOptionPane.showInputDialog("Enter second integer");
        
        int number1 = Integer.parseInt( firstNumber );
        int number2 = Integer.parseInt( secondNumber );
        int sum = number1 + number2;[

        JOptionPane.showMessageDialog(null, "the sum is" + sum, "Sum of two integers", JOptionPane.PLAIN_MESSAGE);
                                      
    }
}
