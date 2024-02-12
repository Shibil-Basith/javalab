import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class IntegerDivisionUI extends JFrame {

    private JTextField num1Field;
    private JTextField num2Field;
    private JTextField resultField;

    public IntegerDivisionUI() {
        // Set up the JFrame
        setTitle("Integer Division Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JLabel num1Label = new JLabel("Num1:");
        JLabel num2Label = new JLabel("Num2:");
        JLabel resultLabel = new JLabel("Result:");

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false); // Make result field read-only

        JButton divideButton = new JButton("Divide");
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performDivision();
            }
        });

        // Set up layout using GridLayout
        setLayout(new GridLayout(4, 2, -200, 10)); // 4 rows, 2 columns, horizontal and vertical gaps

        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(resultLabel);
        add(resultField);
        add(new JLabel()); // Empty label for spacing
        add(divideButton);
    }

    private void performDivision() {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());

            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }

            int result = num1 / num2;
            resultField.setText(Integer.toString(result));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid integers for Num1 and Num2.",
                    "Number Format Exception", JOptionPane.ERROR_MESSAGE);

        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(this, "Cannot divide by zero.",
                    "Arithmetic Exception", JOptionPane.ERROR_MESSAGE);
        }
    }
}

public class p60 {
    public static void main(String[] args) {
                new IntegerDivisionUI().setVisible(true);
         
    }
}
