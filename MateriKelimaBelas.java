import javax.swing.JOptionPane;
public class MateriKelimaBelas {
    public static void main(String[] args) {
        
        // obtain user input from JOptionPane
        String firstNumber =
            JOptionPane.showInputDialog("Enter First Integer");
        String secondNumber =
            JOptionPane.showInputDialog("Enter Second Integer");

        // Convert Steing inputs to int values for use in a calculation
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sum = number1 + number2;    // add numbers

        // display result in a JOptionPane message dialog
        JOptionPane.showMessageDialog(null, "This Sum Is " + sum, "Sum Of Two Integers", JOptionPane.PLAIN_MESSAGE );
    }
}
